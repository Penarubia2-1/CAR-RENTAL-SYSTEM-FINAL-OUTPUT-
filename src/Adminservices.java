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
public class Adminservices extends JFrame implements ActionListener {
    private JLabel lblHiAdmin;
    private JButton btnexit,btnAdd,btnDelete,btnUpdate,btnRESERVATIONS,btnAVAILorNOT,btninvoices,btnclient;
    private JTable table;
    private JScrollPane scrollPane;
    Adminservices(){
        setTitle("Hi Admin!");
        setSize(1000,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        
        lblHiAdmin = new JLabel("Welcome, Admin! Check for Services",SwingConstants.CENTER);
        lblHiAdmin.setBounds(0, 5, 1000, 80);
        lblHiAdmin.setFont(new Font("Arial", Font.BOLD, 15));
        
        btnclient=new JButton("CLIENTS");
        btnclient.setBounds(100,60,100,30);
        
        btnRESERVATIONS=new JButton("RESERVATIONS");
        btnRESERVATIONS.setBounds(220,60,140,30);
        
        btnAVAILorNOT=new JButton("SERVICES");
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
        model.addColumn("Services");
        model.addColumn("Date_Repair");
        model.addColumn("Address");
        model.addColumn("Contact_Number");
        
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
    
        private void addRecord(String Email, String Services, String Date_Repair, String Address, String Contact_Number) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_loginadmin", "Jurie", "12345")) {
            String sql = "INSERT INTO admin_services(Email, Services, Date_Repair, Address,Contact_Number) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, Email);
                pstmt.setString(2, Services);
                pstmt.setString(3, Date_Repair);
                pstmt.setString(4, Address);
                pstmt.setString(5, Contact_Number);
                
                
                pstmt.executeUpdate();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
    
    }
        private void deleteRecord(int selectedRow) {
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_loginadmin", "Jurie", "12345")) {
        String sql = "DELETE FROM admin_services WHERE Email=?";
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

     private void updateRecord(int selectedRow, String Email, String Services, String Date_Repair, String Address, String Contact_Number) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_loginadmin", "Jurie", "12345")) {
            String sql = "UPDATE admin_services SET Email=?, Services=?, Date_Repair=?, Address=?, Contact_Number=? WHERE Email=?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, Email);
                pstmt.setString(2, Services);
                pstmt.setString(3, Date_Repair);
                pstmt.setString(4, Address);
                pstmt.setString(5, Contact_Number);
                
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
            String sql = "SELECT * FROM admin_services";
            rs = stmt.executeQuery(sql);

            // Process the result set
            while (rs.next()) {
                String Email = rs.getString("Email");
                String Services = rs.getString("Services");
                String Date_Repair = rs.getString("Date_Repair");
                String Address=rs.getString("Address");
                String Contact_Number=rs.getString("Contact_Number");                
               
                // Add row to table model
                model.addRow(new Object[]{Email,Services,Date_Repair,Address,Contact_Number});
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
            Adminservices ar =new Adminservices();
            ar.setVisible(true);
        }
        else if(e.getSource()==btninvoices){
            dispose();
            AdminInvoices ar =new AdminInvoices();
            ar.setVisible(true);
        
        }
        else if (e.getSource()==btnAdd){
            String Email = JOptionPane.showInputDialog(this, "Enter Email:");
            String Services = JOptionPane.showInputDialog(this, "Enter Services:");
            String Date_Repair = JOptionPane.showInputDialog(this, "Enter Date to Repair:");
            String Address = JOptionPane.showInputDialog(this, "Enter Address:");
            String Contact_Number = JOptionPane.showInputDialog(this, "Enter Contact_Number:");
            

            addRecord(Email, Services, Date_Repair, Address, Contact_Number);
            // Add the new record 
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.addRow(new Object[]{Email, Services, Date_Repair, Address,Contact_Number});
       
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
                String Services = JOptionPane.showInputDialog(this, "Enter new Services:", table.getValueAt(selectedRow, 1));
                String Date_Repair = JOptionPane.showInputDialog(this, "Enter new Date to Repair:", table.getValueAt(selectedRow, 2));
                String Address = JOptionPane.showInputDialog(this, "Enter new Address:", table.getValueAt(selectedRow, 3));
                String Contact_Number = JOptionPane.showInputDialog(this, "Enter new Contact Number:", table.getValueAt(selectedRow, 4));
                

                updateRecord(selectedRow, Email, Services, Date_Repair, Address, Contact_Number);
                // Update the table model
                table.setValueAt(Email, selectedRow, 0);
                table.setValueAt(Services, selectedRow, 1);
                table.setValueAt(Date_Repair, selectedRow, 2);
                table.setValueAt(Address, selectedRow, 3);
                table.setValueAt(Contact_Number, selectedRow, 4);
                

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

      
            
    