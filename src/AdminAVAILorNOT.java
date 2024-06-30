/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
public class AdminAVAILorNOT extends JFrame implements ActionListener {
    JLabel lblHiAdmin;
    JButton btnexit,btnAdd,btnedit,btnDelete,btnUpdate,btnRESERVATIONS,btnAVAILorNOT,btnclient;
     private JFrame frame;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JButton disableLabel1Button;
    private JButton enableLabel1Button;
    private JButton disableLabel2Button;
    private JButton enableLabel2Button;
    private JButton disableLabel3Button;
    private JButton enableLabel3Button;
    private JButton disableLabel4Button;
    private JButton enableLabel4Button;
    private JButton disableLabel5Button;
    private JButton enableLabel5Button;
    AdminAVAILorNOT(){
        setTitle("Customize Car if Available or Not");
        setSize(1000,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        lblHiAdmin = new JLabel("Welcome, Admin!You are now Changes of Available Car",SwingConstants.CENTER);
        lblHiAdmin.setBounds(0, 5, 1000, 80);
        lblHiAdmin.setFont(new Font("Arial", Font.BOLD, 15));
        
        btnclient=new JButton("CLIENTS");
        btnclient.setBounds(100,60,100,30);
        
        btnRESERVATIONS=new JButton("RESERVATIONS");
        btnRESERVATIONS.setBounds(220,60,140,30);
        
        btnAVAILorNOT=new JButton("CHANGES OF CAR");
        btnAVAILorNOT.setBounds(380,60,190,30);
        
        btnAdd = new JButton("ADD");
        btnAdd.setBounds(100, 600, 80, 40);
        
        btnedit = new JButton("EDIT");
        btnedit.setBounds(230, 600, 80, 40);
        
        btnDelete = new JButton("DELETE");
        btnDelete.setBounds(360, 600, 100, 40);

        btnUpdate = new JButton("UPDATE");
        btnUpdate.setBounds(490, 600, 100, 40);
       
        btnexit=new JButton("LOG OUT");
        btnexit.setBounds(700,600,120,40);
        
        label1 = new JLabel("Muscle");
        label1.setBounds(80,150,100,30);
        
                
        label2 = new JLabel("PickUpCar");
        label2.setBounds(80,200,100,30);
        
        label3 = new JLabel("SuvCar");
        label3.setBounds(80,250,100,30);
        
        label4 = new JLabel("VanCar");
        label4.setBounds(80,300,100,30);
        label5 = new JLabel("HatchBackCar");
        label5.setBounds(80,350,100,30);
        
        // Create buttons to disable and enable labels
        disableLabel1Button = new JButton("Disable");
        disableLabel1Button.setBounds(280, 150, 80, 30);
        disableLabel1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label1.setEnabled(false);
            }
        });
        
        enableLabel1Button = new JButton("Enable");
        enableLabel1Button.setBounds(200, 150, 80, 30);
        enableLabel1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label1.setEnabled(true);
            }
        });
        
        disableLabel2Button = new JButton("Disable");
        disableLabel2Button.setBounds(280, 200, 80, 30);
        disableLabel2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label2.setEnabled(false);
            }
        });
        
        enableLabel2Button = new JButton("Enable");
        enableLabel2Button.setBounds(200, 200, 80, 30);
        enableLabel2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label2.setEnabled(true);
            }
        });
         disableLabel3Button = new JButton("Disable");
         disableLabel3Button.setBounds(280, 250, 80, 30);
        disableLabel3Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label3.setEnabled(false);
            }
        });
        
         
        enableLabel3Button = new JButton("Enable");
        enableLabel3Button.setBounds(200, 250, 80, 30);
        enableLabel3Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label3.setEnabled(true);
            }
        });
        enableLabel4Button = new JButton("Enable");
        enableLabel4Button.setBounds(200, 300, 80, 30);
       
        enableLabel4Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label4.setEnabled(true);
            }
        });
       disableLabel4Button = new JButton("Disable");
       disableLabel4Button.setBounds(280, 300, 80, 30);
        disableLabel4Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label4.setEnabled(true);
            }
        });
        enableLabel5Button = new JButton("Enable");
        enableLabel5Button.setBounds(200, 350, 80, 30);
        enableLabel5Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label5.setEnabled(true);
            }
        });
        disableLabel5Button = new JButton("Disable");
        disableLabel5Button.setBounds(280, 350, 80, 30);
        disableLabel5Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label5.setEnabled(true);
            }
        });
        
        //add
        add(lblHiAdmin);
        add(btnclient);
        add(btnRESERVATIONS);
        add(btnAVAILorNOT);
        add(btnexit);
        add(btnAdd);
        add(btnedit);
        add(btnDelete);
        add(btnUpdate);
        add(label1);
        add(disableLabel1Button);
        add(enableLabel1Button);
        add(label2);
        add(disableLabel2Button);
        add(enableLabel2Button);
        add(disableLabel3Button);
        add(disableLabel4Button);
        add(disableLabel5Button);
        add(enableLabel3Button);
        add(enableLabel4Button);
        add(enableLabel5Button);
        add(label3);
        add(label4);
        add(label5);
        
        //add
        btnexit.addActionListener(this);
        btnAdd.addActionListener(this);
        btnDelete.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnclient.addActionListener(this);
        btnRESERVATIONS.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if(e.getSource()==btnexit){      
            WelcomeFrame wf=new WelcomeFrame();
            wf.setVisible(true);
        }
        else if(e.getSource()==btnRESERVATIONS){
            AdminReservationUI ar =new AdminReservationUI();
            ar.setVisible(true);
        }
         else if(e.getSource()==btnclient){
            Admin ar =new Admin();
            ar.setVisible(true);
        }
    }

       
}
