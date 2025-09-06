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

        //For writing  "Personal details (Page 1)"
        //Step4
        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);

        //Step5
        //For Name
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        //Step6
        //For Father Name
        JLabel fatherName = new JLabel("Father Name:");
        fatherName.setFont(new Font("Raleway",Font.BOLD,20));
        fatherName.setBounds(100,190,150,30);
        add(fatherName);

        //Step7
        //For DOB
        JLabel dob = new JLabel("Date Of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);





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
