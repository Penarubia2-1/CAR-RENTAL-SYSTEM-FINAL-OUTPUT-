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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class AdminInvoices extends JFrame implements ActionListener {
    private JLabel lblHiAdmin;
    private JButton btnexit,btnAdd,btnDelete,btnUpdate,btnRESERVATIONS,btnAVAILorNOT,btninvoices,btnclient;
    private JTable table;
    private JScrollPane scrollPane;
    AdminInvoices(){
        setTitle("Hi Admin!");
        setSize(1000,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        lblHiAdmin = new JLabel("Welcome, Admin! Check for INVOICE",SwingConstants.CENTER);
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
        model.addColumn("Invoie ID");
        model.addColumn("Customer Name");
        model.addColumn("Vehicle ID");
        model.addColumn("Cost Per Day");
        model.addColumn("Rental Days");

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
        btnclient.addActionListener(this);
        btnDelete.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnRESERVATIONS.addActionListener(this);
        btnAVAILorNOT.addActionListener(this);
    }
     private void updateRecord(int selectedRow, String Email, String Vehicle_ID, String Days, String bcpday, String rentaldays) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_loginadmin", "Jurie", "12345")) {
            String sql = "UPDATE tbl_invoices SET Email=?, Vehicle_ID=?, Days=?, Address=?, Contact_Number=? WHERE Email=?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, Email);
                pstmt.setString(2, Vehicle_ID);
                pstmt.setString(3, Days);
                pstmt.setString(4, bcpday);
                pstmt.setString(5, rentaldays);
                pstmt.setString(6, (String) table.getValueAt(selectedRow, 0));
                pstmt.executeUpdate();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
     private void deleteRecord(int selectedRow) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_loginadmin", "Jurie", "12345");
            String sql = "DELETE FROM tbl_invoices WHERE Invoice_ID=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, (String) table.getValueAt(selectedRow, 0)); 
            pstmt.executeUpdate();

            // Remove row from table model
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.removeRow(selectedRow);

            JOptionPane.showMessageDialog(this, "Record deleted successfully.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

         private void fetchAndDisplayRecords(DefaultTableModel model)  {
         Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Connect to the database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_loginadmin", "Jurie", "12345");

            stmt = conn.createStatement();
            String sql = "SELECT * FROM tbl_invoices";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String Email = rs.getString("Email");
                String Vehicle_ID = rs.getString("Vehicle_ID");
                String Days = rs.getString("Days");
                String bcpday =rs.getString("bcpday");   
                String rentaldays=rs.getString("rentaldays");
                // Add row to table model
                model.addRow(new Object[]{Email,Vehicle_ID,Days,bcpday,rentaldays});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            // Close 
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
         else if(e.getSource()== btnclient){
             dispose();
             Admin ad = new Admin();
                  ad.setVisible(true);
         
          } else if (e.getSource() == btnDelete) {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this record?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    deleteRecord(selectedRow);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            }}
         else if(e.getSource()==btnUpdate){
              int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                String Email = JOptionPane.showInputDialog(this, "Enter new Email:", table.getValueAt(selectedRow, 0));
                String Vehicle_ID = JOptionPane.showInputDialog(this, "Enter new Vehicle ID:", table.getValueAt(selectedRow, 1));
                String Days = JOptionPane.showInputDialog(this, "Enter new Days:", table.getValueAt(selectedRow, 2));
                String bcpday = JOptionPane.showInputDialog(this, "Enter new Cost Per Day:", table.getValueAt(selectedRow, 3));
                String rentaldays = JOptionPane.showInputDialog(this, "Enter new Rental Days:", table.getValueAt(selectedRow, 4));
                updateRecord(selectedRow, Email, Vehicle_ID, Days, bcpday, rentaldays);
                // Update the table 
                table.setValueAt(Email, selectedRow, 0);
                table.setValueAt(Vehicle_ID, selectedRow, 1);
                table.setValueAt(Days, selectedRow, 2);
                table.setValueAt(bcpday, selectedRow, 3);
                table.setValueAt(rentaldays, selectedRow, 4);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a row to update");
            }
        }
    
         }
          public static void main(String[] args) {
        new AdminInvoices();
    }}    
    

       

