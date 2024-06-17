import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daiichi Magno
 */
public class BookingReservation  extends JFrame implements ActionListener {
    
     private JFrame f = new JFrame("Reservation");
    private JLabel lblVehicleModel, lbldays, lblAddress,lblContactnumber;
    private JTextField txtfldVehicleModel = new JTextField();
    private JTextField txtflddays = new JTextField();
       private JTextField txtfldAddress = new JTextField();
       private JTextField txtfldContactnumber = new JTextField(); 

    private JButton btnNext, btnBack;

    
    
    BookingReservation(){
    
    f.setSize(600, 350);
    f.setLayout(null);
    f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    
    lblVehicleModel = new JLabel("Vehicle ID:");
    lblVehicleModel.setBounds(90, 50, 200, 30);
    lblVehicleModel.setFont(new Font("Arial", Font.BOLD, 20));
    
    lbldays = new JLabel("Days:");
    lbldays.setBounds(90, 100, 200, 30);
    lbldays.setFont(new Font("Arial", Font.BOLD, 20));
  
    
   
    lblAddress = new JLabel("Address:");
    lblAddress.setBounds(90, 150, 200, 30);
    lblAddress.setFont(new Font("Arial", Font.BOLD, 20));
    
    lblContactnumber = new JLabel("Contactnumber:");
    lblContactnumber.setBounds(90, 200, 200, 30);
    lblContactnumber.setFont(new Font("Arial", Font.BOLD, 20));
        
    btnNext = new JButton("Next");
    btnNext.setBounds(170, 250, 100, 30);
    btnNext.setFont(new Font("Arial", Font.BOLD, 15));
    btnNext.addActionListener(this);
   
    btnBack = new JButton("Back");
    btnBack.setBounds(290, 250, 100, 30);
    btnBack.setFont(new Font("Arial", Font.BOLD, 15));
    btnBack.addActionListener(this);
    
    txtfldVehicleModel.setBounds(250, 50, 200,30);
    txtfldVehicleModel.setFont(new Font("Arial", Font.PLAIN, 20));
    
    txtflddays.setBounds(250, 100, 200,30);
    txtflddays.setFont(new Font("Arial", Font.PLAIN, 20));
    
    
    txtfldAddress.setBounds(250,150 , 200,30);
    txtfldAddress.setFont(new Font("Arial", Font.PLAIN, 20));
    
    txtfldContactnumber.setBounds(250, 200, 200,30);
    txtfldContactnumber.setFont(new Font("Arial", Font.PLAIN, 20));
   
 
    
 
 
    f.add(btnNext);
    f.add(btnBack);
    f.add(lblVehicleModel);
    f.add(lbldays);
    f.add(lblContactnumber);
    f.add(lblAddress);
    f.add(txtfldVehicleModel);
    f.add(txtflddays);
    f.add(txtfldContactnumber);
    f.add(txtfldAddress);
            
    f.setVisible(true);
    f.setResizable(false);
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnNext){
            JFrame frame2 = new JFrame("");
            frame2.setVisible(true);
            frame2.setSize(450,400);
            JLabel label = new JLabel("");
            JPanel panel = new JPanel();
            frame2.add(panel);
            panel.add(label);
                   
 
        }else if(e.getSource() == btnBack){
           JFrame frame3 = new JFrame("");
            frame3.setVisible(true);
            frame3.setSize(450,400);
            JLabel label = new JLabel("");
            JPanel panel = new JPanel();
            frame3.add(panel);
            panel.add(label);
            
           
        }
    }   
    }