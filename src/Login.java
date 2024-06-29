/*
 * To change this license header, cho               ose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
author CALAGOS
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.security.util.Password;

public class Login extends JFrame implements ActionListener{ 
    private JLabel lblEmail,lblPassword,lblResult, lblLogin,lblif,bg;
    private JTextField txtfldEmail = new JTextField();
    private JPasswordField psswrdfldPassword = new JPasswordField();
    private JButton btnLogin,btnCreate,btnback;
    
    Login(){
     setTitle("Log in As Client");
     setSize(800,600);
     setLayout(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     getContentPane().setBackground(Color.black);

      bg = new JLabel();
      bg.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\gboyc\\Documents\\NetBeansProjects\\Car Rental System\\src\\myimg.png").getImage().getScaledInstance(200, 400, Image.SCALE_SMOOTH)));
      bg.setBounds(500, 90, 200, 400);
     
     lblLogin = new JLabel("LOG IN YOUR ACCOUNT",SwingConstants.CENTER);
     lblLogin.setBounds(0 ,40 ,800 , 30 );
     lblLogin.setFont(new Font("Arial", Font.BOLD, 20));
     lblLogin.setForeground(Color.white);
     
     lblEmail = new JLabel("Email:");
     lblEmail.setBounds(100 ,120 ,90 , 30 );
     lblEmail.setFont(new Font("Arial", Font.BOLD, 20));
     lblEmail.setForeground(Color.white);
     
     txtfldEmail.setBounds(210, 120, 240 ,30);
     txtfldEmail.setFont(new Font("Arial", Font.BOLD, 20));
     
     lblPassword = new JLabel("Password:");
     lblPassword.setBounds(100 ,190 ,120 , 30 );
     lblPassword.setFont(new Font("Arial", Font.BOLD, 20));
     lblPassword.setForeground(Color.white);
     
     psswrdfldPassword.setBounds(210, 190, 240 ,30);
     psswrdfldPassword.setFont(new Font("Arial", Font.BOLD, 20));
     
     btnLogin = new JButton("LOG IN");
     btnLogin.setBounds(280,250,120,30);
     btnLogin.setFont(new Font("Arial", Font.BOLD, 18));
     btnLogin.setBackground(Color.orange);
     btnLogin.setForeground(Color.black);
     btnLogin.addActionListener(this);
     
     btnback = new JButton("BACK");
     btnback.setBounds(130,250,120,30);
     btnback.setFont(new Font("Arial", Font.BOLD, 18));
     btnback.setBackground(Color.orange);
     btnback.setForeground(Color.black);
     btnback.addActionListener(this);
     
     lblif = new JLabel("if you don't have an account:");
     lblif.setBounds(210 ,300 ,220 , 40 );
     lblif.setFont(new Font("Arial", Font.ITALIC, 12));
     lblif.setForeground(Color.white);
     
     btnCreate = new JButton("CREATE ACCOUNT");
     btnCreate.setBounds(160,340,220,30);
     btnCreate.setFont(new Font("Arial", Font.BOLD,18));
     btnCreate.setBackground(Color.orange);
     btnCreate.setForeground(Color.black);

     btnCreate.addActionListener(this);
     
     
     add(lblEmail);
     add(lblPassword);
     add(txtfldEmail);
     add(psswrdfldPassword);
     add(btnLogin);
     add(btnCreate);
     add(lblLogin);
     add(lblif);
     add(btnback);
     add(bg);
         
     
     
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnCreate){
            dispose();
            SignUp su=new SignUp();
            su.setVisible(true);
        }
            else if (e.getSource()==btnLogin){
            String Email = txtfldEmail.getText();
            String Password = psswrdfldPassword.getText();
            String msg = " " + Email;
            msg += " \n";
            
                 try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/1", "Jurie", "12345");

                    String query = "INSERT INTO tbl_login('" + Email + "','" + Password + "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnLogin, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnLogin,
                            "Welcome, " + msg + "Your account is sucessfully created");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            
            JOptionPane.showMessageDialog(this, "Login successful!");
            dispose();
            ChooseServices cs = new ChooseServices();
            cs.setVisible(true); 
            
            }
        
        else if(e.getSource()==btnback){
            dispose();
            ClientAdmin  ca=new ClientAdmin();
            ca.setVisible(true);
            
        
        
    }

   
     

    
    
}
}