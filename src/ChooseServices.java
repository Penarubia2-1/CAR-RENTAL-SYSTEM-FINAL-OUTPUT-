/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
@author Imperial Jurie
 */

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
/**
 *
 * @author jurie imperial
 */
public class ChooseServices  extends JFrame implements ActionListener{
    private JLabel lblCarRentalSystem;
    private JButton btnAvailableVehicle,btnReservation,btnOtherservices,btnback;
   
    
    ChooseServices(){
        setTitle("Services We Offer");
        setSize(600,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
     lblCarRentalSystem = new JLabel("CAR RENTAL SYSTEM");
     lblCarRentalSystem.setBounds(150,50,300,30);
     lblCarRentalSystem.setFont(new Font("Arial", Font.BOLD, 25));
     
     
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
     btnback.setBounds(210,300,150, 30);
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
     
     
     
     
     
     
     
     
     
 
        