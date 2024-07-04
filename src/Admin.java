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
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Admin extends JFrame implements ActionListener {
    private JLabel lblHiAdmin;
    private JButton btnexit,btnAdd,btnDelete,btnUpdate,btnRESERVATIONS,btnAVAILorNOT,btninvoices,btnclient;
    private JTable table;
    private JScrollPane scrollPane;
    Admin(){
        setTitle("Hi Admin!");
        setSize(1000,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        
        lblHiAdmin = new JLabel("Welcome, Admin! Check for Clients",SwingConstants.CENTER);
        lblHiAdmin.setBounds(0, 5, 1000, 80);
        lblHiAdmin.setFont(new Font("Arial", Font.BOLD, 15));
        
        btnclient=new JButton("CLIENTS");
        btnclient.setBounds(100,60,100,30);
        
        btnRESERVATIONS=new JButton("RESERVATIONS");
        btnRESERVATIONS.setBounds(220,60,140,30);
        
        btnAVAILorNOT=new JButton("CHANGES OF CAR");
        btnAVAILorNOT.setBounds(380,60,190,30);
        
        btninvoices=new JButton("INVOICES");
        btninvoices.setBounds(590,60,190,30);
        
        //table
         // Create table model
        DefaultTableModel model = new DefaultTableModel();
        table = new JTable(model);
        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(130, 130, 640, 450);
        add(scrollPane);

        // Add columns to the table model
        model.addColumn("Email");
        model.addColumn("Contact Number");
        model.addColumn("Age");
        model.addColumn("Address");
        model.addColumn("Postal Code");
        model.addColumn("Password");
        // Fetch records from database and populate the table
        fetchAndDisplayRecords(model);

        setVisible(true);
    
         
        btnAdd = new JButton("ADD");
        btnAdd.setBounds(150, 600, 80, 40);
        
        
        
        btnDelete = new JButton("DELETE");
        btnDelete.setBounds(310, 600, 100, 40);

        btnUpdate = new JButton("UPDATE");
        btnUpdate.setBounds(440, 600, 100, 40);
       
        btnexit=new JButton("LOG OUT");
        btnexit.setBounds(700,600,120,40);
        //add
        add(lblHiAdmin);
        add(btnclient);
        add(btnRESERVATIONS);
        add(btnAVAILorNOT);
        add(btninvoices);
        add(btnexit);
        add(btnAdd);
        add(btnDelete);
        add(btnUpdate);
        
        //addActionListener
        btnexit.addActionListener(this);
        btnAdd.addActionListener(this);
        btnDelete.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnRESERVATIONS.addActionListener(this);
        btnAVAILorNOT.addActionListener(this);
        btninvoices.addActionListener(this);
    }
        private void addRecord(String Email, String Age, String Phone, String Address, String PostalCode,String  Password) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_loginadmin", "Jurie", "12345")) {
            String sql = "INSERT INTO tbl_client (Email, Vehicle_ID, Days, bcpday, rentaldays) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, Email);
                pstmt.setString(2, Age);
                pstmt.setString(3, Phone);
                pstmt.setString(4, Address);
                pstmt.setString(5, PostalCode);
                pstmt.setString(6, Password);
                
                pstmt.executeUpdate();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
    
    }
        private void deleteRecord(int selectedRow) {
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_loginadmin", "Jurie", "12345")) {
        String sql = "DELETE FROM tbl_client WHERE Email=?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            String emailToDelete = (String) table.getValueAt(selectedRow, 0);
            pstmt.setString(1, emailToDelete);
            pstmt.executeUpdate();
            // Remove row from JTable
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.removeRow(selectedRow);
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}

     private void updateRecord(int selectedRow, String Email, String Age, String Phone, String Address, String PostalCode,String Password) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_loginadmin", "Jurie", "12345")) {
            String sql = "UPDATE tbl_client SET Email=?, Age=?, Phone=?, Address=?, PostalCode=?,Password=? WHERE Email=?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, Email);
                pstmt.setString(2, Age);
                pstmt.setString(3, Phone);
                pstmt.setString(4, Address);
                pstmt.setString(5, PostalCode);
                pstmt.setString(6, Password);
                pstmt.setString(7, (String) table.getValueAt(selectedRow, 0));
                pstmt.executeUpdate();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
         
     
    
        private void fetchAndDisplayRecords(DefaultTableModel model)  {
         Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Connect to the database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_loginadmin", "Jurie", "12345");

            // Create and execute a query
            stmt = conn.createStatement();
            String sql = "SELECT * FROM tbl_client";
            rs = stmt.executeQuery(sql);

            // Process the result set
            while (rs.next()) {
                String Email = rs.getString("Email");
                String Age = rs.getString("Age");
                String Phone = rs.getString("Phone");
                String Address=rs.getString("Address");
                String Postalcode=rs.getString("PostalCode");                
                String Password=rs.getString("Password");
                // Add row to table model
                model.addRow(new Object[]{Email,Age,Phone,Address,Postalcode,Password});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }       
        }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnexit){
            dispose();
            WelcomeFrame wf=new WelcomeFrame();
            wf.setVisible(true);
        }
        else if(e.getSource()==btnRESERVATIONS){
            dispose();
            AdminReservationUI ar =new AdminReservationUI();
            ar.setVisible(true);
        }
        else if(e.getSource()==btnAVAILorNOT){
            dispose();
            AdminAVAILorNOT ar =new AdminAVAILorNOT();
            ar.setVisible(true);
        }
        else if(e.getSource()==btninvoices){
            dispose();
            AdminInvoices ar =new AdminInvoices();
            ar.setVisible(true);
        
        }
        else if (e.getSource()==btnAdd){
            String Email = JOptionPane.showInputDialog(this, "Enter Email:");
            String Age = JOptionPane.showInputDialog(this, "Enter Age:");
            String Phone = JOptionPane.showInputDialog(this, "Enter Contact Number:");
            String Address = JOptionPane.showInputDialog(this, "Enter Address:");
            String PostalCode = JOptionPane.showInputDialog(this, "Enter Postal Code:");
            String Password = JOptionPane.showInputDialog(this, "Enter Password:");

            addRecord(Email, Age, Phone, Address, PostalCode,Password);
            // Add the new record 
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.addRow(new Object[]{Email, Age, Phone, Address,PostalCode, Password});
       
        }
        else if (e.getSource() == btnDelete){
           
    int selectedRow = table.getSelectedRow();
    if (selectedRow != -1) {
        deleteRecord(selectedRow);
    } else {
        JOptionPane.showMessageDialog(this, "Please select a row to delete");
    }
}

                   
        
        else if (e.getSource() == btnUpdate) {
          int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                String Email = JOptionPane.showInputDialog(this, "Enter new Email:", table.getValueAt(selectedRow, 0));
                String Age = JOptionPane.showInputDialog(this, "Enter new Vehicle ID:", table.getValueAt(selectedRow, 1));
                String Phone = JOptionPane.showInputDialog(this, "Enter new Days:", table.getValueAt(selectedRow, 2));
                String Address = JOptionPane.showInputDialog(this, "Enter new Address:", table.getValueAt(selectedRow, 3));
                String PostalCode = JOptionPane.showInputDialog(this, "Enter new Contact Number:", table.getValueAt(selectedRow, 4));
                String Password = JOptionPane.showInputDialog(this, "Enter new Contact Number:", table.getValueAt(selectedRow, 4));

                updateRecord(selectedRow, Email, Age, Phone, Address, PostalCode,Password);
                // Update the table model
                table.setValueAt(Email, selectedRow, 0);
                table.setValueAt(Age, selectedRow, 1);
                table.setValueAt(Phone, selectedRow, 2);
                table.setValueAt(Address, selectedRow, 3);
                table.setValueAt(PostalCode, selectedRow, 4);
                 table.setValueAt(Password, selectedRow, 4);

            } 
        
        
        
            else {
                JOptionPane.showMessageDialog(this, "Please select a row to update");
            }
    }
        
        }

 public static void main(String[] args) {
        new Admin();
    }
}

      
            
    


                
