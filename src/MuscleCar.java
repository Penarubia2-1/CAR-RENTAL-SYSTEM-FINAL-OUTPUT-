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

public class MuscleCar extends JFrame implements ActionListener{
     private JLabel lblAvailableMuscleCar, lblChevrolet,lblMustang, lblFord, lblChallenger,lblDodge,lblprice,lblPChevrolet, lblPMustang, lblPFord,lblPChallenger,lblPDodge,muscle;
     private JLabel lblCarID,lblCarID001,lblCarID002,lblCarID003,lblCarID004,lblCarID005;
     private JButton btnnext,btnback,btnlogout;
     MuscleCar(){
        setTitle("Muscle Car");
        setSize(800,600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);

        
        //img
        muscle = new JLabel();
        muscle.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\63931\\OneDrive\\Pictures\\Documents\\NetBeansProjects\\New\\CAR-RENTAL-SYSTEM-FINAL-OUTPUT-\\src\\muscle.png").getImage().getScaledInstance(600, 400, Image.SCALE_SMOOTH)));
        muscle.setBounds(100, 250, 600, 400);             
     
        //lblTYPES OF MUSCLE CAR
        lblAvailableMuscleCar=new JLabel("List of Available Muscle Car");
        lblAvailableMuscleCar.setBounds(220,40,400,30);
        lblAvailableMuscleCar.setFont(new Font("Perpetua Titling MT", Font.BOLD,20));
        lblAvailableMuscleCar.setForeground(Color.white);


        lblChevrolet = new JLabel("Chevrolet");
        lblChevrolet.setBounds(335, 100, 120, 30);
        lblChevrolet.setFont(new Font("Arial Black", Font.BOLD, 20));
        lblChevrolet.setForeground(Color.white);

        
        lblMustang = new JLabel  ("Mustang");
        lblMustang.setBounds(335, 140, 120, 30);
        lblMustang.setFont(new Font("Arial Black", Font.BOLD,20));
        lblMustang.setForeground(Color.white);

        lblFord = new JLabel("Ford");
        lblFord.setBounds(335, 180, 120, 30);
        lblFord.setFont(new Font("Arial Black", Font.BOLD, 20));
        lblFord.setForeground(Color.white);


        lblChallenger = new JLabel("Challenger");
        lblChallenger.setBounds(335, 220, 170, 30);
        lblChallenger.setFont(new Font("Arial Black", Font.BOLD, 20));
                lblChallenger.setForeground(Color.white);


        lblDodge = new JLabel("Dodge");
        lblDodge.setBounds(335, 260, 120, 30);
        lblDodge.setFont(new Font("Arial Black", Font.BOLD, 20));
                lblDodge.setForeground(Color.white);



       //pricelist 
        lblprice=new JLabel("Status");
        lblprice.setBounds(500,75,290,30);
        lblprice.setFont(new Font("Arial Black", Font.PLAIN,17));
        lblprice.setForeground(Color.white);


        lblPChevrolet = new JLabel("AVAILABLE");
        lblPChevrolet.setBounds(490, 100, 120, 30);
        lblPChevrolet.setFont(new Font("Arial", Font.PLAIN, 17));
        lblPChevrolet.setForeground(Color.white);


        lblPMustang = new JLabel("AVAILABLE");
        lblPMustang.setBounds(490, 140, 120, 30);
        lblPMustang.setFont(new Font("Arial", Font.PLAIN, 17));
        lblPMustang.setForeground(Color.white);


        lblPFord = new JLabel("AVAILABLE");
        lblPFord.setBounds(490, 180, 120, 30);
        lblPFord.setFont(new Font("Arial", Font.PLAIN, 17));
        lblPFord.setForeground(Color.white);


        lblPChallenger = new JLabel("AVAILABLE");
        lblPChallenger.setBounds(490, 220, 120, 30);
        lblPChallenger.setFont(new Font("Arial", Font.PLAIN, 17));
        lblPChallenger.setForeground(Color.white);


        lblPDodge = new JLabel("AVAILABLE");
        lblPDodge.setBounds(490, 260, 120, 30);
        lblPDodge.setFont(new Font("Arial", Font.PLAIN, 17));
        lblPDodge.setForeground(Color.white);

        //carID
        lblCarID = new JLabel("CAR ID");
        lblCarID.setBounds(260, 80, 80, 20);
        lblCarID.setFont(new Font("Arial Black", Font.BOLD, 15));
        lblCarID.setForeground(Color.white);


        lblCarID001 = new JLabel("001");
        lblCarID001.setBounds(274, 104, 60, 20);
        lblCarID001.setFont(new Font("Arial Black", Font.BOLD, 15));
        lblCarID001.setForeground(Color.white);


        lblCarID002 = new JLabel("002");
        lblCarID002.setBounds(274, 147, 70, 20);
        lblCarID002.setFont(new Font("Arial Black", Font.BOLD, 15));
        lblCarID002.setForeground(Color.white);


        lblCarID003 = new JLabel("003");
        lblCarID003.setBounds(274, 187, 60, 20);
        lblCarID003.setFont(new Font("Arial Black", Font.BOLD, 15));
        lblCarID003.setForeground(Color.white);


        lblCarID004 = new JLabel("004");
        lblCarID004.setBounds(274, 227, 70, 20);
        lblCarID004.setFont(new Font("Arial Black", Font.BOLD, 15));
        lblCarID004.setForeground(Color.white);


        lblCarID005 = new JLabel("005");
        lblCarID005.setBounds(274, 267, 60, 20);
        lblCarID005.setFont(new Font("Arial Black", Font.BOLD, 15));
        lblCarID005.setForeground(Color.white);


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
        add(lblAvailableMuscleCar);
        add(lblChevrolet);
        add(lblMustang); 
        add(lblFord);
        add(lblChallenger);
        add(lblDodge);
        add(lblprice);
        add(lblPChevrolet);
        add(lblPMustang);
        add(lblPFord);
        add(lblPChallenger);
        add(lblPDodge);
        add(lblCarID);
        add(lblCarID001);
        add(lblCarID002);
        add(lblCarID003);
        add(lblCarID004);
        add(lblCarID005);
        add(btnnext);
        add(btnback);
        add(btnlogout);
        add(muscle);


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
     }}
