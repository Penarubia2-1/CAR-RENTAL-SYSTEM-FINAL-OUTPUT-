/*
 * To change this license header, cho               ose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
author CALAGOS
 */

import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{ 
    private JLabel lblEmail,lblPassword,lblResult, lblLogin;
    private JTextField txtfldEmail = new JTextField();
    private JPasswordField psswrdfldPassword = new JPasswordField();
    private JButton btnLogin,btnCreate;
    
    Login(){
     setSize(600,500);
     setLayout(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     lblLogin = new JLabel("LOG IN YOUR ACCOUNT");
     lblLogin.setBounds(195 ,60 ,300 , 30 );
     lblLogin.setFont(new Font("Arial", Font.BOLD, 20));
     
     lblEmail = new JLabel("Email:");
     lblEmail.setBounds(100 ,140 ,90 , 30 );
     lblEmail.setFont(new Font("Arial", Font.BOLD, 20));
     
     lblPassword = new JLabel("Password:");
     lblPassword.setBounds(100 ,190 ,120 , 30 );
     lblPassword.setFont(new Font("Arial", Font.BOLD, 20));
     
     txtfldEmail.setBounds(210, 140, 240 ,30);
     txtfldEmail.setFont(new Font("Arial", Font.BOLD, 20));
     
     psswrdfldPassword.setBounds(210, 190, 240 ,30);
     psswrdfldPassword.setFont(new Font("Arial", Font.BOLD, 20));
     
     btnLogin = new JButton("LOG IN");
     btnLogin.setBounds(250,250,120,30);
     btnLogin.setFont(new Font("Arial", Font.BOLD, 18));
     
     
     btnCreate = new JButton("CREATE ACCOUNT");
     btnCreate.setBounds(200,300,220,30);
     btnCreate.setFont(new Font("Arial", Font.BOLD,18));
     
     
     
         add(lblEmail);
         add(lblPassword);
         add(txtfldEmail);
         add(psswrdfldPassword);
         add(btnLogin);
         add(btnCreate);
         add(lblLogin);
         
         setVisible(true);
         setResizable(false);
         
         btnCreate.addActionListener(this);
         btnLogin.addActionListener(this);
     
         
     
     
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if(e.getSource()==btnCreate){
            SignUp su=new SignUp();
            su.setVisible(true);
        }
        else if(e.getSource()==btnLogin){
            
        }
    }

   
     

    
    
}
