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
public class Admin extends JFrame implements ActionListener {
    JLabel lblHiAdmin;
    JButton btnexit,btnAdd,btnDelete,btnUpdate;
    Admin(){
        setTitle("Hi Admin!");
        setSize(1000,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        lblHiAdmin = new JLabel("Welcome, Admin!",SwingConstants.CENTER);
        lblHiAdmin.setBounds(400, 30, 150, 80);
        lblHiAdmin.setFont(new Font("Arial", Font.BOLD, 15));

        
        btnexit=new JButton("LOG OUT");
        btnexit.setBounds(700,500,120,40);
       
        btnAdd = new JButton("ADD");
        btnAdd.setBounds(200, 500, 80, 40);

        btnDelete = new JButton("DELETE");
        btnDelete.setBounds(350, 500, 100, 40);

        btnUpdate = new JButton("UPDATE");
        btnUpdate.setBounds(500, 500, 100, 40);
        
        //add
        add(lblHiAdmin);
        add(btnexit);
        add(btnAdd);
        add(btnDelete);
        add(btnUpdate);
        //add
        btnexit.addActionListener(this);
        btnAdd.addActionListener(this);
        btnDelete.addActionListener(this);
        btnUpdate.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if(e.getSource()==btnexit){
            
            ClientAdmin ca=new ClientAdmin();
            ca.setVisible(true);
        }
     }

       
}
