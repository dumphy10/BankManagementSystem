package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class SignupThree extends JFrame {


    SignupThree(){

        setLayout(null);

        setSize(850,820);
        setLocation(350,0);
        setVisible(true);

        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

    }









    public static void main(String[] args) {

        new SignupThree();

    }


}


