/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class WelcomeFrame extends JFrame implements ActionListener{
    JLabel bg, lblwelcome;
    JButton btnproceed;
    
    WelcomeFrame(){
        setSize(800,600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);

        bg = new JLabel();
        bg.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\63931\\OneDrive\\Pictures\\Documents\\NetBeansProjects\\New\\CAR-RENTAL-SYSTEM-FINAL-OUTPUT-\\src\\rent.jpg").getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH)));
        bg.setBounds(0, 0, 800, 600);
        
        lblwelcome = new JLabel("CAR RENTAL SYSTEM OF GROUP 6",SwingConstants.CENTER);
        lblwelcome.setBounds(0,40,800,40);
        lblwelcome.setFont(new Font("Arial", Font.BOLD, 30));
        lblwelcome.setForeground(Color.white);
        add(lblwelcome);
        
        //btn
        btnproceed = new JButton("PROCEED");
        btnproceed.setBounds(320,120,150,40);
        btnproceed.setFont(new Font("Arial", Font.BOLD, 20));
        btnproceed.setForeground(Color.black);
        btnproceed.setBackground(Color.orange);
        btnproceed.addActionListener(this);
        add(btnproceed);
        
        
        
       //add
        add(bg);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if(e.getSource()==btnproceed){
            ClientAdmin ca=new ClientAdmin();
            ca.setVisible(true);
        }
    }
    
}
