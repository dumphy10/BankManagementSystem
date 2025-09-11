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
        text.setBounds(235,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,16));
        image.add(text);//setting text on the image







        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);//remove the window decorations such as:  Title bar and Border around the frame
        setVisible(true);//setvisible should be written in the end of these lines

    }












    public static void main(String[] args) {
        new Transactions();
    }
}

