package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

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

        //Step15
        //adding text field for each...
        JTextField nameTextfield = new JTextField();
        nameTextfield.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextfield.setBounds(300,140,400,30);
        add(nameTextfield);


        //Step6
        //For Father Name
        JLabel fatherName = new JLabel("Father Name:");
        fatherName.setFont(new Font("Raleway",Font.BOLD,20));
        fatherName.setBounds(100,190,150,30);
        add(fatherName);

        //textfield
        JTextField fNameTextfield = new JTextField();
        fNameTextfield.setFont(new Font("Raleway",Font.BOLD,14));
        fNameTextfield.setBounds(300,190,400,30);
        add(fNameTextfield);

        //Step7
        //For DOB
        JLabel dob = new JLabel("Date Of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        //step16
        //adding Dob chooser
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);

        //Step8
        //For gender
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,100,30);
        add(gender);

        //Step17
        //radiobutton for gender
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(450,290,80,30);
        female.setBackground(Color.WHITE);
        add(female);

        //Step18
        //To remove the problem of selecting both radiobuttons
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);



        //Step9
        //For email
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);

        //textfield
        JTextField emailTextfield = new JTextField();
        emailTextfield.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextfield.setBounds(300,340,400,30);
        add(emailTextfield);

        //Step10
        //For Marital status
        JLabel maritalStatus = new JLabel("Marital Status:");
        maritalStatus.setFont(new Font("Raleway",Font.BOLD,20));
        maritalStatus.setBounds(100,390,200,30);
        add(maritalStatus);

        //Step19
        //radiobutton for marital
        JRadioButton married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        JRadioButton unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        JRadioButton other = new JRadioButton("Other");
        other.setBounds(600,390,100,30);
        other.setBackground(Color.WHITE);
        add(other);


        //Step20
        //To remove the problem of selecting  radiobuttons
        ButtonGroup marital = new ButtonGroup();
        marital.add(married);
        marital.add(other);
        marital.add(other);

        //Step21
        //Next button
        JButton next = new JButton("Next");
        next.setBounds(620,660,80,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        add(next);



        //Step11
        //For address
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

        //textfield
        JTextField addressTextfield = new JTextField();
        addressTextfield.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextfield.setBounds(300,440,400,30);
        add(addressTextfield);

        //Step12
        //For city
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        //textfield
        JTextField cityTextfield = new JTextField();
        cityTextfield.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextfield.setBounds(300,490,400,30);
        add(cityTextfield);

        //Step13
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

        //textfield
        JTextField stateTextfield = new JTextField();
        stateTextfield.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextfield.setBounds(300,540,400,30);
        add(stateTextfield);

        //Step14
        JLabel pinCode = new JLabel("Pin Code:");
        pinCode.setFont(new Font("Raleway",Font.BOLD,20));
        pinCode.setBounds(100,590,200,30);
        add(pinCode);

        //textfield
        JTextField pinTextfield = new JTextField();
        pinTextfield.setFont(new Font("Raleway",Font.BOLD,14));
        pinTextfield.setBounds(300,590,400,30);
        add(pinTextfield);








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
