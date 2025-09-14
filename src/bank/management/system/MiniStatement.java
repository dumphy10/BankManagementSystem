package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class MiniStatement extends JFrame {

    String pinnumber;

    MiniStatement(String pinnumber){
        this.pinnumber = pinnumber;

        setLayout(null);

        setTitle("Mini Statement");

        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);


    }
















    public static void main(String[] args) {
        new MiniStatement("");
    }

}
