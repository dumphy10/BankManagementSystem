package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class MiniStatement extends JFrame {


    MiniStatement(String pinnumber){

        setLayout(null);

        setTitle("Mini Statement");

        JLabel text = new JLabel();//we will insert value dynamically
        add(text);

        JLabel bank = new JLabel("Spring Bank");
        bank.setBounds(150,20,100,20);
        add(bank);

        JLabel card = new JLabel();
        card.setBounds(20,80,300,20);
        add(card);

        try{

            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from login where pin = '"+pinnumber+"' ");

            while(rs.next()){
                card.setText("Card Number: " + rs.getString("cardNumber").substring(0, 4) + "XXXXXXXX" + rs.getString("cardNumber").substring(12));//to put values in labels using setText


            }





        } catch (Exception e) {
            System.out.println(e);
        }













        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);


    }
















    public static void main(String[] args) {
        new MiniStatement("");
    }

}
