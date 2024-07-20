package employee.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//ragister the driver class
            c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "UK01HARSHIT");//coneection string
            s = c.createStatement();// creating statement
        } catch (Exception e) {
            e.printStackTrace();//exception error;
        }
    }    
}