/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class Admin extends JFrame implements ActionListener {
    private JLabel lblHiAdmin;
    private JButton btnexit,btnAdd,btnedit,btnDelete,btnUpdate,btnRESERVATIONS,btnAVAILorNOT,btninvoices,btnclient;
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
        btnAdd.setBounds(100, 600, 80, 40);
        
        btnedit = new JButton("EDIT");
        btnedit.setBounds(230, 600, 80, 40);
        
        btnDelete = new JButton("DELETE");
        btnDelete.setBounds(360, 600, 100, 40);

        btnUpdate = new JButton("UPDATE");
        btnUpdate.setBounds(490, 600, 100, 40);
       
        btnexit=new JButton("LOG OUT");
        btnexit.setBounds(700,600,120,40);
        //add
        add(lblHiAdmin);
        add(btnclient);
        add(btnRESERVATIONS);
        add(btnAVAILorNOT);
        add(btninvoices);
        add(btnexit);
        add(btnedit);
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
        dispose();
        if(e.getSource()==btnexit){
            
            WelcomeFrame wf=new WelcomeFrame();
            wf.setVisible(true);
        }
        else if(e.getSource()==btnRESERVATIONS){
            AdminReservationUI ar =new AdminReservationUI();
            ar.setVisible(true);
        }
        else if(e.getSource()==btnAVAILorNOT){
            AdminAVAILorNOT ar =new AdminAVAILorNOT();
            ar.setVisible(true);
        }
        else if(e.getSource()==btninvoices){
            AdminInvoices ar =new AdminInvoices();
            ar.setVisible(true);
        
    } 
       else if (e.getSource() instanceof JButton) {
            JButton clickedButton = (JButton) e.getSource();
            String buttonText = clickedButton.getText();

            int selectedRow = table.getSelectedRow();
            switch (buttonText) {
                case "Update":
                    if (selectedRow != -1) {
                        String Email = JOptionPane.showInputDialog(this, "Enter new name:", table.getValueAt(selectedRow, 0));
                        String Vehicle_ID = JOptionPane.showInputDialog(this, "Enter new Vehicle_ID:", table.getValueAt(selectedRow, 1));
                        String  Days = JOptionPane.showInputDialog(this, "Enter new Days :", table.getValueAt(selectedRow, 2));
                        String Address = JOptionPane.showInputDialog(this, "Enter new Address:", table.getValueAt(selectedRow, 3));
                        String Contact_Number= JOptionPane.showInputDialog(this, "Enter new Contact_Number:", table.getValueAt(selectedRow, 4));

                        
                    } else {
                        JOptionPane.showMessageDialog(this, "Please select a row to update");
                    }
                    break;

                case "Delete":
                    if (selectedRow != -1) {
                        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this reservation?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
                        if (confirm == JOptionPane.YES_OPTION) {
                            delete(selectedRow);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Please select a row to delete");
                    }
                    break;

                case "Add":
                    String name = JOptionPane.showInputDialog(this, "Enter Name:");
                    String contact = JOptionPane.showInputDialog(this, "Enter Contact:");
                    String checkInStr = JOptionPane.showInputDialog(this, "Enter Check-In Date (YYYY-MM-DD):");
                    String checkOutStr = JOptionPane.showInputDialog(this, "Enter Check-Out Date (YYYY-MM-DD):");
                    String roomType = JOptionPane.showInputDialog(this, "Enter Room Type:");

                    try {
                        Date checkInDate = java.sql.Date.valueOf(checkInStr);
                        Date checkOutDate = java.sql.Date.valueOf(checkOutStr);

                        addReservation(name, contact, checkInDate, checkOutDate, roomType);
                    } catch (IllegalArgumentException ex) {
                        JOptionPane.showMessageDialog(this, "Invalid date format. Use YYYY-MM-DD.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
            }
    }

}
                
}