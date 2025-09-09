package bank.management.system;

import javax.swing.*;
import java.awt.*;

import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener{

    //globally defining
    JTextField   panTextField, aadharTextField;
    JButton next;
    JRadioButton yes, no;
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

        //for different religion
        String[] valReligion = {"Hindu", "Muslim", "Christian", "Sikh", "Other"};
        JComboBox rel = new JComboBox(valReligion);
        rel.setBackground(Color.WHITE);
        rel.setBounds(300,140,400,30);
        add(rel);


        //For Father Name
        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway",Font.BOLD,20));
        category.setBounds(100,190,150,30);
        add(category);

        //for different categories
        String[] catValues = {"General", "OBC", "SC", "ST", "Other"};
        JComboBox categ = new JComboBox(catValues);
        categ.setBackground(Color.WHITE);
        categ.setBounds(300,190,400,30);
        add(categ);

        //For DOB
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway",Font.BOLD,20));
        income.setBounds(100,240,200,30);
        add(income);

        //for different income
        String[] incomeValues = {"null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        JComboBox incomeField = new JComboBox(incomeValues);
        incomeField.setBackground(Color.WHITE);
        incomeField.setBounds(300,240,400,30);
        add(incomeField);

        //For educational
        JLabel educational = new JLabel("Educational:");
        educational.setFont(new Font("Raleway",Font.BOLD,20));
        educational.setBounds(100,290,200,30);
        add(educational);

        //For qualification
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway",Font.BOLD,20));
        qualification.setBounds(100,315,200,30);
        add(qualification);

        //for different qualification
        String[] eduqualiValues = {"Non Graduation", "Graduate", "Post-Graduate"};
        JComboBox eduqualificationField = new JComboBox(eduqualiValues);
        eduqualificationField.setBackground(Color.WHITE);
        eduqualificationField.setBounds(300,315,400,30);
        add(eduqualificationField);

        //For  occupation
        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway",Font.BOLD,20));
        occupation.setBounds(100,370,200,30);
        add(occupation);

        String[] occupationValues = {"Student", "Self Employed", "Business", "Corporate", "Other"};
        JComboBox occupationField = new JComboBox(occupationValues);
        occupationField.setBackground(Color.WHITE);
        occupationField.setBounds(300,370,400,30);
        add(occupationField);




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
        pan.setBounds(100,420,200,30);
        add(pan);

        //textfield
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        panTextField.setBounds(300,420,400,30);
        add(panTextField);

        //For city
        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway",Font.BOLD,20));
        aadhar.setBounds(100,470,200,30);
        add(aadhar);

        //textfield
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        aadharTextField.setBounds(300,470,400,30);
        add(aadharTextField);

        JLabel seniorcitizen = new JLabel("Senior Citizen:");
        seniorcitizen.setFont(new Font("Raleway",Font.BOLD,20));
        seniorcitizen.setBounds(100,520,200,30);
        add(seniorcitizen);

        //radiobutton for senior citizen
        yes = new JRadioButton("Yes");
        yes.setBounds(300,520,60,30);
        yes.setBackground(Color.WHITE);
        add(yes);
        no = new JRadioButton("No");
        no.setBounds(450,520,80,30);
        no.setBackground(Color.WHITE);
        add(no);

        //To remove the problem of selecting both radiobuttons
        ButtonGroup seniorcitizenGroup = new ButtonGroup();
        seniorcitizenGroup.add(yes);
        seniorcitizenGroup.add(no);



        JLabel existingaccount = new JLabel("Existing Account:");
        existingaccount.setFont(new Font("Raleway",Font.BOLD,20));
        existingaccount.setBounds(100,570,200,30);
        add(existingaccount);

        //radiobutton for existing account
        yes = new JRadioButton("Yes");
        yes.setBounds(300,570,60,30);
        yes.setBackground(Color.WHITE);
        add(yes);
        no = new JRadioButton("No");
        no.setBounds(450,570,80,30);
        no.setBackground(Color.WHITE);
        add(no);

        //To remove the problem of selecting both radiobuttons
        ButtonGroup existingaccountGroup = new ButtonGroup();
        existingaccountGroup.add(yes);
        existingaccountGroup.add(no);










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
        //String name = religionTextField.getText();//to get values from textfield
        //String fname = categoryTextField.getText();

        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        //dateChooser → This is your JDateChooser object (the date picker component).
        //dateChooser.getDateEditor() → Gets the editor (the part where the selected date is displayed).
        //getUiComponent() → Returns the actual Swing UI component used to display/edit the date.
        // For JDateChooser, this is usually a JTextField.
        //(JTextField) → Since getUiComponent() returns a generic JComponent, we cast it to JTextField.
        //getText() → Finally, retrieves the selected date as a String (whatever is typed/shown in the text field

        //now well will get values form radio button
        String gender = null;
        if(yes.isSelected()){
            gender = "Male";
        } else if(no.isSelected()) {
            gender = "Female";
        }

       // String email = qualificationTextField.getText();



        String address = panTextField.getText();
        String city = aadharTextField.getText();
        //String state = seniorcitizenTextField.getText();
       // String pin = existingaccountTextField.getText();

        //handling exception
//        try{
//            if(name.equals("")){//if name is empty
//                JOptionPane.showMessageDialog(null, "Name is required");
//            }else {
//                //make call to db
//                Conn c = new Conn();//connection established with mysql
//               // String query = "Insert into signup values('"+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+address+"', '"+city+"', '"+pin+"', '"+state+"')" ;
//               // c.s.executeUpdate(query);//then go to sql to create a table with the above column names
//
//            }
//        } catch (Exception ex) {
//            throw new RuntimeException(ex);
//        }
    }

    public static void main(String[] args) {
        new SignupTwo();

    }
}
