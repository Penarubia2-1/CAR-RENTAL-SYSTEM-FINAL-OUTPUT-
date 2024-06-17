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

public class VanCar extends JFrame implements ActionListener{
     private JLabel lblAvailableVanCar, lblMiniMPV,lblMiniVan, lblBoxVan, lblMicroVan,lblPanelVan,lblpricelist,lblPMPV, lblPMini, lblPBox,lblPMicro,lblPPanel;
     private JLabel lblCarID,lblCarID011,lblCarID012,lblCarID013,lblCarID014,lblCarID015;
     private JButton btnback, btnnext;
     VanCar(){
        setTitle("Van Car");
        setSize(620,360);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
     lblAvailableVanCar=new JLabel("List of Available Van Car");
     lblAvailableVanCar.setBounds(180,20,280,30);
     lblAvailableVanCar.setFont(new Font("Perpetua Titling MT", Font.BOLD,15));
            
    lblMiniMPV = new JLabel("Mini MPV");
    lblMiniMPV.setBounds(265, 60, 120, 30);
    lblMiniMPV.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblMiniVan = new JLabel("Mini Van");
    lblMiniVan.setBounds(265, 90, 120, 30);
    lblMiniVan.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblBoxVan = new JLabel("Box Van");
    lblBoxVan.setBounds(265, 120, 170, 30);
    lblBoxVan.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblMicroVan = new JLabel("Micro Van");
    lblMicroVan.setBounds(265, 150, 120, 30);
    lblMicroVan.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblPanelVan = new JLabel("Panel Van");
    lblPanelVan.setBounds(265, 180, 150, 30);
    lblPanelVan.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    //pricelist
    lblpricelist= new JLabel ("Price");
    lblpricelist.setBounds(370,40,180,30);
    lblpricelist.setFont(new Font("Arial",Font.BOLD, 15));
    
    lblPMPV = new JLabel("10,000");
    lblPMPV.setBounds(368, 120, 170, 30);
    lblPMPV.setFont(new Font("Arial", Font.PLAIN, 15));
   
    lblPMini = new JLabel("10,000");
    lblPMini.setBounds(368, 60, 120, 30);
    lblPMini.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPBox = new JLabel("10,000");
    lblPBox.setBounds(368, 90, 120, 30);
    lblPBox.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPMicro = new JLabel("10,000");
    lblPMicro.setBounds(368, 150, 150, 30);
    lblPMicro.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPPanel = new JLabel("10,000");
    lblPPanel.setBounds(368, 180, 120, 30);
    lblPPanel.setFont(new Font("Arial", Font.PLAIN, 15));

    lblCarID = new JLabel("CAR ID");
    lblCarID.setBounds(184, 46, 80, 20);
    lblCarID.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblCarID011 = new JLabel("011");
    lblCarID011.setBounds(203, 65, 60, 20);
    lblCarID011.setFont(new Font("Arial Black", Font.BOLD, 13));
    
    lblCarID012 = new JLabel("012");
    lblCarID012.setBounds(203, 95, 70, 20);
    lblCarID012.setFont(new Font("Arial Black", Font.BOLD, 13));
    
    lblCarID013 = new JLabel("013");
    lblCarID013.setBounds(203, 125, 60, 20);
    lblCarID013.setFont(new Font("Arial Black", Font.BOLD, 13));
    
    lblCarID014 = new JLabel("014");
    lblCarID014.setBounds(203, 155, 70, 20);
    lblCarID014.setFont(new Font("Arial Black", Font.BOLD, 13));
   
    lblCarID015 = new JLabel("015");
    lblCarID015.setBounds(203, 185, 60, 20);
    lblCarID015.setFont(new Font("Arial Black", Font.BOLD, 13));
    
    btnback = new JButton("BACK");
    btnback.setBounds(190, 224, 100, 30);
    btnback.setFont(new Font("Arial", Font.BOLD, 15));
    btnback.addActionListener(this);
    
    btnnext = new JButton("NEXT");
    btnnext.setBounds(310, 224, 100, 30);
    btnnext.setFont(new Font("Arial", Font.BOLD, 15));
    btnnext.addActionListener(this);
    
    
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
            GenerateInvoices gi = new GenerateInvoices();
            gi.setVisible(true);
        
    }
      
     }

   
     
}