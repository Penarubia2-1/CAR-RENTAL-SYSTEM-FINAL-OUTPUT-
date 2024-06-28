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

public class VanCar extends JFrame implements ActionListener{
     private JLabel lblAvailableVanCar, lblMiniMPV,lblMiniVan, lblBoxVan, lblMicroVan,lblPanelVan,lblpricelist,lblPMPV, lblPMini, lblPBox,lblPMicro,lblPPanel,van;
     private JLabel lblCarID,lblCarID011,lblCarID012,lblCarID013,lblCarID014,lblCarID015;
     private JButton btnback, btnnext,btnlogout;
     VanCar(){
        setTitle("Van Car");
        setSize(800,600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
 
        //image
        van = new JLabel();
        van.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\gboyc\\Documents\\NetBeansProjects\\Car Rental System\\src\\imgVan.png").getImage().getScaledInstance(600, 400, Image.SCALE_SMOOTH)));
        van.setBounds(100, 250, 600, 400);
         
       
        lblAvailableVanCar=new JLabel("List of Available Van Car");
        lblAvailableVanCar.setBounds(250,40,400,30);
        lblAvailableVanCar.setFont(new Font("Perpetua Titling MT", Font.BOLD,20));
        lblAvailableVanCar.setForeground(Color.white);

            
        lblMiniMPV = new JLabel("Mini MPV");
        lblMiniMPV.setBounds(335, 100, 170, 30);
        lblMiniMPV.setFont(new Font("Arial Black", Font.BOLD, 20));
        lblMiniMPV.setForeground(Color.white);
        
        lblMiniVan = new JLabel("Mini Van");
        lblMiniVan.setBounds(335, 140, 120, 30);
        lblMiniVan.setFont(new Font("Arial Black", Font.BOLD, 20));
        lblMiniVan.setForeground(Color.white);
        
        lblBoxVan = new JLabel("Box Van");
        lblBoxVan.setBounds(335, 180, 170, 30);
        lblBoxVan.setFont(new Font("Arial Black", Font.BOLD, 20));
        lblBoxVan.setForeground(Color.white);
        
        lblMicroVan = new JLabel("Micro Van");
        lblMicroVan.setBounds(335, 220, 170, 30);
        lblMicroVan.setFont(new Font("Arial Black", Font.BOLD, 20));
        lblMicroVan.setForeground(Color.white);

        lblPanelVan = new JLabel("Panel Van");
        lblPanelVan.setBounds(335, 260, 170, 30);
        lblPanelVan.setFont(new Font("Arial Black", Font.BOLD, 20));
        lblPanelVan.setForeground(Color.white);

        //pricelist
        lblpricelist= new JLabel ("Status");
        lblpricelist.setBounds(500,75,290,30);
        lblpricelist.setFont(new Font("Arial",Font.BOLD,17));
        lblpricelist.setForeground(Color.white);

        lblPMPV = new JLabel("AVAILABLE");
        lblPMPV.setBounds(490, 100, 120, 30);
        lblPMPV.setFont(new Font("Arial", Font.PLAIN, 17));
        lblPMPV.setForeground(Color.white);

        lblPMini = new JLabel("AVAILABLE");
        lblPMini.setBounds(490, 140, 120, 30);
        lblPMini.setFont(new Font("Arial", Font.PLAIN, 17));
        lblPMini.setForeground(Color.white);

        lblPBox = new JLabel("AVAILABLE");
        lblPBox.setBounds(490, 180, 120, 30);
        lblPBox.setFont(new Font("Arial", Font.PLAIN, 17));
        lblPBox.setForeground(Color.white);

        lblPMicro = new JLabel("AVAILABLE");
        lblPMicro.setBounds(490, 220, 120, 30);
        lblPMicro.setFont(new Font("Arial", Font.PLAIN, 17));
        lblPMicro.setForeground(Color.white);

        lblPPanel = new JLabel("AVAILABLE");
        lblPPanel.setBounds(490, 260, 120, 30);
        lblPPanel.setFont(new Font("Arial", Font.PLAIN, 17));
        lblPPanel.setForeground(Color.white);
        
       
        //CAR ID
        lblCarID = new JLabel("CAR ID");
        lblCarID.setBounds(260, 80, 80, 20);
        lblCarID.setFont(new Font("Arial Black", Font.BOLD, 15));
        lblCarID.setForeground(Color.white);

        lblCarID011 = new JLabel("011");
        lblCarID011.setBounds(274, 104, 60, 20);
        lblCarID011.setFont(new Font("Arial Black", Font.BOLD, 15));
        lblCarID011.setForeground(Color.white);

        lblCarID012 = new JLabel("012");
        lblCarID012.setBounds(274, 147, 70, 20);
        lblCarID012.setFont(new Font("Arial Black", Font.BOLD, 15));
        lblCarID012.setForeground(Color.white);

        lblCarID013 = new JLabel("013");
        lblCarID013.setBounds(274, 187, 60, 20);
        lblCarID013.setFont(new Font("Arial Black", Font.BOLD, 15));
        lblCarID013.setForeground(Color.white);

        lblCarID014 = new JLabel("014");
        lblCarID014.setBounds(274, 227, 70, 20);
        lblCarID014.setFont(new Font("Arial Black", Font.BOLD, 15));
        lblCarID014.setForeground(Color.white);

        lblCarID015 = new JLabel("015");
        lblCarID015.setBounds(274, 267, 60, 20);
        lblCarID015.setFont(new Font("Arial Black", Font.BOLD, 15));
        lblCarID015.setForeground(Color.white);

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
        add(lblAvailableVanCar);
        add(lblMiniMPV);
        add(lblMiniVan);
        add(lblBoxVan);
        add(lblMicroVan);
        add(lblPanelVan);
        add(lblpricelist);
        add(lblPMPV);
        add(lblPMini);
        add(lblPBox);
        add(lblPMicro);
        add(lblPPanel);
        add(lblCarID);
        add(lblCarID011);
        add(lblCarID012);
        add(lblCarID013);
        add(lblCarID014);
        add(lblCarID015);
        add(btnnext);
        add(btnback);
        add(btnlogout);
        add(van);
    
    
    setVisible(true);
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