package bank.management.system;

import javax.swing.*;
import java.awt.*;

import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener{

    //globally defining
    JTextField religionTextField, educationalTextField, categoryTextField, occupationTextField, qualificationTextField, panTextField, aadharTextField, seniorcitizenTextField, existingaccountTextField;
    JButton next;
    JRadioButton male, female, other, married, unmarried;
    JDateChooser dateChooser;


    SignupTwo(){

        setLayout(null);

        //step1
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");


        //step2
        //For writing  "Additional details page 2"
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);

        //For Name
        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway",Font.BOLD,20));
        religion.setBounds(100,140,100,30);
        add(religion);

        //adding text field for each...
        religionTextField = new JTextField();
        religionTextField.setFont(new Font("Raleway",Font.BOLD,14));
        religionTextField.setBounds(300,140,400,30);
        add(religionTextField);


        //For Father Name
        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway",Font.BOLD,20));
        category.setBounds(100,190,150,30);
        add(category);

        //textfield
        categoryTextField = new JTextField();
        categoryTextField.setFont(new Font("Raleway",Font.BOLD,14));
        categoryTextField.setBounds(300,190,400,30);
        add(categoryTextField);

        //For DOB
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway",Font.BOLD,20));
        income.setBounds(100,240,200,30);
        add(income);

        //adding Dob chooser
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);

        //For gender
        JLabel educational = new JLabel("Educational:");
        educational.setFont(new Font("Raleway",Font.BOLD,20));
        educational.setBounds(100,290,200,30);
        add(educational);

        educationalTextField = new JTextField();
        educationalTextField.setFont(new Font("Raleway",Font.BOLD,14));
        educationalTextField.setBounds(300,290,400,30);
        add(educationalTextField);






        //For email
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway",Font.BOLD,20));
        qualification.setBounds(100,340,200,30);
        add(qualification);

        //textfield
        qualificationTextField = new JTextField();
        qualificationTextField.setFont(new Font("Raleway",Font.BOLD,14));
        qualificationTextField.setBounds(300,340,400,30);
        add(qualificationTextField);

        //For Marital status
        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway",Font.BOLD,20));
        occupation.setBounds(100,390,200,30);
        add(occupation);

        //textfield
        occupationTextField = new JTextField();
        occupationTextField.setFont(new Font("Raleway",Font.BOLD,14));
        occupationTextField.setBounds(300,390,400,30);
        add(occupationTextField);




        //To remove the problem of selecting  radiobuttons
        ButtonGroup marital = new ButtonGroup();
        marital.add(married);
        marital.add(other);
        marital.add(other);

        //Next button
        next = new JButton("Next");
        next.setBounds(620,660,80,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.addActionListener(this);
        add(next);



        //For address
        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        pan.setBounds(100,440,200,30);
        add(pan);

        //textfield
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);

        //For city
        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway",Font.BOLD,20));
        aadhar.setBounds(100,490,200,30);
        add(aadhar);

        //textfield
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        aadharTextField.setBounds(300,490,400,30);
        add(aadharTextField);

        JLabel seniorcitizen = new JLabel("Senior Citizen:");
        seniorcitizen.setFont(new Font("Raleway",Font.BOLD,20));
        seniorcitizen.setBounds(100,540,200,30);
        add(seniorcitizen);

        //textfield
        seniorcitizenTextField = new JTextField();
        seniorcitizenTextField.setFont(new Font("Raleway",Font.BOLD,14));
        seniorcitizenTextField.setBounds(300,540,400,30);
        add(seniorcitizenTextField);

        JLabel existingaccount = new JLabel("Existing Account:");
        existingaccount.setFont(new Font("Raleway",Font.BOLD,20));
        existingaccount.setBounds(100,590,200,30);
        add(existingaccount);

        //textfield
        existingaccountTextField = new JTextField();
        existingaccountTextField.setFont(new Font("Raleway",Font.BOLD,14));
        existingaccountTextField.setBounds(300,590,400,30);
        add(existingaccountTextField);








        getContentPane().setBackground(Color.WHITE);


        //setting frame
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }





    //whenever the user performs an action (like clicking a button), the actionPerformed() method is triggered.
    //we will add data to db
    @Override
    public void actionPerformed(ActionEvent e) {
         //long
        String name = religionTextField.getText();//to get values from textfield
        String fname = categoryTextField.getText();

        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        //dateChooser → This is your JDateChooser object (the date picker component).
        //dateChooser.getDateEditor() → Gets the editor (the part where the selected date is displayed).
        //getUiComponent() → Returns the actual Swing UI component used to display/edit the date.
        // For JDateChooser, this is usually a JTextField.
        //(JTextField) → Since getUiComponent() returns a generic JComponent, we cast it to JTextField.
        //getText() → Finally, retrieves the selected date as a String (whatever is typed/shown in the text field

        //now well will get values form radio button
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        } else if(female.isSelected()) {
            gender = "Female";
        }

        String email = qualificationTextField.getText();

        String maritalStatus = null;
        if(married.isSelected()){
            maritalStatus = "Married";
        } else if (unmarried.isSelected()) {
            maritalStatus = "Unmarried";
        } else if (other.isSelected()) {
            maritalStatus = "Other";
        }

        String address = panTextField.getText();
        String city = aadharTextField.getText();
        String state = seniorcitizenTextField.getText();
        String pin = existingaccountTextField.getText();

        //handling exception
        try{
            if(name.equals("")){//if name is empty
                JOptionPane.showMessageDialog(null, "Name is required");
            }else {
                //make call to db
                Conn c = new Conn();//connection established with mysql
                String query = "Insert into signup values('"+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+maritalStatus+"', '"+address+"', '"+city+"', '"+pin+"', '"+state+"')" ;
                c.s.executeUpdate(query);//then go to sql to create a table with the above column names

            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) {
        new SignupTwo();

    }
}
