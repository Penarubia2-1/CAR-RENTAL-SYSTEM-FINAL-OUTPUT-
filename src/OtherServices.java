
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class OtherServices extends JFrame implements ActionListener{
    JLabel lblWeoffer,lblitincludes,lblMaintenance;
    JButton btnMaintenance,btnrepair,btnback,btnlogout;
    
     OtherServices(){
       setTitle("Avaible Page");
       setSize(600,500);
       getContentPane().setBackground(Color.black);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLayout(null);
       
       lblWeoffer=new JLabel("WE ALSO OFFER OTHER SERVICES!",SwingConstants.CENTER);
       lblWeoffer.setBounds(0,30,600,30);
       lblWeoffer.setFont(new Font("Arial", Font.BOLD,18));
       lblWeoffer.setForeground(Color.WHITE);
       add(lblWeoffer);
       
       lblitincludes=new JLabel("CHOOSE WHAT TYPE OF SERVICES:",SwingConstants.CENTER);
       lblitincludes.setBounds(0,50,600,30);
       lblitincludes.setFont(new Font("Arial", Font.BOLD,10));
       lblitincludes.setForeground(Color.WHITE);
       add(lblitincludes);
       
       //btn
       btnMaintenance = new JButton("MAINTENANCE & REPAIR");
       btnMaintenance.setBounds(165,135,250,50);
       btnMaintenance.setFont(new Font("Arial", Font.BOLD,15)); 
       btnMaintenance.setForeground(Color.black);
       btnMaintenance.setBackground(Color.orange);
       add(btnMaintenance);
       btnMaintenance.addActionListener(this);
      
      
      
      
       btnback = new JButton("BACK");
       btnback.setBounds(110,265,140,30);
       btnback.setFont(new Font("Arial", Font.BOLD,15));
       btnback.setForeground(Color.black);
       btnback.setBackground(Color.orange);
       add(btnback);
       btnback.addActionListener(this);
      
       btnlogout = new JButton("LOG OUT");
       btnlogout.setBounds(320,265,140,30);
       btnlogout.setFont(new Font("Arial", Font.BOLD,15));
       btnlogout.setForeground(Color.black);
       btnlogout.setBackground(Color.orange);
       add(btnlogout);
       btnlogout.addActionListener(this);
       setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if(e.getSource()==btnback){
            dispose();
            ChooseServices cs=new ChooseServices();
            cs.setVisible(true);
        }
        else if(e.getSource()==btnlogout){
            dispose();
            WelcomeFrame wf=new WelcomeFrame();
            wf.setVisible(true);
        }
        else if(e.getSource()==btnMaintenance){
            maintenance mn=new maintenance();
            mn.setVisible(true);
        }
    }
public static void main(String[] args) {
    new OtherServices();
}
}

    
