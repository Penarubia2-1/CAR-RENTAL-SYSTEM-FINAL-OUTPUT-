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

   
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author penarubia
 */

public class SUVCar extends JFrame implements ActionListener{
     private JLabel lblSUVCar,lblCherttiggo,lblMustang, lblRover, lblGeely,lblWagon,lblPrice,lblJetour, lblSuzukiJimny, lblKia,lblFoton,lblHyundai;
     private JTextField txtfldChoose= new JTextField();
     private JLabel lblCarID,lblCarID006,lblCarID007,lblCarID008,lblCarID009,lblCarID010;
     private JButton btnnext,btnback;
     SUVCar(){
         setTitle("SUV Car");
         setSize(600,400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
     lblSUVCar=new JLabel("List of Available SUV Car");
     lblSUVCar.setBounds(180,20,280,30);
     lblSUVCar.setFont(new Font("Perpetua Titling MT", Font.BOLD,15));
            
    lblCherttiggo = new JLabel("Chery Tiggo");
    lblCherttiggo.setBounds(250, 70, 150, 30);
    lblCherttiggo.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblMustang = new JLabel("Mustang");
    lblMustang.setBounds(250, 100, 150, 30);
    lblMustang.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblRover = new JLabel("Land Rover");
    lblRover.setBounds(250, 130, 150, 30);
    lblRover.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblHyundai = new JLabel("Geely GX3");
    lblHyundai.setBounds(250, 160, 150, 30);
    lblHyundai.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblWagon = new JLabel("BAIC Wagon");
    lblWagon.setBounds(250, 190, 150, 30);
    lblWagon.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    //price
    lblPrice=new JLabel("Price");
    lblPrice.setBounds(370,40,200,40);
    lblPrice.setFont(new Font("Arial",Font.BOLD,15));
    
    
    lblJetour = new JLabel("10,000");
    lblJetour.setBounds(368, 70, 120, 30);
    lblJetour.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblSuzukiJimny = new JLabel("10,000");
    lblSuzukiJimny.setBounds(368, 100, 120, 30);
    lblSuzukiJimny.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblKia = new JLabel("10,000");
    lblKia.setBounds(368, 130, 120, 30);
    lblKia.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblFoton = new JLabel("10,000");
    lblFoton.setBounds(368, 160, 160, 30);
    lblFoton.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblGeely = new JLabel("10,000");
    lblGeely.setBounds(368, 190, 190, 30);
    lblGeely.setFont(new Font("Arial", Font.PLAIN, 15));

    //buttons
     lblCarID = new JLabel("CAR ID");
    lblCarID.setBounds(173, 49, 80, 20);
    lblCarID.setFont(new Font("Arial Black", Font.BOLD, 15));
    
      
    lblCarID006 = new JLabel("006");
    lblCarID006.setBounds(190, 75, 60, 20);
    lblCarID006.setFont(new Font("Arial Black", Font.BOLD, 13));
    
    lblCarID007 = new JLabel("007");
    lblCarID007.setBounds(190, 105, 70, 20);
    lblCarID007.setFont(new Font("Arial Black", Font.BOLD, 13));
    
    lblCarID008 = new JLabel("008");
    lblCarID008.setBounds(190, 135, 60, 20);
    lblCarID008.setFont(new Font("Arial Black", Font.BOLD, 13));
    
    lblCarID009 = new JLabel("009");
    lblCarID009.setBounds(190, 165, 70, 20);
    lblCarID009.setFont(new Font("Arial Black", Font.BOLD, 13));
    
    lblCarID010 = new JLabel("010");
    lblCarID010.setBounds(190, 195, 60, 20);
    lblCarID010.setFont(new Font("Arial Black", Font.BOLD, 13));
    
    btnback = new JButton("BACK");
    btnback.setBounds(180, 245, 100, 30);
    btnback.setFont(new Font("Arial", Font.BOLD, 15));
    btnback.addActionListener(this);
    
    btnnext = new JButton("NEXT");
    btnnext.setBounds(310, 245, 100, 30);
    btnnext.setFont(new Font("Arial", Font.BOLD, 15));
    btnnext.addActionListener(this);
    
    //add
    add(lblSUVCar);
    add(lblCherttiggo);
    add(lblMustang);
    add(lblRover);
    add(lblHyundai);
    add(lblWagon);
    add(lblPrice);
    add(lblJetour);
    add(lblSuzukiJimny);
    add(lblKia);
    add(lblFoton);
    add(lblGeely);
    add(lblCarID);
    add(lblCarID006);
    add(lblCarID007);
    add(lblCarID008);
    add(lblCarID009);
    add(lblCarID010);
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
 
