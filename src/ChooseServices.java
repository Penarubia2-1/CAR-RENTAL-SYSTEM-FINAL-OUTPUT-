/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
@author Imperial Jurie
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
/**
 *
 * @author jurie imperial
 */
public class ChooseServices  extends JFrame implements ActionListener{
    private JLabel lblCarRentalSystem,img;
    private JButton btnAvailableVehicle,btnReservation,btnOtherservices,btnback;
   
    
    ChooseServices(){
        setTitle("Services We Offer");
        setSize(600,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        
        img = new JLabel(); 
        img.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\63931\\OneDrive\\Documents\\NetBeansProjects\\CAR-RENTAL-SYSTEM-FINAL-OUTPUT-1\\src\\imgservices.png").getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH)));
        img.setBounds(10,100, 500, 500);
        
        lblCarRentalSystem = new JLabel("CAR RENTAL SYSTEM");
     lblCarRentalSystem.setBounds(150,50,300,30);
     lblCarRentalSystem.setFont(new Font("Arial", Font.BOLD, 25));
     lblCarRentalSystem.setForeground(Color.white);
     
     
     btnAvailableVehicle = new JButton("AVAILABLE VEHICLE");
     btnAvailableVehicle.setBounds(180,100, 200,40 );
     btnAvailableVehicle.setFont(new Font("Arial", Font.BOLD,15));
     
     btnReservation = new JButton("RESERVATION");
     btnReservation.setBounds(180,160, 200,40);
     btnReservation.setFont(new Font("Arial", Font.BOLD,15));
   
     btnOtherservices = new JButton("OTHER SERVICES");
     btnOtherservices.setBounds(180,220,200, 40);
     btnOtherservices.setFont(new Font("Arial", Font.BOLD,15));
     
     btnback = new JButton("BACK");
     btnback.setBounds(210,280,150, 30);
     btnback.setFont(new Font("Arial", Font.BOLD,15));
     
     
        btnAvailableVehicle.addActionListener(this);
        btnReservation.addActionListener(this);
        btnOtherservices.addActionListener(this);
        btnback.addActionListener(this);
     
     
     add(btnOtherservices);
     add(lblCarRentalSystem);
     add(btnAvailableVehicle);
     add(btnReservation);
     add(btnback);
     add(img);
    }
    @Override
   public void actionPerformed(ActionEvent e){
       dispose();
       if (e.getSource()==btnAvailableVehicle){
           availablevehicles av=new availablevehicles();
           av.setVisible(true);
       }
        
        else if (e.getSource()==btnReservation){
           BookingReservation vr=new BookingReservation();
           vr.setVisible(true);
   }
}
}
     
     
     
     
     
     
     
     
     
 
        