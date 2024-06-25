/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class SignUp  extends JFrame implements  ActionListener {
    private JFrame frame = new JFrame("SignUp");
    private JLabel lblSignUp,lblEmail,lblAge,lblPhone,lblAddress,lblPostalcode,lblConfirmPassword,lblPassword;
    
    private JTextField txtfldEmail = new JTextField();
      private JTextField txtfldAge = new JTextField();
    private JTextField txtfldPhone = new JTextField();
    private JTextField txtfldAddress = new JTextField();
    private JTextField txtfldPostalcode = new JTextField();
    private JPasswordField psswrdfldConfirmPassword =  new JPasswordField();
    private JPasswordField psswrdfldPassword =  new JPasswordField();
    private JButton btnSignUp;
    
SignUp(){
    frame.setSize(500,350);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
     lblSignUp = new JLabel("SignUp");
     lblSignUp.setBounds(160,10,200,50);
     lblSignUp.setFont(new Font("Arial", Font.BOLD, 30));
     
     lblAge = new JLabel("Age");
     lblAge.setBounds(230 ,60, 100 ,20);
     lblAge.setFont(new Font("Arial", Font.BOLD, 20));
     
     lblEmail = new JLabel("Email");
     lblEmail.setBounds(30 ,60 ,100 , 20 );
     lblEmail.setFont(new Font("Arial", Font.BOLD, 20));
     
     lblPhone = new JLabel("Phone");
     lblPhone.setBounds(320,60,100,20);
     lblPhone.setFont(new Font("Arial", Font.BOLD, 20));
     
     lblPostalcode = new JLabel("Postalcode");
     lblPostalcode.setBounds(320,130,200,20);
     lblPostalcode.setFont(new Font("Arial", Font.BOLD, 20));
     
     lblAddress = new JLabel("Address");
     lblAddress.setBounds(30,130,100,20);
     lblAddress.setFont(new Font("Arial", Font.BOLD, 20));
     
     lblPassword = new JLabel("Password");
     lblPassword.setBounds(30,200,100,20);
     lblPassword.setFont(new Font("Arial", Font.BOLD, 20));
     
     lblConfirmPassword = new JLabel("ConfirmPassword");
     lblConfirmPassword.setBounds(220,200,200,20);
     lblConfirmPassword.setFont(new Font("Arial", Font.BOLD, 20));
     
     txtfldEmail.setBounds(30,90, 180 ,30);
     txtfldEmail.setFont(new Font("Arial", Font.PLAIN, 15));
     
     txtfldAge.setBounds(230,90,80,30);
     txtfldAge.setFont(new Font("Arial", Font.PLAIN, 15));
     
     txtfldPhone.setBounds(320,90,130,30);
     txtfldPhone.setFont(new Font("Arial", Font.PLAIN, 15));
     
     txtfldAddress.setBounds(30,150,280,30);
     txtfldAddress.setFont(new Font("Arial", Font.PLAIN, 15));
     
     txtfldPostalcode.setBounds(320, 150,100,30);
     txtfldPostalcode.setFont(new Font("Arial", Font.PLAIN, 15));
     
     psswrdfldPassword.setBounds(30,220,180,30);
     psswrdfldPassword.setFont(new Font("Arial", Font.PLAIN, 15));
     
     psswrdfldConfirmPassword.setBounds(220,220,180,30);
     psswrdfldConfirmPassword.setFont(new Font("Arial", Font.PLAIN, 15));
     
     btnSignUp = new JButton("SignUp");
     btnSignUp.setBounds(180,260,150,40);
     btnSignUp.setFont(new Font("Arial", Font.BOLD, 20));
     btnSignUp.addActionListener(this);
     
     frame.add(lblEmail);
     frame.add(lblPhone);
     frame.add(lblSignUp);
     frame.add(lblAddress);
     frame.add(lblPostalcode);
     frame.add(lblPassword);
     frame.add(lblConfirmPassword);
     frame.add(lblAge);
     frame.add(btnSignUp);
     frame.add(txtfldEmail);
     frame.add(txtfldAge);
     frame.add(txtfldPhone);
     frame.add(txtfldAddress);
     frame.add(txtfldPostalcode);
     frame.add(psswrdfldPassword);
      frame.add(psswrdfldConfirmPassword);
     
          frame.setVisible(true);
          frame.setResizable(false);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnSignUp){
              Login ca=new Login();
                  ca.setVisible(true);
        }
}
}
