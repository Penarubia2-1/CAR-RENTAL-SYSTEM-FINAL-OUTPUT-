
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 639319165346
 */



public class LoginAdmin extends JFrame implements ActionListener{ 
    private JLabel lblEmail,lblPassword,lblResult, lblLogin,lblif,bg;
    private JTextField txtfldEmail = new JTextField();
    private JPasswordField psswrdfldPassword = new JPasswordField();
    private JButton btnLogin,btnback;
    
    LoginAdmin(){
     setSize(800,600);
     setLayout(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     getContentPane().setBackground(Color.black);

      bg = new JLabel();
      bg.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\gboyc\\Documents\\NetBeansProjects\\Car Rental System\\src\\myimg.png").getImage().getScaledInstance(200, 400, Image.SCALE_SMOOTH)));
      bg.setBounds(500, 90, 200, 400);
     
     lblLogin = new JLabel("LOGIN FOR ADMIN",SwingConstants.CENTER);
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
     
   

   
     
     
     add(lblEmail);
     add(lblPassword);
     add(txtfldEmail);
     add(psswrdfldPassword);
     add(btnLogin);
    
     add(lblLogin);
 
     add(btnback);
     add(bg);
         
     
     
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
         

     
            if (e.getSource()==btnLogin){
     
            String Email = txtfldEmail.getText();
            String Password = new String(psswrdfldPassword.getPassword());
             JOptionPane.showMessageDialog(this, "Login successful!");
           
            AdminAVAILorNOT ad=new AdminAVAILorNOT();
            ad.setVisible(true);
            
            
                           
        
               
        }
        else if(e.getSource()==btnback){
            ClientAdmin  ca=new ClientAdmin();
            ca.setVisible(true);
            
        
        
}
}
}
