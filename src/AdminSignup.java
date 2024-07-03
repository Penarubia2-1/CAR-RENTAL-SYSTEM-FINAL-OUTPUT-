/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 639319165346
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;

public class AdminSignup extends JFrame implements ActionListener {
    private JLabel lblSignUp, lblEmail, lblPassword, bg;
    private JTextField txtfldEmail;
    private JPasswordField  psswrdfldPassword;
    private JButton btnSignUp, btnclear, btnback;
    private Connection con;

    AdminSignup() {
        setSize(800, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        bg = new JLabel();
        bg.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\63931\\OneDrive\\Pictures\\Documents\\NetBeansProjects\\New\\CAR-RENTAL-SYSTEM-FINAL-OUTPUT-\\src\\imgsignup.png")
                .getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH)));
        bg.setBounds(0, 100, 800, 600);

        // Connect to the database
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the database connection
            String url = "jdbc:mysql://localhost:3308/db_loginadmin";
            String username = "Jurie";
            String password = "12345";
            con = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database connection error: " + ex.getMessage());
            ex.printStackTrace();
        }

        // UI components setup
        initializeUI();

        // Display the frame
        setVisible(true);
    }

    private void initializeUI() {
        // Initialize JLabels
        lblSignUp = new JLabel("Sign Up", SwingConstants.CENTER);
        lblSignUp.setBounds(0, 20, 800, 40);
        lblSignUp.setFont(new Font("Arial", Font.BOLD, 30));
        lblSignUp.setForeground(Color.white);

        lblEmail = new JLabel("Email");
        lblEmail.setBounds(200, 130, 100, 30);
        lblEmail.setFont(new Font("Arial", Font.BOLD, 20));
        lblEmail.setForeground(Color.white);


        lblPassword = new JLabel("Password");
        lblPassword.setBounds(200, 180, 100, 20);
        lblPassword.setFont(new Font("Arial", Font.BOLD, 20));
        lblPassword.setForeground(Color.white);

       

        txtfldEmail = new JTextField();
        txtfldEmail.setBounds(360, 130, 190, 30);
        txtfldEmail.setFont(new Font("Arial", Font.PLAIN, 15));
        // Initialize JPasswordFields
        psswrdfldPassword = new JPasswordField();
        psswrdfldPassword.setBounds(360, 190, 190, 30);
        psswrdfldPassword.setFont(new Font("Arial", Font.PLAIN, 15));


        btnback = new JButton("BACK");
        btnback.setBounds(130, 280, 150, 40);
        btnback.setFont(new Font("Arial", Font.BOLD, 20));
        btnback.setForeground(Color.black);
        btnback.setBackground(Color.orange);
        btnback.addActionListener(this);

        btnclear = new JButton("CLEAR");
        btnclear.setBounds(350, 280, 130, 40);
        btnclear.setFont(new Font("Arial", Font.BOLD, 20));
        btnclear.setForeground(Color.black);
        btnclear.setBackground(Color.orange);
        btnclear.addActionListener(this);

        btnSignUp = new JButton("SIGN UP");
        btnSignUp.setBounds(500, 280, 150, 40);
        btnSignUp.setFont(new Font("Arial", Font.BOLD, 20));
        btnSignUp.setForeground(Color.black);
        btnSignUp.setBackground(Color.orange);
        btnSignUp.addActionListener(this);

        

        // Add components to the frame
        add(lblEmail);
       add(lblSignUp);

        add(txtfldEmail);
       add(lblPassword);
        add(psswrdfldPassword);
         add(btnback);
        add(btnclear);
     
        add(btnSignUp);
      add(bg);
    }  

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSignUp) {
            try {
               
                
                

                // Insert data into database
                String insertQuery = "INSERT INTO tbl_admin (email,password) VALUES (?, ?)";
                PreparedStatement pstmt = con.prepareStatement(insertQuery);
                pstmt.setString(1, txtfldEmail.getText());
                
                pstmt.setString(2, new String(psswrdfldPassword.getPassword()));

                int rowsInserted = pstmt.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Sign up successful! User added to database.");
                         LoginAdmin la=new LoginAdmin();
                  la.setVisible(true);
                }

                // Clear input fields after successful signup
                clearFields();

            } catch (NumberFormatException | SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        } else if (e.getSource() == btnback) {
                              LoginAdmin la=new LoginAdmin();
                  la.setVisible(true);
            // Handle back button action
        } else if (e.getSource() == btnclear) {
            // Handle clear button action
            clearFields();
        }
    }

    // Method to clear input fields
    private void clearFields() {
        txtfldEmail.setText("");
        
        psswrdfldPassword.setText("");
       
    }

    // Close database connection when closing the window
    @Override
    public void dispose() {
        super.dispose();
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    
}

