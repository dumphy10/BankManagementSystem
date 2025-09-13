package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class PinChange extends JFrame {

    PinChange(String pinchange){
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);


        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,16));
        text.setBounds(250,280,500,35);
        image.add(text);

        JLabel pinText = new JLabel("NEW PIN:");
        pinText.setForeground(Color.WHITE);
        pinText.setFont(new Font("System", Font.BOLD,16));
        pinText.setBounds(165,320,180,25);
        image.add(pinText);

        JTextField pin = new JTextField();
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        pin.setBounds(330,320,180,25);
        image.add(pin);

        JLabel repinText = new JLabel("Re-Enter PIN:");
        repinText.setForeground(Color.WHITE);
        repinText.setFont(new Font("System", Font.BOLD,16));
        repinText.setBounds(165,360,180,25);
        image.add(repinText);

        JTextField repin = new JTextField();
        repin.setFont(new Font("Raleway",Font.BOLD,25));
        repin.setBounds(330,360,180,25);
        image.add(repin);

        JButton change = new JButton("CHANGE");
        change.setBounds(355,485,150,30);
        image.add(change);

        JButton back = new JButton("BACK");
        back.setBounds(355,520,150,30);
        image.add(back);













        setSize(900,900);
        setLocation(300,0);
        setVisible(true);


    }









    public static void main(String[] args) {
        new PinChange("").setVisible(true);
    }
}
