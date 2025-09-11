package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Transactions extends JFrame {

    Transactions(){

        setLayout(null);

        //adding atm image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        //adding text on atm image
        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(225,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,16));
        image.add(text);//setting text on the image

        //adding buttons on the image
        JButton deposit = new JButton("Deposit");
        deposit.setBounds(170,415,150,30);
        image.add(deposit);

        JButton withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(355,415,150,30);
        image.add(withdrawl);

        JButton fastCash = new JButton("Fast Cash");
        fastCash.setBounds(170,450,150,30);
        image.add(fastCash);

        JButton miniStatement = new JButton("Mini Statement");
        miniStatement.setBounds(355,450,150,30);
        image.add(miniStatement);

        JButton pinChange = new JButton("Pin Change");
        pinChange.setBounds(170,485,150,30);
        image.add(pinChange);

        JButton balanceEnquiry = new JButton("Balance Enquiry");
        balanceEnquiry.setBounds(355,485,150,30);
        image.add(balanceEnquiry);

        JButton exit = new JButton("Exit");
        exit.setBounds(355,520,150,30);
        image.add(exit);







        setSize(900, 900);
        setLocation(300, 0);
        //setUndecorated(true);//remove the window decorations such as:  Title bar and Border around the frame
        setVisible(true);//setvisible should be written in the end of these lines

    }












    public static void main(String[] args) {
        new Transactions();
    }
}

