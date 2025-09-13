package bank.management.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    public Conn() {

        //JDBC steps to connect to Database
        try{
            // Step1 to Register driver
            //Class.forName(com.mysql.cj.jdbc.Driver);//optional step

            //Step2 create connection
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "12345");

            //Step3 create statement
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
