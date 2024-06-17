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

   
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author penarubia
 */

public class SUVCar extends JFrame implements ActionListener{
        private JLabel lblSUVCar,lblCherttiggo,lblMustang, lblRover, lblGeely,lblWagon,lblPrice,lblJetour, lblSuzukiJimny, lblKia,lblFoton,lblHyundai,suv;
        private JTextField txtfldChoose= new JTextField();
        private JLabel lblCarID,lblCarID006,lblCarID007,lblCarID008,lblCarID009,lblCarID010;
        private JButton btnnext,btnback;
     SUVCar(){
           setTitle("SUV Car");
           setSize(800,600);
           setLayout(null);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           getContentPane().setBackground(Color.black);

           
           //image
        suv = new JLabel();
        suv.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\gboyc\\Documents\\NetBeansProjects\\Car Rental System\\src\\imgSUV.png").getImage().getScaledInstance(600, 400, Image.SCALE_SMOOTH)));
        suv.setBounds(100, 250, 600, 400);
 
        //lblTYPES OF SUV CAR
        lblSUVCar=new JLabel("List of Available SUV Car");
        lblSUVCar.setBounds(250,40,400,30);
        lblSUVCar.setFont(new Font("Perpetua Titling MT", Font.BOLD,20));
        lblSUVCar.setForeground(Color.white);

        lblCherttiggo = new JLabel("Chery Tiggo");
        lblCherttiggo.setBounds(335, 100, 170, 30);
        lblCherttiggo.setFont(new Font("Arial Black", Font.BOLD, 20));
        lblCherttiggo.setForeground(Color.white);


        lblMustang = new JLabel("Mustang");
        lblMustang.setBounds(335, 140, 120, 30);
        lblMustang.setFont(new Font("Arial Black", Font.BOLD, 20));
        lblMustang.setForeground(Color.white);

        lblRover = new JLabel("Land Rover");
        lblRover.setBounds(335, 180, 170, 30);
        lblRover.setFont(new Font("Arial Black", Font.BOLD, 20));
        lblRover.setForeground(Color.white);

        lblHyundai = new JLabel("Geely GX3");
        lblHyundai.setBounds(335, 220, 170, 30);
        lblHyundai.setFont(new Font("Arial Black", Font.BOLD, 20));
        lblHyundai.setForeground(Color.white);


        lblWagon = new JLabel("BAIC Wagon");
        lblWagon.setBounds(335, 260, 170, 30);
        lblWagon.setFont(new Font("Arial Black", Font.BOLD, 20));
        lblWagon.setForeground(Color.white);


       //price
        lblPrice=new JLabel("Price");
        lblPrice.setBounds(490,75,290,30);
        lblPrice.setFont(new Font("Arial",Font.BOLD,17));
        lblPrice.setForeground(Color.white);


        lblJetour = new JLabel("10,000");
        lblJetour.setBounds(490, 100, 120, 30);
        lblJetour.setFont(new Font("Arial", Font.PLAIN, 17));
        lblJetour.setForeground(Color.white);

        
        lblSuzukiJimny = new JLabel("10,000");
        lblSuzukiJimny.setBounds(490, 140, 120, 30);
        lblSuzukiJimny.setFont(new Font("Arial", Font.PLAIN, 17));
        lblSuzukiJimny.setForeground(Color.white);

        lblKia = new JLabel("10,000");
        lblKia.setBounds(490, 180, 120, 30);
        lblKia.setFont(new Font("Arial", Font.PLAIN, 17));
        lblKia.setForeground(Color.white);

        lblFoton = new JLabel("10,000");
        lblFoton.setBounds(490, 220, 120, 30);
        lblFoton.setFont(new Font("Arial", Font.PLAIN, 17));
        lblFoton.setForeground(Color.white);

        lblGeely = new JLabel("10,000");
        lblGeely.setBounds(490, 260, 120, 30);
        lblGeely.setFont(new Font("Arial", Font.PLAIN, 17));
        lblGeely.setForeground(Color.white);

        
        //CARID
        lblCarID = new JLabel("CAR ID");
        lblCarID.setBounds(260, 80, 80, 20);
        lblCarID.setFont(new Font("Arial Black", Font.BOLD, 15));
        lblCarID.setForeground(Color.white);

        lblCarID006 = new JLabel("006");
        lblCarID006.setBounds(274, 104, 60, 20);
        lblCarID006.setFont(new Font("Arial Black", Font.BOLD, 15));
        lblCarID006.setForeground(Color.white);

        lblCarID007 = new JLabel("007");
        lblCarID007.setBounds(274, 147, 70, 20);
        lblCarID007.setFont(new Font("Arial Black", Font.BOLD, 15));
        lblCarID007.setForeground(Color.white);

        lblCarID008 = new JLabel("008");
        lblCarID008.setBounds(274, 187, 60, 20);
        lblCarID008.setFont(new Font("Arial Black", Font.BOLD, 15));
        lblCarID008.setForeground(Color.white);

        lblCarID009 = new JLabel("009");
        lblCarID009.setBounds(274, 227, 70, 20);
        lblCarID009.setFont(new Font("Arial Black", Font.BOLD, 15));
        lblCarID009.setForeground(Color.white);

        lblCarID010 = new JLabel("010");
        lblCarID010.setBounds(274, 267, 60, 20);
        lblCarID010.setFont(new Font("Arial Black", Font.BOLD, 15));
        lblCarID010.setForeground(Color.white);

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
        add(suv);

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

