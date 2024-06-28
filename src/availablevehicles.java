import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author John Mark Penarubia
 */
public class availablevehicles extends JFrame  implements ActionListener{
         private JLabel label = new JLabel();
        private JLabel lblAvailableVehicle, lblTypes, lblChoose;  
        private JButton btnMuscle,btnSUV,btnVan,btnHatchback,btnPickup,btnback;
        
        
       availablevehicles(){
       setTitle("Avaible Page");
       setSize(600,500);
       getContentPane().setBackground(Color.black);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLayout(null);
       

       
       lblAvailableVehicle=new JLabel("AVAILABLE TYPES OF VEHICLE",SwingConstants.CENTER);
       lblAvailableVehicle.setBounds(0,20,600,30);
       lblAvailableVehicle.setFont(new Font("Arial", Font.BOLD,18));
       lblAvailableVehicle.setForeground(Color.WHITE);
       
       lblTypes=new JLabel("CHOOSE WHAT TYPE OF CAR:",SwingConstants.CENTER);
       lblTypes.setBounds(0,45,600,30);
       lblTypes.setFont(new Font("Arial", Font.BOLD,10));
       lblTypes.setForeground(Color.WHITE);

       
       //buttons
       btnMuscle = new JButton("MUSCLE CAR");
       btnMuscle.setBounds(215,85,170,50);
       btnMuscle.setFont(new Font("Arial", Font.BOLD,15)); 
       btnMuscle.setForeground(Color.black);
       btnMuscle.setBackground(Color.orange);
      
       btnSUV = new JButton("SUV");
       btnSUV.setBounds(215,145,170,50);
       btnSUV.setFont(new Font("Arial", Font.BOLD,15));   
       btnSUV.setForeground(Color.black);
       btnSUV.setBackground(Color.orange);
      
       btnVan = new JButton("VAN");
       btnVan.setBounds(215,205,170,50);
       btnVan.setFont(new Font("Arial", Font.BOLD,15));
       btnVan.setForeground(Color.black);
       btnVan.setBackground(Color.orange);
       
        
       btnHatchback = new JButton("HATCHBACK");
       btnHatchback.setBounds(215,265,170,50);
       btnHatchback.setFont(new Font("Arial", Font.BOLD,15));
       btnHatchback.setForeground(Color.black);
       btnHatchback.setBackground(Color.orange);
      
       btnPickup = new JButton("PICKUP");
       btnPickup.setBounds(215,325,170,50);
       btnPickup.setFont(new Font("Arial", Font.BOLD,15));
       btnPickup.setForeground(Color.black);
       btnPickup.setBackground(Color.orange);
      
       btnback = new JButton("BACK");
       btnback.setBounds(249,400,110,30);
       btnback.setFont(new Font("Arial", Font.BOLD,15));
       btnback.setForeground(Color.black);
       btnback.setBackground(Color.orange);
      
       //add
       add(lblAvailableVehicle);
       add(lblTypes);
       add(btnMuscle);
       add(btnSUV);
       add(btnVan);
       add(btnHatchback);
       add(btnPickup);
       add(btnback);

       btnMuscle.addActionListener(this);
       btnSUV.addActionListener(this);
       btnVan.addActionListener(this);
       btnHatchback.addActionListener(this);
       btnPickup.addActionListener(this);
       btnback.addActionListener(this);
   }

  
    @Override
        public  void actionPerformed(ActionEvent e){
       dispose();
       if (e.getSource()==btnMuscle){
           MuscleCar mc=new MuscleCar();
           mc.setVisible(true);
       }
       if (e.getSource()==btnSUV){
           SUVCar sv= new SUVCar();
           sv.setVisible(true);
        }
       else if (e.getSource()==btnVan){
           VanCar vc= new VanCar();
           vc.setVisible(true);
         }
       else if (e.getSource()==btnHatchback){
           HatchbackCar hc= new HatchbackCar();
           hc.setVisible(true);
        }
      else if (e.getSource()==btnPickup){
           PickupCar pc= new PickupCar();
           pc.setVisible(true);
       }
      else if(e.getSource()==btnback){
          ChooseServices cs=new ChooseServices();
          cs.setVisible(true);
      }
        
        
}

}