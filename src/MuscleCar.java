import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
     private JButton btnnext,btnback;
     MuscleCar(){
        setTitle("Muscle Car");
        setSize(800,600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               getContentPane().setBackground(Color.black);

        
        //img
        muscle = new JLabel();
        muscle.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\gboyc\\Documents\\NetBeansProjects\\Car Rental System\\src\\muscle.png").getImage().getScaledInstance(600, 400, Image.SCALE_SMOOTH)));
        muscle.setBounds(100, 0, 600, 400);
 

              
     
        
        lblAvailableMuscleCar=new JLabel("List of Available Muscle Car");
        lblAvailableMuscleCar.setBounds(200,40,400,30);
        lblAvailableMuscleCar.setFont(new Font("Perpetua Titling MT", Font.BOLD,20));
        lblAvailableMuscleCar.setForeground(Color.white);


        lblChevrolet = new JLabel("Chevrolet");
        lblChevrolet.setBounds(280, 100, 120, 30);
        lblChevrolet.setFont(new Font("Arial Black", Font.BOLD, 20));
        lblChevrolet.setForeground(Color.white);

        
        lblMustang = new JLabel  ("Mustang");
        lblMustang.setBounds(280, 140, 120, 30);
        lblMustang.setFont(new Font("Arial Black", Font.BOLD,20));
        lblMustang.setForeground(Color.white);

        lblFord = new JLabel("Ford");
        lblFord.setBounds(280, 180, 120, 30);
        lblFord.setFont(new Font("Arial Black", Font.BOLD, 20));
        lblFord.setForeground(Color.white);


        lblChallenger = new JLabel("Challenger");
        lblChallenger.setBounds(280, 220, 120, 30);
        lblChallenger.setFont(new Font("Arial Black", Font.BOLD, 20));
                lblChallenger.setForeground(Color.white);


        lblDodge = new JLabel("Dodge");
        lblDodge.setBounds(280, 260, 120, 30);
        lblDodge.setFont(new Font("Arial Black", Font.BOLD, 20));
                lblDodge.setForeground(Color.white);



       //pricelist 
        lblprice=new JLabel("Price");
        lblprice.setBounds(352,42,290,30);
        lblprice.setFont(new Font("Arial Black", Font.PLAIN,15));
                lblprice.setForeground(Color.white);


       lblPChevrolet = new JLabel("10,000");
       lblPChevrolet.setBounds(350, 60, 120, 30);
       lblPChevrolet.setFont(new Font("Arial", Font.PLAIN, 15));
               lblChevrolet.setForeground(Color.white);


       lblPMustang = new JLabel("10,000");
       lblPMustang.setBounds(350, 90, 120, 30);
       lblPMustang.setFont(new Font("Arial", Font.PLAIN, 15));
               lblPMustang.setForeground(Color.white);


       lblPFord = new JLabel("10,000");
       lblPFord.setBounds(350, 120, 120, 30);
       lblPFord.setFont(new Font("Arial", Font.PLAIN, 15));
               lblPFord.setForeground(Color.white);


       lblPChallenger = new JLabel("10,000");
       lblPChallenger.setBounds(350, 150, 120, 30);
       lblPChallenger.setFont(new Font("Arial", Font.PLAIN, 15));
               lblPChallenger.setForeground(Color.white);


       lblPDodge = new JLabel("10,000");
       lblPDodge.setBounds(350, 180, 120, 30);
       lblPDodge.setFont(new Font("Arial", Font.PLAIN, 15));
               lblPDodge.setForeground(Color.white);


       lblCarID = new JLabel("CAR ID");
       lblCarID.setBounds(173, 49, 80, 20);
       lblCarID.setFont(new Font("Arial Black", Font.BOLD, 15));
               lblCarID.setForeground(Color.white);



       lblCarID001 = new JLabel("001");
       lblCarID001.setBounds(187, 65, 60, 20);
       lblCarID001.setFont(new Font("Arial Black", Font.BOLD, 13));
               lblCarID001.setForeground(Color.white);


       lblCarID002 = new JLabel("002");
       lblCarID002.setBounds(187, 95, 70, 20);
       lblCarID002.setFont(new Font("Arial Black", Font.BOLD, 13));
               lblCarID002.setForeground(Color.white);


       lblCarID003 = new JLabel("003");
       lblCarID003.setBounds(187, 125, 60, 20);
       lblCarID003.setFont(new Font("Arial Black", Font.BOLD, 13));
               lblCarID003.setForeground(Color.white);


       lblCarID004 = new JLabel("004");
       lblCarID004.setBounds(187, 155, 70, 20);
       lblCarID004.setFont(new Font("Arial Black", Font.BOLD, 13));
               lblCarID004.setForeground(Color.white);


       lblCarID005 = new JLabel("005");
       lblCarID005.setBounds(187, 185, 60, 20);
       lblCarID005.setFont(new Font("Arial Black", Font.BOLD, 13));
               lblCarID005.setForeground(Color.white);




       btnnext = new JButton("NEXT");
       btnnext.setBounds(280, 240, 100, 30);
       btnnext.setFont(new Font("Arial", Font.BOLD, 15));
       btnnext.setForeground(Color.black);
       btnnext.addActionListener(this);

       btnback = new JButton("BACK");
       btnback.setBounds(150, 240, 100, 30);
       btnback.setFont(new Font("Arial", Font.BOLD, 15));
       btnback.setForeground(Color.black);
       btnback.addActionListener(this);

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
            GenerateInvoices gi = new GenerateInvoices();
            gi.setVisible(true);
        
    }
     }}
