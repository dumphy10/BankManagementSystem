package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SignupOne extends JFrame  {

    SignupOne(){

        setLayout(null);


        //generating random no. for form no.
        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L) + 1000L); //To get only four digit positive no.

        //Step3
        //Form No
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);//TO WRITE FORM NO. ON THE FRAME
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);





        //Step2
        getContentPane().setBackground(Color.WHITE);


        //Step1
        //setting frame
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }


    public static void main(String[] args) {
        new SignupOne();
    }
}
