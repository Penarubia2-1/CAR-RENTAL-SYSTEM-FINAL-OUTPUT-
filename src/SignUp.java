/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class SignUp  extends JFrame implements  ActionListener {
    private JLabel lblSignUp,lblEmail,lblAge,lblPhone,lblAddress,lblPostalcode,lblConfirmPassword,lblPassword,bg;
    private JTextField txtfldEmail = new JTextField();
    private JTextField txtfldAge = new JTextField();
    private JTextField txtfldPhone = new JTextField();
    private JTextField txtfldAddress = new JTextField();
    private JTextField txtfldPostalcode = new JTextField();
    private JPasswordField psswrdfldConfirmPassword =  new JPasswordField();
    private JPasswordField psswrdfldPassword =  new JPasswordField();
    private JButton btnSignUp,btnclear,btnback;
    
SignUp(){
    setSize(800,600);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setBackground(Color.black);
    
      //image
        bg = new JLabel();
        bg.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\gboyc\\Documents\\NetBeansProjects\\Car Rental System\\src\\imgsignup.png").getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH)));
        bg.setBounds(0, 100, 800, 600);
    
        lblSignUp = new JLabel("Sign Up",SwingConstants.CENTER);
        lblSignUp.setBounds(0,20,800,40);
        lblSignUp.setFont(new Font("Arial", Font.BOLD, 30));
        lblSignUp.setForeground(Color.white);

        lblEmail = new JLabel("Email");
        lblEmail.setBounds(50 ,80 ,100 , 30 );
        lblEmail.setFont(new Font("Arial", Font.BOLD, 20));
        lblEmail.setForeground(Color.white);

        txtfldEmail.setBounds(110,80, 190 ,30);
        txtfldEmail.setFont(new Font("Arial", Font.PLAIN, 15));

        lblPhone = new JLabel("Contact Number");
        lblPhone.setBounds(320,80,160,20);
        lblPhone.setFont(new Font("Arial", Font.BOLD, 20));
        lblPhone.setForeground(Color.white);

        txtfldPhone.setBounds(485,75,130,30);
        txtfldPhone.setFont(new Font("Arial", Font.PLAIN, 15));

        lblAge = new JLabel("Age");
        lblAge.setBounds(630 ,75, 100 ,30);
        lblAge.setFont(new Font("Arial", Font.BOLD, 20));
        lblAge.setForeground(Color.white);

        txtfldAge.setBounds(670,75,80,30);
        txtfldAge.setFont(new Font("Arial", Font.PLAIN, 15));

        lblAddress = new JLabel("Address");
        lblAddress.setBounds(50,155,100,20);
        lblAddress.setFont(new Font("Arial", Font.BOLD, 20));
        lblAddress.setForeground(Color.white);

        txtfldAddress.setBounds(145,150,300,30);
        txtfldAddress.setFont(new Font("Arial", Font.PLAIN, 15));

        lblPostalcode = new JLabel("Postal Code");
        lblPostalcode.setBounds(500,155,180,20);
        lblPostalcode.setFont(new Font("Arial", Font.BOLD, 20));
        lblPostalcode.setForeground(Color.white);

        txtfldPostalcode.setBounds(625, 150,100,30);
        txtfldPostalcode.setFont(new Font("Arial", Font.PLAIN, 15));

        lblPassword = new JLabel("Password");
        lblPassword.setBounds(50,220,100,20);
        lblPassword.setFont(new Font("Arial", Font.BOLD, 20));
        lblPassword.setForeground(Color.white);

        psswrdfldPassword.setBounds(160,220,180,30);
        psswrdfldPassword.setFont(new Font("Arial", Font.PLAIN, 15));

        lblConfirmPassword = new JLabel("Confirm Password");
        lblConfirmPassword.setBounds(360,220,200,20);
        lblConfirmPassword.setFont(new Font("Arial", Font.BOLD, 20));
        lblConfirmPassword.setForeground(Color.white);

        psswrdfldConfirmPassword.setBounds(550,220,180,30);
        psswrdfldConfirmPassword.setFont(new Font("Arial", Font.PLAIN, 15));

        btnback = new JButton("BACK");
        btnback.setBounds(130,290,150,40);
        btnback.setFont(new Font("Arial", Font.BOLD, 20));
        btnback.setForeground(Color.black);
        btnback.setBackground(Color.orange);
        btnback.addActionListener(this);
        
        btnclear = new JButton("CLEAR");
        btnclear.setBounds(350,290,130,40);
        btnclear.setFont(new Font("Arial", Font.BOLD, 20));
        btnclear.setForeground(Color.black);
        btnclear.setBackground(Color.orange);
        btnclear.addActionListener(this);
        
        btnSignUp = new JButton("SIGN UP");
        btnSignUp.setBounds(500,290,150,40);
        btnSignUp.setFont(new Font("Arial", Font.BOLD, 20));
        btnSignUp.setForeground(Color.black);
        btnSignUp.setBackground(Color.orange);
        btnSignUp.addActionListener(this);

        add(lblEmail);
        add(lblPhone);
        add(lblSignUp);
        add(lblAddress);
        add(lblPostalcode);
        add(lblPassword);
        add(lblConfirmPassword);
        add(lblAge);
        add(btnSignUp);
        add(txtfldEmail);
        add(txtfldAge);
        add(txtfldPhone);
        add(txtfldAddress);
        add(txtfldPostalcode);
        add(psswrdfldPassword);
        add(psswrdfldConfirmPassword);
        add(btnback);
        add(btnclear);
        add(bg);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnSignUp){
             try {
                int age = Integer.parseInt(txtfldAge.getText());
                if (age < 18) {
                JOptionPane.showMessageDialog(this, "You must be 18 years or older to sign up.", "Age Restriction", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Sign up successful!");
                }
            } 
                catch (NumberFormatException si) {
                JOptionPane.showMessageDialog(this, "Invalid age format.", "Error", JOptionPane.ERROR_MESSAGE);
        }
              dispose();
              Login lg=new Login();
              lg.setVisible(true);
        }
            else if(e.getSource()==btnback){
            dispose();
            ClientAdmin ca=new ClientAdmin();
            ca.setVisible(true);
        }
        else if(e.getSource()==btnclear){
            txtfldEmail.setText("");
            txtfldAge.setText("");
            txtfldPhone.setText("");
            txtfldAddress.setText("");
            txtfldPostalcode.setText("");
            psswrdfldPassword.setText("");
            psswrdfldConfirmPassword.setText("");
            
        }
}
}
