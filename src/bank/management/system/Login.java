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




        }



    public static void main(String[] args) {
            new Login();
    }
}
