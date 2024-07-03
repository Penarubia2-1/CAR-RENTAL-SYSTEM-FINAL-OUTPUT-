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

public class SignUp extends JFrame implements ActionListener {
    private JLabel lblSignUp, lblEmail, lblAge, lblPhone, lblAddress, lblPostalcode, lblConfirmPassword, lblPassword, bg;
    private JTextField txtfldEmail, txtfldAge, txtfldPhone, txtfldAddress, txtfldPostalcode;
    private JPasswordField psswrdfldConfirmPassword, psswrdfldPassword;
    private JButton btnSignUp, btnclear, btnback;
    private Connection con;

    SignUp() {
        setSize(800, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);

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
        lblEmail.setBounds(50, 80, 100, 30);
        lblEmail.setFont(new Font("Arial", Font.BOLD, 20));
        lblEmail.setForeground(Color.white);

        lblPhone = new JLabel("Phone");
        lblPhone.setBounds(320, 80, 160, 20);
        lblPhone.setFont(new Font("Arial", Font.BOLD, 20));
        lblPhone.setForeground(Color.white);

        lblAge = new JLabel("Age");
        lblAge.setBounds(630, 75, 100, 30);
        lblAge.setFont(new Font("Arial", Font.BOLD, 20));
        lblAge.setForeground(Color.white);

        lblAddress = new JLabel("Address");
        lblAddress.setBounds(50, 155, 100, 20);
        lblAddress.setFont(new Font("Arial", Font.BOLD, 20));
        lblAddress.setForeground(Color.white);

        lblPostalcode = new JLabel("Postal Code");
        lblPostalcode.setBounds(500, 155, 180, 20);
        lblPostalcode.setFont(new Font("Arial", Font.BOLD, 20));
        lblPostalcode.setForeground(Color.white);

        lblPassword = new JLabel("Password");
        lblPassword.setBounds(50, 220, 100, 20);
        lblPassword.setFont(new Font("Arial", Font.BOLD, 20));
        lblPassword.setForeground(Color.white);

        lblConfirmPassword = new JLabel("Confirm Password");
        lblConfirmPassword.setBounds(360, 220, 200, 20);
        lblConfirmPassword.setFont(new Font("Arial", Font.BOLD, 20));
        lblConfirmPassword.setForeground(Color.white);

        // Initialize JTextFields
        txtfldEmail = new JTextField();
        txtfldEmail.setBounds(110, 80, 190, 30);
        txtfldEmail.setFont(new Font("Arial", Font.PLAIN, 15));

        txtfldPhone = new JTextField();
        txtfldPhone.setBounds(485, 75, 130, 30);
        txtfldPhone.setFont(new Font("Arial", Font.PLAIN, 15));

        txtfldAge = new JTextField();
        txtfldAge.setBounds(670, 75, 80, 30);
        txtfldAge.setFont(new Font("Arial", Font.PLAIN, 15));

        txtfldAddress = new JTextField();
        txtfldAddress.setBounds(145, 150, 300, 30);
        txtfldAddress.setFont(new Font("Arial", Font.PLAIN, 15));

        txtfldPostalcode = new JTextField();
        txtfldPostalcode.setBounds(625, 150, 100, 30);
        txtfldPostalcode.setFont(new Font("Arial", Font.PLAIN, 15));

        // Initialize JPasswordFields
        psswrdfldPassword = new JPasswordField();
        psswrdfldPassword.setBounds(160, 220, 180, 30);
        psswrdfldPassword.setFont(new Font("Arial", Font.PLAIN, 15));

        psswrdfldConfirmPassword = new JPasswordField();
        psswrdfldConfirmPassword.setBounds(550, 220, 180, 30);
        psswrdfldConfirmPassword.setFont(new Font("Arial", Font.PLAIN, 15));

        // Initialize JButtons
        btnback = new JButton("BACK");
        btnback.setBounds(130, 290, 150, 40);
        btnback.setFont(new Font("Arial", Font.BOLD, 20));
        btnback.setForeground(Color.black);
        btnback.setBackground(Color.orange);
        btnback.addActionListener(this);

        btnclear = new JButton("CLEAR");
        btnclear.setBounds(350, 290, 130, 40);
        btnclear.setFont(new Font("Arial", Font.BOLD, 20));
        btnclear.setForeground(Color.black);
        btnclear.setBackground(Color.orange);
        btnclear.addActionListener(this);

        btnSignUp = new JButton("SIGN UP");
        btnSignUp.setBounds(500, 290, 150, 40);
        btnSignUp.setFont(new Font("Arial", Font.BOLD, 20));
        btnSignUp.setForeground(Color.black);
        btnSignUp.setBackground(Color.orange);
        btnSignUp.addActionListener(this);

        // Set background image
        bg = new JLabel();
        bg.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\63931\\OneDrive\\Pictures\\Documents\\NetBeansProjects\\New\\CAR-RENTAL-SYSTEM-FINAL-OUTPUT-\\src\\imgsignup.png")
                .getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH)));
        bg.setBounds(0, 100, 800, 600);

        // Add components to the frame
        add(lblEmail);
        add(lblPhone);
        add(lblSignUp);
        add(lblAddress);
        add(lblPostalcode);
        add(lblPassword);
        add(lblConfirmPassword);
        add(lblAge);
        add(btnSignUp);
        add(txtfldEmail);
        add(txtfldAge);
        add(txtfldPhone);
        add(txtfldAddress);
        add(txtfldPostalcode);
        add(psswrdfldPassword);
        add(psswrdfldConfirmPassword);
        add(btnback);
        add(btnclear);
        add(bg);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSignUp) {
            try {
                // Validate age
                int age = Integer.parseInt(txtfldAge.getText());
                if (age < 18) {
                    JOptionPane.showMessageDialog(this, "You must be 18 years or older to sign up.", "Age Restriction", JOptionPane.ERROR_MESSAGE);
                    return; // Stop execution if age is less than 18
                }

                // Insert data into database
                String insertQuery = "INSERT INTO tbl_Client (email, phone, age, address, postalcode, password) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmt = con.prepareStatement(insertQuery);
                pstmt.setString(1, txtfldEmail.getText());
                pstmt.setString(2, txtfldPhone.getText());
                pstmt.setInt(3, age);
                pstmt.setString(4, txtfldAddress.getText());
                pstmt.setString(5, txtfldPostalcode.getText());
                pstmt.setString(6, new String(psswrdfldPassword.getPassword()));

                int rowsInserted = pstmt.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Sign up successful! User added to database.");
                      Login ca=new Login();
                  ca.setVisible(true);
                }

                // Clear input fields after successful signup
                clearFields();

            } catch (NumberFormatException | SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        } else if (e.getSource() == btnback) {
           
            ClientAdmin ca=new ClientAdmin();
                  ca.setVisible(true);
                  dispose();
            // Handle back button action
        } else if (e.getSource() == btnclear) {
            // Handle clear button action
            clearFields();
        }
    }

    // Method to clear input fields
    private void clearFields() {
        txtfldEmail.setText("");
        txtfldAge.setText("");
        txtfldPhone.setText("");
        txtfldAddress.setText("");
        txtfldPostalcode.setText("");
        psswrdfldPassword.setText("");
        psswrdfldConfirmPassword.setText("");
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

    public static void main(String[] args) {
        // Create an instance of SignUp frame
        new SignUp();
    }
}
