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

public class HatchbackCar extends JFrame implements ActionListener{
     private JLabel lblAvailableHatchBack, lblMazda2,lblBYD, lblMazda3, lblBrio,lblToyota,lblPrice,lblPMazda2, lblPBYD, lblPMazda3,lblPBrio,lblPtoyota,hatchback;
     private JLabel lblCarID,lblCarID016,lblCarID017,lblCarID018,lblCarID019,lblCarID020;
     private JButton btnback, btnnext;
     HatchbackCar(){
        setTitle("Hatchback Car");
        setSize(800,600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);

        //image
        hatchback = new JLabel();
        hatchback.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\gboyc\\Documents\\NetBeansProjects\\Car Rental System\\src\\imghatchback.png").getImage().getScaledInstance(600, 400, Image.SCALE_SMOOTH)));
        hatchback.setBounds(100, 250, 600, 400);
                
        //lblTYPES OF HATCHBACK CAR
       lblAvailableHatchBack=new JLabel("List of Available Hatchback Car");
       lblAvailableHatchBack.setBounds(250,40,400,30);
       lblAvailableHatchBack.setFont(new Font("Perpetua Titling MT", Font.BOLD,20));
       lblAvailableHatchBack.setForeground(Color.white);

       lblMazda2 = new JLabel("Mazda 2");
       lblMazda2.setBounds(335, 100, 170, 30);
       lblMazda2.setFont(new Font("Arial Black", Font.BOLD, 20));
       lblMazda2.setForeground(Color.white);
      
       lblMazda3 = new JLabel("Mazda 3");
       lblMazda3.setBounds(335, 140, 120, 30);
       lblMazda3.setFont(new Font("Arial Black", Font.BOLD, 20));
       lblMazda3.setForeground(Color.white);
        
       lblBYD = new JLabel("BYD Dolphin");
       lblBYD.setBounds(335, 180, 170, 30);
       lblBYD.setFont(new Font("Arial Black", Font.BOLD, 20));
       lblBYD.setForeground(Color.white);
        
       lblBrio = new JLabel("Honda Brio");
       lblBrio.setBounds(335, 220, 170, 30);
       lblBrio.setFont(new Font("Arial Black", Font.BOLD, 20));
       lblBrio.setForeground(Color.white);

       lblToyota = new JLabel("Toyota Wigo");
       lblToyota.setBounds(335, 260, 170, 30);
       lblToyota.setFont(new Font("Arial Black", Font.BOLD, 20));
       lblToyota.setForeground(Color.white);

       //pricelist
       lblPrice=new JLabel("Price");
       lblPrice.setBounds(490,75,290,30);
       lblPrice.setFont(new Font("Arial",Font.BOLD,17));
       lblPrice.setForeground(Color.white);

       lblPMazda2 = new JLabel("10,000");
       lblPMazda2.setBounds(490, 100, 120, 30);
       lblPMazda2.setFont(new Font("Arial", Font.PLAIN, 17));
       lblPMazda2.setForeground(Color.white);

       lblPBYD = new JLabel("10,000");
       lblPBYD.setBounds(490, 140, 120, 30);
       lblPBYD.setFont(new Font("Arial", Font.PLAIN, 17));
       lblPBYD.setForeground(Color.white);

       lblPMazda3 = new JLabel("10,000");
       lblPMazda3.setBounds(490, 180, 120, 30);
       lblPMazda3.setFont(new Font("Arial", Font.PLAIN, 17));
       lblPMazda3.setForeground(Color.white);

       lblPBrio = new JLabel("10,000");
       lblPBrio.setBounds(490, 220, 120, 30);
       lblPBrio.setFont(new Font("Arial", Font.PLAIN, 17));
       lblPBrio.setForeground(Color.white);

       lblPtoyota = new JLabel("10,000");
       lblPtoyota.setBounds(490, 260, 120, 30);
       lblPtoyota.setFont(new Font("Arial", Font.PLAIN, 17));
       lblPtoyota.setForeground(Color.white);
        
       //CAR ID
       lblCarID = new JLabel("CAR ID");
       lblCarID.setBounds(260, 80, 80, 20);
       lblCarID.setFont(new Font("Arial Black", Font.BOLD, 15));
       lblCarID.setForeground(Color.white);

       lblCarID016 = new JLabel("016");
       lblCarID016.setBounds(274, 104, 60, 20);
       lblCarID016.setFont(new Font("Arial Black", Font.BOLD, 15));
       lblCarID016.setForeground(Color.white);

       lblCarID017 = new JLabel("017");
       lblCarID017.setBounds(274, 147, 70, 20);
       lblCarID017.setFont(new Font("Arial Black", Font.BOLD, 15));
       lblCarID017.setForeground(Color.white);

       lblCarID018 = new JLabel("018");
       lblCarID018.setBounds(274, 187, 60, 20);
       lblCarID018.setFont(new Font("Arial Black", Font.BOLD, 15));
       lblCarID018.setForeground(Color.white);

       lblCarID019 = new JLabel("019");
       lblCarID019.setBounds(274, 227, 70, 20);
       lblCarID019.setFont(new Font("Arial Black", Font.BOLD, 15));
       lblCarID019.setForeground(Color.white);

       lblCarID020 = new JLabel("020");
       lblCarID020.setBounds(274, 267, 60, 20);
       lblCarID020.setFont(new Font("Arial Black", Font.BOLD, 15));
       lblCarID020.setForeground(Color.white);

       //btn
        btnback = new JButton("BACK");
        btnback.setBounds(270, 360, 100, 30);
        btnback.setFont(new Font("Arial", Font.BOLD, 15));
        btnback.setForeground(Color.black);
        btnback.addActionListener(this);

        btnnext = new JButton("NEXT");
        btnnext.setBounds(420, 360, 100, 30);
        btnnext.setFont(new Font("Arial", Font.BOLD, 15));
        btnnext.setForeground(Color.black);
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
       add(hatchback);

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