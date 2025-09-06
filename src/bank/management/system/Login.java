package bank.management.system;

import javax.swing.*; //contains JFrame
import java.awt.*; //contains Image class

public class Login extends JFrame {
        Login(){

            //step2
            setTitle("AUTOMATED TELLER MACHINE");
            setLayout(null);//we will use our custom Layout

            //step1
            setSize(800,480);//set dimension of frame(length and breadth)
            setVisible(true); //by default frame is not visible so we have to make it visible
            setLocation(350,200);//by default when the frame starts it starts from top left, so to start from centre we used se location

            //step3
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));//to load the image
            Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);//to scale image / set dimension for image
            ImageIcon i3 = new ImageIcon(i2);//
            JLabel label =new JLabel(i3);// Put image inside JLabel
            add(label);// Add JLabel to frame
            label.setBounds(70,10,100,100);//to set location for label

            //step6
            getContentPane().setBackground(Color.WHITE);//setting frame color,  getContentPane() holds the whole fram



        }



    public static void main(String[] args) {
            new Login();
    }
}
