import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author John Mark Penarubia
 */

public class HatchbackCar extends JFrame implements ActionListener{
     private JLabel lblAvailableHatchBack, lblMazda2,lblBYD, lblMazda3, lblBrio,lblToyota,lblPrice,lblPMazda2, lblPBYD, lblPMazda3,lblPBrio,lblPtoyota;
     private JLabel lblCarID,lblCarID016,lblCarID017,lblCarID018,lblCarID019,lblCarID020;
     private JButton btnback, btnnext;
     HatchbackCar(){
        setTitle("Hatchback Car");
        setSize(600,350);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     
     
    lblAvailableHatchBack=new JLabel("List of Available Hatchback Car");
    lblAvailableHatchBack.setBounds(150,20,330,30);
    lblAvailableHatchBack.setFont(new Font("Perpetua Titling MT", Font.BOLD,15));
            
    lblMazda2 = new JLabel("Mazda 2");
    lblMazda2.setBounds(227, 60, 120, 30);
    lblMazda2.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblMazda3 = new JLabel("Mazda 3");
    lblMazda3.setBounds(227, 120, 170, 30);
    lblMazda3.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblBYD = new JLabel("BYD Dolphin");
    lblBYD.setBounds(227, 90, 120, 30);
    lblBYD.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblBrio = new JLabel("Honda Brio");
    lblBrio.setBounds(227, 150, 120, 30);
    lblBrio.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblToyota = new JLabel("Toyota Wigo");
    lblToyota.setBounds(227, 180, 150, 30);
    lblToyota.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    //pricelist
    lblPrice=new JLabel("Price");
    lblPrice.setBounds(352,40,290,30);
    lblPrice.setFont(new Font("Arial", Font.BOLD,15));
     
    lblPMazda2 = new JLabel("10,000");
    lblPMazda2.setBounds(350, 60, 150, 30);
    lblPMazda2.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPBYD = new JLabel("10,000");
    lblPBYD.setBounds(350, 90, 170, 30);
    lblPBYD.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPMazda3 = new JLabel("10,000");
    lblPMazda3.setBounds(350, 120, 170, 30);
    lblPMazda3.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPBrio = new JLabel("10,000");
    lblPBrio.setBounds(350, 150, 150, 30);
    lblPBrio.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPtoyota = new JLabel("10,000");
    lblPtoyota.setBounds(350, 180, 120, 30);
    lblPtoyota.setFont(new Font("Arial", Font.PLAIN, 15));

    lblCarID = new JLabel("CAR ID");
    lblCarID.setBounds(160, 46, 80, 20);
    lblCarID.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblCarID016 = new JLabel("016");
    lblCarID016.setBounds(182, 65, 60, 20);
    lblCarID016.setFont(new Font("Arial Black", Font.BOLD, 13));
    
    lblCarID017 = new JLabel("017");
    lblCarID017.setBounds(182, 95, 70, 20);
    lblCarID017.setFont(new Font("Arial Black", Font.BOLD, 13));
    
    lblCarID018 = new JLabel("018");
    lblCarID018.setBounds(182, 125, 60, 20);
    lblCarID018.setFont(new Font("Arial Black", Font.BOLD, 13));
    
    lblCarID019 = new JLabel("019");
    lblCarID019.setBounds(182, 155, 70, 20);
    lblCarID019.setFont(new Font("Arial Black", Font.BOLD, 13));
   
    lblCarID020 = new JLabel("020");
    lblCarID020.setBounds(182, 185, 60, 20);
    lblCarID020.setFont(new Font("Arial Black", Font.BOLD, 13));
    
    btnback = new JButton("BACK");
    btnback.setBounds(170, 220, 100, 30);
    btnback.setFont(new Font("Arial", Font.BOLD, 15));
    btnback.addActionListener(this);
    
    btnnext = new JButton("NEXT");
    btnnext.setBounds(290, 220, 100, 30);
    btnnext.setFont(new Font("Arial", Font.BOLD, 15));
    btnnext.addActionListener(this);
    
    //add
    add(lblAvailableHatchBack);
    add(lblMazda2);
    add(lblMazda3);
    add(lblBYD);
    add(lblBrio);
    add(lblToyota);
    add(lblPrice);
    add(lblPMazda2);
    add(lblPBYD);
    add(lblPMazda3);
    add(lblPBrio);
    add(lblPtoyota);
    add(lblCarID);
    add(lblCarID016);
    add(lblCarID017);
    add(lblCarID018);
    add(lblCarID019);
    add(lblCarID020);
    add(btnnext);
    add(btnback);
    
}
     @Override
     public void actionPerformed(ActionEvent e){

     dispose ();
            if(e.getSource() == btnback){
            availablevehicles av = new availablevehicles();
            av.setVisible(true);
            }
             else if(e.getSource() == btnnext){
            GenerateInvoices gi = new GenerateInvoices();
            gi.setVisible(true);
        
    }
     }
}