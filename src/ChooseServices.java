/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
@author Imperial Jurie
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
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
        img.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\63931\\OneDrive\\Pictures\\Documents\\NetBeansProjects\\New\\CAR-RENTAL-SYSTEM-FINAL-OUTPUT-\\src\\imgservices.png").getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH)));
        img.setBounds(10,100, 500, 500);

        lblCarRentalSystem = new JLabel("CAR RENTAL SYSTEM");
        lblCarRentalSystem.setBounds(150,50,300,30);
        lblCarRentalSystem.setFont(new Font("Arial", Font.BOLD, 25));
        lblCarRentalSystem.setForeground(Color.white);

        //btn
        btnAvailableVehicle = new JButton("AVAILABLE VEHICLE");
        btnAvailableVehicle.setBounds(180,100, 200,40 );
        btnAvailableVehicle.setFont(new Font("Arial", Font.BOLD,15));
        btnAvailableVehicle.setBackground(Color.orange);
        btnAvailableVehicle.setForeground(Color.black);

        btnReservation = new JButton("RESERVATION");
        btnReservation.setBounds(180,160, 200,40);
        btnReservation.setFont(new Font("Arial", Font.BOLD,15));
        btnReservation.setBackground(Color.orange);
        btnReservation.setForeground(Color.black);
     
        btnOtherservices = new JButton("OTHER SERVICES");
        btnOtherservices.setBounds(180,220,200, 40);
        btnOtherservices.setFont(new Font("Arial", Font.BOLD,15));
        btnOtherservices.setBackground(Color.orange);
        btnOtherservices.setForeground(Color.black);
        
        btnback = new JButton("EXIT");
        btnback.setBounds(210,280,150, 30);
        btnback.setFont(new Font("Arial", Font.BOLD,15));
        btnback.setBackground(Color.orange);
        btnback.setForeground(Color.black);
     
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
          else if (e.getSource()==btnback){
           WelcomeFrame vr=new WelcomeFrame();
           vr.setVisible(true);
        }
           else if (e.getSource()==btnOtherservices){
           OtherServices os=new OtherServices();
           os.setVisible(true);
           }
}
}
     
     
     
     
     
     
     
     
     
 
        