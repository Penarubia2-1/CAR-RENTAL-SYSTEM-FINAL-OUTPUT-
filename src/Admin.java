/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
public class Admin extends JFrame implements ActionListener {
    JLabel lblHiAdmin;
    JButton btnexit;
    Admin(){
        setTitle("Hi Admin!");
        setSize(1000,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        lblHiAdmin=new JLabel("You Are Admin!");
        lblHiAdmin.setBounds(400, 30, 150, 80);
        lblHiAdmin.setFont(new Font("Arial", Font.BOLD,15));

        
        btnexit=new JButton("EXIT");
        btnexit.setBounds(500,500,80,60);
        
        //add
        add(lblHiAdmin);
        add(btnexit);
        
        //add
        btnexit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if(e.getSource()==btnexit){
            
            ClientAdmin ca=new ClientAdmin();
            ca.setVisible(true);
        }
     }

       
}
