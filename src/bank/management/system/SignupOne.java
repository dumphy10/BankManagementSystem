package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame  {

    //globally defining
    long random;
    JTextField nameTextField, fNameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pinTextField;
    JButton next;
    JRadioButton male, female, other, married, unmarried;
    JDateChooser dateChooser;


    SignupOne(){

        setLayout(null);


        //generating random no. for form no.
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L); //To get only four digit positive no.

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
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);


        //Step6
        //For Father Name
        JLabel fatherName = new JLabel("Father Name:");
        fatherName.setFont(new Font("Raleway",Font.BOLD,20));
        fatherName.setBounds(100,190,150,30);
        add(fatherName);

        //textfield
        fNameTextField = new JTextField();
        fNameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fNameTextField.setBounds(300,190,400,30);
        add(fNameTextField);

        //Step7
        //For DOB
        JLabel dob = new JLabel("Date Of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        //step16
        //adding Dob chooser
        dateChooser = new JDateChooser();
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
        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        female = new JRadioButton("Female");
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
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);

        //Step10
        //For Marital status
        JLabel maritalStatus = new JLabel("Marital Status:");
        maritalStatus.setFont(new Font("Raleway",Font.BOLD,20));
        maritalStatus.setBounds(100,390,200,30);
        add(maritalStatus);

        //Step19
        //radiobutton for marital
        married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        other = new JRadioButton("Other");
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
        next = new JButton("Next");
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
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);

        //Step12
        //For city
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        //textfield
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);

        //Step13
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

        //textfield
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);

        //Step14
        JLabel pinCode = new JLabel("Pin Code:");
        pinCode.setFont(new Font("Raleway",Font.BOLD,20));
        pinCode.setBounds(100,590,200,30);
        add(pinCode);

        //textfield
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);








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
