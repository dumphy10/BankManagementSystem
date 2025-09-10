package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignupThree extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton cancel, submit;

    SignupThree(){

        setLayout(null);

        setSize(850,820);
        setLocation(350,0);
        setVisible(true);

        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);

        //radio button
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,150,20);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,250,20);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,150,20);
        add(r3);

        r4= new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,250,20);
        add(r4);

        //to remove all button clicks problem
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);

        //for card no
        JLabel card = new JLabel("Card Number");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-2451");//DUMMY CARD NO
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);

        //to show user this is ur 16 digit
        JLabel carddetail = new JLabel("Your 16 digit Card Number");//DUMMY CARD NO
        carddetail.setFont(new Font("Raleway",Font.BOLD,12));
        carddetail.setBounds(100,330,300,20);
        add(carddetail);

        //for pin
        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);

        //to show user this is ur 4 digit pin
        JLabel pindetail = new JLabel("Your 4 digit PIN ");//DUMMY CARD NO
        pindetail.setFont(new Font("Raleway",Font.BOLD,12));
        pindetail.setBounds(100,400,200,20);
        add(pindetail);

        JLabel pnumber = new JLabel("XXXX");//DUMMY CARD NO
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);

        //for services
        JLabel services = new JLabel("Services Required:");//DUMMY CARD NO
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,450,250,30);
        add(services);


        //creating checkbox for all services

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4 = new JCheckBox("Email and Sms Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);

        c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,680,580,30);
        add(c7);

        //creating button
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Raleway",Font.BOLD,12));
        cancel.setBounds(300,730,100,30);
        cancel.addActionListener(this);
        add(cancel);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway",Font.BOLD,12));
        submit.setBounds(450,730,100,30);
        submit.addActionListener(this);
        add(submit);


        getContentPane().setBackground(Color.WHITE);



    }




    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == submit){
            String accountType = null;
            if(r1.isSelected()){
                accountType = "Saving Account";
            } else if (r2.isSelected()){
                accountType = "Fixed Deposit Account";
            } else if (r3.isSelected()) {
                accountType = "Current Account";
            } else if (r4.isSelected()) {
                accountType = "Reccuring Deposit Account";
            }

            Random random = new Random();
            //for card no
            String cardno = "" + Math.abs((random.nextLong() % 90000000L)) + 5040936000000000L;
            //for pin no
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) +1000L);

            //for multiple checkbox
            //user is selecting multiple checkbox
            String facility = "";
            if (c1.isSelected()){
                facility = facility + " ATM Card";
            } else if(c2.isSelected()){
                facility = facility + " Internet Banking";
            } else if(c3.isSelected()){
                facility = facility + " Mobile Banking";
            } else if(c4.isSelected()){
                facility = facility + " EMAIL & SMS Alerts";
            } else if(c5.isSelected()){
                facility = facility + " Cheque Book";
            } else if(c6.isSelected()){
                facility = facility + " E-Statement";
            }






        } else if (e.getSource() == cancel){

        }



    }









    public static void main(String[] args) {

        new SignupThree();

    }



}


