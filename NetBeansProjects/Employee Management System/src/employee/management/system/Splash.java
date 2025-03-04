package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener {
    Splash(){
        getContentPane().setBackground(Color.black);
        setLayout(null);
        
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(40,30,1200,60);
        heading.setFont(new Font("serif",Font.BOLD,60));
        heading.setForeground(Color.RED);
        add(heading);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50,100,1050,500);
        add(image);
        
        JButton clickhere  = new JButton("CLICK HERE TO CONTINUE ");
        clickhere.setBounds(400,400,300,70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.setFont(new Font("Arial",Font.BOLD,15));
        clickhere.addActionListener(this);
        image.add(clickhere);
        
        
        setSize(1170,650);
        setLocation(200,50);
        setVisible(true);
        
        while(true) {
            heading.setVisible(true);
            try {
                Thread.sleep(1900);
            } catch (Exception e){
                
            }
            
            heading.setVisible(false);
            try {
                Thread.sleep(700);
            } catch (Exception e){
                
            }
        }
    }
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }
    public static void main(String args[]){
        new Splash();
    }
    
}
