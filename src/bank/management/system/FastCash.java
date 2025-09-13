package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JButton hundred, fiveHundred, twoThousand, oneThousand, fiveThousand, tenThousand, back;

    String pinnumber;
    FastCash(String pinnumber){
        this.pinnumber = pinnumber;

        setLayout(null);

        //adding atm image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        //adding text on atm image
        JLabel text = new JLabel("SELECT WITHDRAWAL AMOUNT");
        text.setBounds(225,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,16));
        image.add(text);//setting text on the image

        //adding buttons on the image
        hundred = new JButton("Rs 100");
        hundred.setBounds(170,415,150,30);
        hundred.addActionListener(this);
        image.add(hundred);

        fiveHundred = new JButton("Rs 500");
        fiveHundred.setBounds(355,415,150,30);
        fiveHundred.addActionListener(this);
        image.add(fiveHundred);

        oneThousand = new JButton("Rs 1000");
        oneThousand.setBounds(170,450,150,30);
        oneThousand.addActionListener(this);
        image.add(oneThousand);

        twoThousand = new JButton("Rs 2000");
        twoThousand.setBounds(355,450,150,30);
        twoThousand.addActionListener(this);
        image.add(twoThousand);

        fiveThousand = new JButton("Rs 5000");
        fiveThousand.setBounds(170,485,150,30);
        fiveThousand.addActionListener(this);
        image.add(fiveThousand);

        tenThousand = new JButton("Rs 10000");
        tenThousand.setBounds(355,485,150,30);
        tenThousand.addActionListener(this);
        image.add(tenThousand);

        back = new JButton("BACK");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);







        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);//remove the window decorations such as:  Title bar and Border around the frame
        setVisible(true);//setvisible should be written in the end of these lines

    }





    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == back){
            setVisible(false);//frame will be closed on clicking back button
            new Transactions(pinnumber).setVisible(true);
        } else {
            //if any other button is clicked
            String amount = ((JButton)e.getSource()).getText().substring(3);//we want only eg 500 not Rs 500 so subString(3) will remove the first three character
            Conn c = new Conn();
            try{
                //checking if there is sufficient balance in account or not to withdraw
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"' ");//using pinumber we will get the data from bank and we will calculate balance amount
                int balance = 0;
                while(rs.next()){//to loop each row in bank table to get balance

                    if(rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));//if user deposit money

                    } else {
                        balance -= Integer.parseInt(rs.getString("amount"));// if user withdraws money
                    }
                }

                    //to check that is exit button is not clicked
                    //and What if user wants to withdraw money greater than the balance
                    if(e.getSource() != back && balance < Integer.parseInt(amount)){
                        JOptionPane.showMessageDialog(null,"Insufficient Balance");
                        return;
                    }
                        //else if balance is greater than the withdrawl amount
                        Date date = new Date();
                        String query = "insert into bank values('" + pinnumber + "', '" + date + "', 'Withdraw', '" + amount + "')";
                        c.s.executeUpdate(query);
                        JOptionPane.showMessageDialog(null, "Rs "+ amount +" Debited Successfully");

                        setVisible(false);
                        new Transactions(pinnumber).setVisible(true);


            } catch (Exception ae) {
                System.out.println(ae);
            }
        }


    }






    public static void main(String[] args) {
        new FastCash("");
    }


}

