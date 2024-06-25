import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
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
    
    
    private JLabel lblVehicleModel, lbldays, lblAddress,lblContactnumber,Reservation,lblname;
    private JTextField txtfldVehicleModel = new JTextField();
    private JTextField txtflddays = new JTextField();
    private JTextField txtfldAddress = new JTextField();
    private JTextField txtfldContactnumber = new JTextField(); 
    private JTextField txtfldname = new JTextField();
    private JButton btnreserve, btnBack, btnReset;

    
    
    BookingReservation(){
    
    setSize(600, 600);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setBackground(Color.black);
    
     //image
        Reservation = new JLabel();
        Reservation.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Daiichi Magno\\Documents\\NetBeansProjects\\CAR-RENTAL-SYSTEM-FINAL-OUTPUT-\\src\\imgreservation.png").getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH)));
        Reservation.setBounds(0, 120, 600, 600);
         
    
    lblname = new JLabel("NAME:");
    lblname.setBounds(90, 50, 200, 30);
    lblname.setFont(new Font("Arial", Font.BOLD, 20));
    lblname.setForeground(Color.white);
    
    
    
    lblVehicleModel = new JLabel("VEHICLE_ID:");
    lblVehicleModel.setBounds(90, 100, 200, 30);
    lblVehicleModel.setFont(new Font("Arial", Font.BOLD, 20));
    lblVehicleModel.setForeground(Color.white);
    
    
    lbldays = new JLabel("DAYS:");
    lbldays.setBounds(90, 150, 200, 30);
    lbldays.setFont(new Font("Arial", Font.BOLD, 20));
    lbldays.setForeground(Color.white);
    
   
    lblAddress = new JLabel("ADDRESS:");
    lblAddress.setBounds(90, 200, 200, 30);
    lblAddress.setFont(new Font("Arial", Font.BOLD, 20));
    lblAddress.setForeground(Color.white);
    
    lblContactnumber = new JLabel("CONTACT NUMBER:");
    lblContactnumber.setBounds(90, 250, 200, 30);
    lblContactnumber.setFont(new Font("Arial", Font.BOLD, 20));
    lblContactnumber.setForeground(Color.white);
        
    btnBack = new JButton("Back");
    btnBack.setBounds(70, 300, 100, 30);
    btnBack.setFont(new Font("Arial", Font.BOLD, 15));
    btnBack.addActionListener(this);
    btnBack.setForeground(Color.white);
    btnBack.setBackground(Color.blue);
    
    btnReset = new JButton("clear");
    btnReset.setBounds(230, 300, 100, 30);
    btnReset.setFont(new Font("Arial", Font.BOLD, 15));
    btnReset.addActionListener(this);
    btnReset.setBackground(Color.blue);
    btnReset.setForeground(Color.WHITE);
    
    btnreserve = new JButton("Reserve");
    btnreserve.setBounds(350, 300, 100, 30);
    btnreserve.setFont(new Font("Arial", Font.BOLD, 15));
    btnreserve.addActionListener(this);
    btnreserve.setBackground(Color.blue);
    btnreserve.setForeground(Color.WHITE);
    
    txtfldname.setBounds(280, 50, 200,30);
    txtfldname.setFont(new Font("Arial", Font.PLAIN, 20));
    
    
    txtfldVehicleModel.setBounds(280, 100, 200,30);
    txtfldVehicleModel.setFont(new Font("Arial", Font.PLAIN, 20));
     
    
    txtflddays.setBounds(280, 150, 200,30);
    txtflddays.setFont(new Font("Arial", Font.PLAIN, 20));
     
    
    
    txtfldAddress.setBounds(280,200 , 200,30);
    txtfldAddress.setFont(new Font("Arial", Font.PLAIN, 20));
    
    txtfldContactnumber.setBounds(290, 250, 200,30);
    txtfldContactnumber.setFont(new Font("Arial", Font.PLAIN, 20));
   
 
    
 
 
    add(btnreserve);
    add(btnBack);
    add(lblVehicleModel);
    add(btnReset);
    add(lbldays);
    add(lblContactnumber);
    add(lblAddress);
    add(txtfldVehicleModel);
    add(txtflddays);
    add(txtfldContactnumber);
    add(txtfldAddress);
    add(Reservation);
    add(txtfldname);      
    add(lblname);
    
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
         
            if(e.getSource() == btnBack){
                dispose();
            ChooseServices cs = new ChooseServices();
            cs.setVisible(true);
    }
   else if(e.getSource() == btnReset){     
            txtfldVehicleModel.setText("");
            txtflddays.setText("");
            txtfldContactnumber.setText("");
            txtfldAddress.setText("");
            txtfldname.setText("");
            
          
           
        }
    }   
}
    