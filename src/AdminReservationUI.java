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
public class AdminReservationUI extends JFrame implements ActionListener {
    JLabel lblHiAdmin;
    JButton btnexit,btnAdd,btnedit,btnDelete,btnUpdate,btngenerate,btnRESERVATIONS,btnAVAILorNOT,btnclient;
    AdminReservationUI(){
        setTitle("Hi Admin!");
        setSize(1000,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        lblHiAdmin = new JLabel("Welcome, Admin!You are now in RESERVATION",SwingConstants.CENTER);
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
        btnedit.setBounds(200, 600, 80, 40);
        
        btnDelete = new JButton("DELETE");
        btnDelete.setBounds(300, 600, 100, 40);

        btnUpdate = new JButton("UPDATE");
        btnUpdate.setBounds(420, 600, 100, 40);
        
        btngenerate = new JButton("GENERATE INVOICE");
        btngenerate.setBounds(600, 600, 190, 40);
       
        btnexit=new JButton("LOG OUT");
        btnexit.setBounds(810,600,120,40);
        
        //add
        add(lblHiAdmin);
        add(btnclient);
        add(btnRESERVATIONS);
        add(btnAVAILorNOT);
        add(btnexit);
        add(btngenerate);
        add(btnAdd);
        add(btnedit);
        add(btnDelete);
        add(btnUpdate);
        //add
        btnexit.addActionListener(this);
        btnAdd.addActionListener(this);
        btnDelete.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnclient.addActionListener(this);
        btnAVAILorNOT.addActionListener(this);
        btngenerate.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if(e.getSource()==btnexit){
            
            WelcomeFrame wf=new WelcomeFrame();
            wf.setVisible(true);
        }
        else if(e.getSource()==btnAVAILorNOT){
            AdminAVAILorNOT ar =new AdminAVAILorNOT();
            ar.setVisible(true);
        }
         else if(e.getSource()==btnclient){
            Admin ar =new Admin();
            ar.setVisible(true);
        }
         else if(e.getSource()==btngenerate){
            GenerateInvoices gi =new GenerateInvoices();
            gi.setVisible(true);
        }
    }

   
       
}
