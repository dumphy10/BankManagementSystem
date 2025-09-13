package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class BalanceEnquiry extends JFrame {

    JButton back;

    String pinnumber;

    BalanceEnquiry(String pinnumber){
        this.pinnumber=pinnumber;

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 =i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        back = new JButton("Back");
        back.setBounds(355,520,150,30);
        image.add(back);



        setSize(900,900);
        setLocation(300,0);
        setVisible(true);







    }





    public static void main(String[] args) {
        new BalanceEnquiry("");
    }

}


