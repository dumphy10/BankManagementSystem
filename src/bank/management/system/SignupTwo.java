package bank.management.system;

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener{

    //globally defining
    JTextField   panTextField, aadharTextField;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox rel, categ, incom, eduqualification, occupat;
    String formno;


    SignupTwo(String formno){
        this.formno = formno;


        setLayout(null);

        //step1
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");


        //step2
        //For writing  "Additional details page 2"
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);

        //For religion
        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway",Font.BOLD,20));
        religion.setBounds(100,140,100,30);
        add(religion);

        //for different religion
        String[] valReligion = {"Hindu", "Muslim", "Christian", "Sikh", "Other"};
        rel = new JComboBox(valReligion);
        rel.setBackground(Color.WHITE);
        rel.setBounds(300,140,400,30);
        add(rel);


        //For category Name
        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway",Font.BOLD,20));
        category.setBounds(100,190,150,30);
        add(category);

        //for different categories
        String[] catValues = {"General", "OBC", "SC", "ST", "Other"};
        categ = new JComboBox(catValues);
        categ.setBackground(Color.WHITE);
        categ.setBounds(300,190,400,30);
        add(categ);

        //For income
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway",Font.BOLD,20));
        income.setBounds(100,240,200,30);
        add(income);

        //for different income
        String[] incomeValues = {"null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        incom = new JComboBox(incomeValues);
        incom.setBackground(Color.WHITE);
        incom.setBounds(300,240,400,30);
        add(incom);

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

        //for different educational qualification
        String[] eduqualiValues = {"Non Graduation", "Graduate", "Post-Graduate"};
        eduqualification = new JComboBox(eduqualiValues);
        eduqualification.setBackground(Color.WHITE);
        eduqualification.setBounds(300,315,400,30);
        add(eduqualification);

        //For  occupation
        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway",Font.BOLD,20));
        occupation.setBounds(100,370,200,30);
        add(occupation);

        String[] occupationValues = {"Student", "Self Employed", "Business", "Corporate", "Other"};
        occupat = new JComboBox(occupationValues);
        occupat.setBackground(Color.WHITE);
        occupat.setBounds(300,370,400,30);
        add(occupat);




        //Next button
        next = new JButton("Next");
        next.setBounds(620,660,80,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.addActionListener(this);
        add(next);



        //For PAN
        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        pan.setBounds(100,420,200,30);
        add(pan);

        //textfield
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        panTextField.setBounds(300,420,400,30);
        add(panTextField);

        //For Aadhar
        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway",Font.BOLD,20));
        aadhar.setBounds(100,470,200,30);
        add(aadhar);

        //textfield
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        aadharTextField.setBounds(300,470,400,30);
        add(aadharTextField);

        //For senior
        JLabel seniorcitizen = new JLabel("Senior Citizen:");
        seniorcitizen.setFont(new Font("Raleway",Font.BOLD,20));
        seniorcitizen.setBounds(100,520,200,30);
        add(seniorcitizen);

        //radiobutton for senior citizen
        syes = new JRadioButton("Yes");
        syes.setBounds(300,520,60,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        sno = new JRadioButton("No");
        sno.setBounds(450,520,80,30);
        sno.setBackground(Color.WHITE);
        add(sno);

        //To remove the problem of selecting both radiobuttons
        ButtonGroup seniorcitizenGroup = new ButtonGroup();
        seniorcitizenGroup.add(syes);
        seniorcitizenGroup.add(sno);


        //For existing
        JLabel existingaccount = new JLabel("Existing Account:");
        existingaccount.setFont(new Font("Raleway",Font.BOLD,20));
        existingaccount.setBounds(100,570,200,30);
        add(existingaccount);

        //radiobutton for existing account
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,570,60,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        eno = new JRadioButton("No");
        eno.setBounds(450,570,80,30);
        eno.setBackground(Color.WHITE);
        add(eno);

        //To remove the problem of selecting both radiobuttons
        ButtonGroup existingaccountGroup = new ButtonGroup();
        existingaccountGroup.add(eyes);
        existingaccountGroup.add(eno);


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
        String sreligion = (String) rel.getSelectedItem();//to get values from religion
        String scategory = (String) categ.getSelectedItem();//object so we are typecasting to string
        String sincome = (String) incom.getSelectedItem();
        String seduquali = (String) eduqualification.getSelectedItem();
        String soccu = (String)  occupat.getSelectedItem();
        String span = panTextField.getText();
        String saadhar = aadharTextField.getText();


        //(JTextField) → Since getUiComponent() returns a generic JComponent, we cast it to JTextField.
        //getText() → Finally, retrieves the selected date as a String (whatever is typed/shown in the text field

        //for senior citizen
        //now well will get values form radio button
        String seniorcitizenGroup = null;
        if(syes.isSelected()){
            seniorcitizenGroup = "Yes";
        } else if(sno.isSelected()) {
            seniorcitizenGroup = "No";
        }

        //for Existing account
        //now well will get values form radio button
        String existingaccountGroup = null;
        if(eyes.isSelected()){
            existingaccountGroup = "Yes";
        } else if(eno.isSelected()) {
            existingaccountGroup = "No";
        }







        //handling exception
//        try{
//
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
        new SignupTwo("");

    }
}
