import java.awt.Font;
import java.awt.event.*;
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
     private JLabel lblAvailableMuscleCar, lblChevrolet,lblMustang, lblFord, lblChallenger,lblDodge,lblprice,lblPChevrolet, lblPMustang, lblPFord,lblPChallenger,lblPDodge;
     private JLabel lblCarID,lblCarID001,lblCarID002,lblCarID003,lblCarID004,lblCarID005;
     private JButton btnnext,btnback;
     MuscleCar(){
         setTitle("Muscle Car");
        setSize(600,400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        lblAvailableMuscleCar=new JLabel("List of Available Muscle Car");
        lblAvailableMuscleCar.setBounds(150,20,290,30);
        lblAvailableMuscleCar.setFont(new Font("Perpetua Titling MT", Font.BOLD,15));


        lblChevrolet = new JLabel("Chevrolet");
        lblChevrolet.setBounds(242, 59, 120, 30);
        lblChevrolet.setFont(new Font("Arial Black", Font.BOLD, 15));

        lblMustang = new JLabel  ("Mustang");
        lblMustang.setBounds(242, 89, 120, 30);
        lblMustang.setFont(new Font("Arial Black", Font.BOLD,15));

        lblFord = new JLabel("Ford");
        lblFord.setBounds(242, 119, 120, 30);
        lblFord.setFont(new Font("Arial Black", Font.BOLD, 15));

        lblChallenger = new JLabel("Challenger");
        lblChallenger.setBounds(242, 148, 120, 30);
        lblChallenger.setFont(new Font("Arial Black", Font.BOLD, 15));

        lblDodge = new JLabel("Dodge");
        lblDodge.setBounds(242, 179, 120, 30);
        lblDodge.setFont(new Font("Arial Black", Font.BOLD, 15));


       //pricelist 
        lblprice=new JLabel("Price");
        lblprice.setBounds(352,42,290,30);
        lblprice.setFont(new Font("Arial Black", Font.PLAIN,15));

       lblPChevrolet = new JLabel("10,000");
       lblPChevrolet.setBounds(350, 60, 120, 30);
       lblPChevrolet.setFont(new Font("Arial", Font.PLAIN, 15));

       lblPMustang = new JLabel("10,000");
       lblPMustang.setBounds(350, 90, 120, 30);
       lblPMustang.setFont(new Font("Arial", Font.PLAIN, 15));

       lblPFord = new JLabel("10,000");
       lblPFord.setBounds(350, 120, 120, 30);
       lblPFord.setFont(new Font("Arial", Font.PLAIN, 15));

       lblPChallenger = new JLabel("10,000");
       lblPChallenger.setBounds(350, 150, 120, 30);
       lblPChallenger.setFont(new Font("Arial", Font.PLAIN, 15));

       lblPDodge = new JLabel("10,000");
       lblPDodge.setBounds(350, 180, 120, 30);
       lblPDodge.setFont(new Font("Arial", Font.PLAIN, 15));

       lblCarID = new JLabel("CAR ID");
       lblCarID.setBounds(173, 49, 80, 20);
       lblCarID.setFont(new Font("Arial Black", Font.BOLD, 15));


       lblCarID001 = new JLabel("001");
       lblCarID001.setBounds(187, 65, 60, 20);
       lblCarID001.setFont(new Font("Arial Black", Font.BOLD, 13));

       lblCarID002 = new JLabel("002");
       lblCarID002.setBounds(187, 95, 70, 20);
       lblCarID002.setFont(new Font("Arial Black", Font.BOLD, 13));

       lblCarID003 = new JLabel("003");
       lblCarID003.setBounds(187, 125, 60, 20);
       lblCarID003.setFont(new Font("Arial Black", Font.BOLD, 13));

       lblCarID004 = new JLabel("004");
       lblCarID004.setBounds(187, 155, 70, 20);
       lblCarID004.setFont(new Font("Arial Black", Font.BOLD, 13));

       lblCarID005 = new JLabel("005");
       lblCarID005.setBounds(187, 185, 60, 20);
       lblCarID005.setFont(new Font("Arial Black", Font.BOLD, 13));



       btnnext = new JButton("NEXT");
       btnnext.setBounds(280, 240, 100, 30);
       btnnext.setFont(new Font("Arial", Font.BOLD, 15));
       btnnext.addActionListener(this);

       btnback = new JButton("BACK");
       btnback.setBounds(150, 240, 100, 30);
       btnback.setFont(new Font("Arial", Font.BOLD, 15));
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
