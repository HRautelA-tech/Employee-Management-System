package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//for actionListener
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JTextField tfusername, tfpassword; // globley declaered
    
    Login() {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        //labelfor username
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 30);
        add(lblusername);
        
        //textfield for username
        tfusername = new JTextField();
        tfusername.setBounds(150, 20, 150, 30);
        add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 70, 100, 30);
        add(lblpassword);
        
        tfpassword = new JTextField();
        tfpassword.setBounds(150, 70, 150, 30);
        add(tfpassword);
        
        //login button
        JButton login = new JButton("LOGIN");
        login.setBounds(150, 140, 150, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);//take response in clicking button
        add(login);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);
        
        setSize(600, 300);
        setLocation(450, 200);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        //this function work when button clicked
        try {
            String username = tfusername.getText();//getText gives value of texted field
            String password = tfpassword.getText();
            
            Conn c = new Conn();
            String query = "select * from login where username = '"+username+"' and password = '"+password+"'";//making query
            
            ResultSet rs = c.s.executeQuery(query);//executing query and storing in resultSet part of import java.sql.*;
            if (rs.next()) {
                setVisible(false);
                JOptionPane.showMessageDialog(null, " Welcome to Employee Management System ");
                new Home();//accessing home page
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");//for popup mmg
                
            }
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}