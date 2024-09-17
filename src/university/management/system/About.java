package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 300, 200);
        add(image);
        
        JLabel heading = new JLabel("<html>University<br/>Management System</html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel(" Team members: 1.Joed Thomas Jackson 2260373");
        name.setBounds(0, 220, 600, 50);
        name.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(name);
        
       
        JLabel name1 = new JLabel("  2.Seikh Sahabuddin Mohammed 2260440");
        name1.setBounds(100, 250, 600, 50);
        name1.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(name1);
        
         JLabel name2 = new JLabel("  3.Mainak Saha 2260394 ");
        name2.setBounds(100, 280, 600, 50);
        name2.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(name2);
        
        
        JLabel rollno = new JLabel("Class: 4BTCS B ");
        rollno.setBounds(70, 320, 550, 40);
        rollno.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(rollno);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}
