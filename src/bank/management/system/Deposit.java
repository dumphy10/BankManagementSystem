package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Deposit extends JFrame {

    Deposit(){

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text = new JLabel("Enter the amount you want to deposit");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(190,300,400,20);
        image.add(text);

        JTextField amount = new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        amount.setBounds(190,350,295,25);
        image.add(amount);

        JButton deposit = new JButton("Deposit");
        deposit.setBounds(355,485,150,30);
        image.add(deposit);

        JButton back = new JButton("Back");
        back.setBounds(355,520,150,30);
        image.add(back);





        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);




    }













    public static void main(String[] args) {
        new Deposit();
    }

}
