import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author John Mark Penarubia
 */

public class PickupCar extends JFrame implements ActionListener{
     private JLabel lblAvailablePickup, lblRanger, lblToyota, lblIsuzuD,lblNavarra,lblfoton,lblPrice,lblPRanger,lblPToyota, lblPIsuzuD,lblPNavarra,lblPfoton,pickup;
      private JLabel lblCarID,lblCarID021,lblCarID022,lblCarID023,lblCarID024,lblCarID025;
     private JButton btnback, btnnext,btnlogout;
     PickupCar(){
        setSize(800,600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      getContentPane().setBackground(Color.black);

        //image
        pickup = new JLabel();
        pickup.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\63931\\OneDrive\\Pictures\\Documents\\NetBeansProjects\\New\\CAR-RENTAL-SYSTEM-FINAL-OUTPUT-\\src\\imgpickup.png").getImage().getScaledInstance(600, 400, Image.SCALE_SMOOTH)));
        pickup.setBounds(100, 250, 600, 400);
                  
        lblAvailablePickup=new JLabel("List of Available Pickup Car");
        lblAvailablePickup.setBounds(250,40,400,30);
        lblAvailablePickup.setFont(new Font("Perpetua Titling MT", Font.BOLD,20));
        lblAvailablePickup.setForeground(Color.white);

        lblRanger = new JLabel("Ford Ranger");
        lblRanger.setBounds(335, 100, 170, 30);
        lblRanger.setFont(new Font("Arial Black", Font.BOLD, 20));
        lblRanger.setForeground(Color.white);
      
        lblToyota = new JLabel("Toyota Hilux");
        lblToyota.setBounds(335, 140, 170, 30);
        lblToyota.setFont(new Font("Arial Black", Font.BOLD, 20));
        lblToyota.setForeground(Color.white);
        
        lblIsuzuD = new JLabel("Isuzu D-Max");
        lblIsuzuD.setBounds(335, 180, 170, 30);
        lblIsuzuD.setFont(new Font("Arial Black", Font.BOLD, 20));
        lblIsuzuD.setForeground(Color.white);

        lblNavarra= new JLabel("Nissan Navara");
        lblNavarra.setBounds(335, 220, 170, 30);
        lblNavarra.setFont(new Font("Arial Black", Font.BOLD, 20));
        lblNavarra.setForeground(Color.white);

        lblfoton = new JLabel("Foton Thunder");
        lblfoton.setBounds(335, 260, 170, 30);
        lblfoton.setFont(new Font("Arial Black", Font.BOLD, 20));
        lblfoton.setForeground(Color.white);

        //pricelist
        lblPrice=new JLabel("Status");
        lblPrice.setBounds(520,75,290,30);
        lblPrice.setFont(new Font("Arial",Font.BOLD,17));
        lblPrice.setForeground(Color.white);

        lblPRanger = new JLabel("AVAILABLE");
        lblPRanger.setBounds(510, 100, 120, 30);
        lblPRanger.setFont(new Font("Arial", Font.PLAIN, 17));
        lblPRanger.setForeground(Color.white);

        lblPToyota = new JLabel("AVAILABLE");
        lblPToyota.setBounds(510, 140, 120, 30);
        lblPToyota.setFont(new Font("Arial", Font.PLAIN, 17));
        lblPToyota.setForeground(Color.white);

        lblPIsuzuD = new JLabel("AVAILABLE");
        lblPIsuzuD.setBounds(510, 180, 120, 30);
        lblPIsuzuD.setFont(new Font("Arial", Font.PLAIN, 17));
        lblPIsuzuD.setForeground(Color.white);

        lblPNavarra = new JLabel("AVAILABLE");
        lblPNavarra.setBounds(510, 220, 120, 30);
        lblPNavarra.setFont(new Font("Arial", Font.PLAIN, 17));
        lblPNavarra.setForeground(Color.white);

        lblPfoton = new JLabel("AVAILABLE");
        lblPfoton.setBounds(510, 260, 120, 30);
        lblPfoton.setFont(new Font("Arial", Font.PLAIN, 17));
        lblPfoton.setForeground(Color.white);
        
        //CAR ID
        lblCarID = new JLabel("CAR ID");
        lblCarID.setBounds(260, 80, 80, 20);
        lblCarID.setFont(new Font("Arial Black", Font.BOLD, 15));
        lblCarID.setForeground(Color.white);

        lblCarID021 = new JLabel("021");
        lblCarID021.setBounds(274, 104, 60, 20);
        lblCarID021.setFont(new Font("Arial Black", Font.BOLD, 15));
        lblCarID021.setForeground(Color.white);

        lblCarID022 = new JLabel("022");
        lblCarID022.setBounds(274, 147, 70, 20);
        lblCarID022.setFont(new Font("Arial Black", Font.BOLD, 15));
        lblCarID022.setForeground(Color.white);

        lblCarID023 = new JLabel("023");
        lblCarID023.setBounds(274, 187, 60, 20);
        lblCarID023.setFont(new Font("Arial Black", Font.BOLD, 15));
        lblCarID023.setForeground(Color.white);

        lblCarID024 = new JLabel("024");
        lblCarID024.setBounds(274, 227, 70, 20);
        lblCarID024.setFont(new Font("Arial Black", Font.BOLD, 15));
        lblCarID024.setForeground(Color.white);

        lblCarID025 = new JLabel("025");
        lblCarID025.setBounds(274, 267, 60, 20);
        lblCarID025.setFont(new Font("Arial Black", Font.BOLD, 15));
        lblCarID025.setForeground(Color.white);

        //btn
        btnback = new JButton("BACK");
        btnback.setBounds(200, 360, 100, 30);
        btnback.setFont(new Font("Arial", Font.BOLD, 15));
        btnback.setForeground(Color.black);
        btnback.setBackground(Color.orange);
        btnback.addActionListener(this);

        btnnext = new JButton("NEXT");
        btnnext.setBounds(320, 360, 100, 30);
        btnnext.setFont(new Font("Arial", Font.BOLD, 15));
        btnnext.setForeground(Color.black);
        btnnext.setBackground(Color.orange);
        btnnext.addActionListener(this);
        
        btnlogout = new JButton("LOG OUT");
        btnlogout.setBounds(520, 360, 130, 30);
        btnlogout.setFont(new Font("Arial", Font.BOLD, 15));
        btnlogout.setForeground(Color.black);
        btnlogout.setBackground(Color.orange);
        btnlogout.addActionListener(this);

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
        add(btnlogout);
        add(pickup);

     } 
     @Override
     public void actionPerformed(ActionEvent e){
         dispose ();
            if(e.getSource() == btnback){
            availablevehicles av = new availablevehicles();
            av.setVisible(true);
        }
            else if(e.getSource() == btnnext){
            BookingReservation br = new BookingReservation();
            br.setVisible(true);
        }
             else if(e.getSource() == btnlogout){
            WelcomeFrame wf = new WelcomeFrame();
            wf.setVisible(true);

    }
     }
}

   