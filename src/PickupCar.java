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

public class PickupCar extends JFrame implements ActionListener{
     private JLabel lblAvailablePickup, lblRanger, lblToyota, lblIsuzuD,lblNavarra,lblfoton,lblPrice,lblPRanger,lblPToyota, lblPIsuzuD,lblPNavarra,lblPfoton;
      private JLabel lblCarID,lblCarID021,lblCarID022,lblCarID023,lblCarID024,lblCarID025;
     private JButton btnback, btnnext;
     PickupCar(){

        setSize(550,350);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    lblAvailablePickup=new JLabel("List of Available Pickup Car");
    lblAvailablePickup.setBounds(180,20,280,30);
    lblAvailablePickup.setFont(new Font("Perpetua Titling MT", Font.BOLD,15));
            
    lblRanger = new JLabel("Ford Ranger");
    lblRanger.setBounds(210, 60, 120, 30);
    lblRanger.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblToyota = new JLabel("Toyota Hilux");
    lblToyota.setBounds(210, 120, 170, 30);
    lblToyota.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblIsuzuD = new JLabel("Isuzu D-Max");
    lblIsuzuD.setBounds(210, 90, 170, 30);
    lblIsuzuD.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    
    lblNavarra= new JLabel("Nissan Navara");
    lblNavarra.setBounds(210, 150, 160, 30);
    lblNavarra.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblfoton = new JLabel("Foton Thunder");
    lblfoton.setBounds(210, 180, 150, 30);
    lblfoton.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    //pricelist
    lblPrice=new JLabel("Price");
    lblPrice.setBounds(353,42,200,30);
    lblPrice.setFont(new Font("Arial", Font.BOLD,15));
    
    lblPRanger = new JLabel("10,000");
    lblPRanger.setBounds(350, 60, 180, 30);
    lblPRanger.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPToyota = new JLabel("10,000");
    lblPToyota.setBounds(350, 90, 170, 30);
    lblPToyota.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPIsuzuD = new JLabel("10,000");
    lblPIsuzuD.setBounds(350, 120, 150, 30);
    lblPIsuzuD.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPNavarra = new JLabel("10,000");
    lblPNavarra.setBounds(350, 150, 190, 30);
    lblPNavarra.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPfoton = new JLabel("10,000");
    lblPfoton.setBounds(350, 180, 180, 30);
    lblPfoton.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblCarID = new JLabel("CAR ID");
    lblCarID.setBounds(145, 46, 80, 20);
    lblCarID.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblCarID021 = new JLabel("021");
    lblCarID021.setBounds(167, 65, 60, 20);
    lblCarID021.setFont(new Font("Arial Black", Font.BOLD, 13));
    
    lblCarID022 = new JLabel("022");
    lblCarID022.setBounds(167, 95, 70, 20);
    lblCarID022.setFont(new Font("Arial Black", Font.BOLD, 13));
    
    lblCarID023 = new JLabel("023");
    lblCarID023.setBounds(167, 125, 60, 20);
    lblCarID023.setFont(new Font("Arial Black", Font.BOLD, 13));
    
    lblCarID024 = new JLabel("024");
    lblCarID024.setBounds(167, 155, 70, 20);
    lblCarID024.setFont(new Font("Arial Black", Font.BOLD, 13));
   
    lblCarID025 = new JLabel("025");
    lblCarID025.setBounds(167, 185, 60, 20);
    lblCarID025.setFont(new Font("Arial Black", Font.BOLD, 13));
    
    btnback = new JButton("BACK");
    btnback.setBounds(170, 220, 100, 30);
    btnback.setFont(new Font("Arial", Font.BOLD, 15));
    btnback.addActionListener(this);
    
    btnnext = new JButton("NEXT");
    btnnext.setBounds(290, 220, 100, 30);
    btnnext.setFont(new Font("Arial", Font.BOLD, 15));
    btnnext.addActionListener(this);
   
    
    //add
    add(lblAvailablePickup);
    add(lblRanger);
    add(lblToyota);
    add(lblIsuzuD);
    add(lblNavarra);
    add(lblfoton);
    add(lblPrice);
    add(lblPRanger);
    add(lblPToyota);
    add(lblPIsuzuD);
    add(lblPNavarra);
    add(lblPfoton);
    add(lblCarID);
    add(lblCarID021);
    add(lblCarID022);
    add(lblCarID023);
    add(lblCarID024);
    add(lblCarID025);
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

   