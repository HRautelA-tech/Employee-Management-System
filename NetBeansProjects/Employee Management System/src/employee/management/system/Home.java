package employee.management.system;

import javax.swing.*;
import java.awt.*;//for image
import java.awt.event.*;//action listener

public class Home extends JFrame implements ActionListener{

    JButton add, view, update, remove;
    
    Home() {
        
        setLayout(null);//no need of swing layout
        
        
        //image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);//image size will be same as freams
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1120, 630);
        add(image);
        
        JLabel heading = new JLabel("Employee Details");
        heading.setBounds(710, 30, 400, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        heading.setForeground(Color.BLACK);
        image.add(heading);
        
        
        //buttons
        add = new JButton("Add ");
        add.setBounds(650, 90, 150, 40);
          add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setFont(new Font("Arial",Font.BOLD,13));
        add.addActionListener(this);//click  event
        image.add(add);
        
        view = new JButton("View");
        view.setBounds(820, 90, 150, 40);
        view.setBackground(Color.BLACK);
        view.setForeground(Color.WHITE);
        view.setFont(new Font("Arial",Font.BOLD,13));
        view.addActionListener(this);//click  event
        image.add(view);
        
        update = new JButton("Update");
        update.setBounds(650, 140, 150, 40);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.setFont(new Font("Arial",Font.BOLD,13));
        update.addActionListener(this);//click  event
        image.add(update);
        
        remove = new JButton("Remove");
        remove.setBounds(820, 140, 150, 40);
        remove.setBackground(Color.BLACK);
        remove.setForeground(Color.WHITE);
        remove.setFont(new Font("Arial",Font.BOLD,13));
        remove.addActionListener(this);//click  event
        image.add(remove);
        
        setSize(1120, 630);
        setLocation(250, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        //getsource tells click event source
        if (ae.getSource() == add) {
            setVisible(false);
            new AddEmployee();
        } else if (ae.getSource() == view) {
            setVisible(false);  
            new ViewEmployee();
        } else if (ae.getSource() == update) {
            setVisible(false);
            new ViewEmployee();
        } else {
            setVisible(false);
            new RemoveEmployee();
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}