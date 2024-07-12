import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminReservationUI extends JFrame implements ActionListener {
    JLabel lblHiAdmin;
    JButton btnexit, btnAdd, btnedit, btnDelete, btnUpdate, btngenerate, btnRESERVATIONS, btnAVAILorNOT, btninvoices, btnclient;
    private JTable table;
    private JScrollPane scrollPane;

    public AdminReservationUI() {
        setTitle("Hi Admin!");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        lblHiAdmin = new JLabel("Welcome, Admin! You are now in RESERVATION", SwingConstants.CENTER);
        lblHiAdmin.setBounds(0, 5, 1000, 80);
        lblHiAdmin.setFont(new Font("Arial", Font.BOLD, 15));

        btnclient = new JButton("CLIENTS");
        btnclient.setBounds(100, 60, 100, 30);

        btnRESERVATIONS = new JButton("RESERVATIONS");
        btnRESERVATIONS.setBounds(220, 60, 140, 30);

        btnAVAILorNOT = new JButton("SERVICES");
        btnAVAILorNOT.setBounds(380, 60, 190, 30);

        btninvoices = new JButton("INVOICES");
        btninvoices.setBounds(590, 60, 190, 30);

        // Table
        DefaultTableModel model = new DefaultTableModel();
        table = new JTable(model);
        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(130, 130, 640, 450);
        add(scrollPane);

        // Add columns to the table model
        model.addColumn("Email");
        model.addColumn("Vehicle");
        model.addColumn("Date of Rent");
        model.addColumn("Date of Return");
        model.addColumn("Address");
        model.addColumn("Contact Number");

        // Fetch records from database and populate the table
        fetchAndDisplayRecords(model);

        setVisible(true);

        btnAdd = new JButton("ADD");
        btnAdd.setBounds(150, 600, 80, 40);

      
        btnDelete = new JButton("DELETE");
        btnDelete.setBounds(250, 600, 100, 40);

        btnUpdate = new JButton("UPDATE");
        btnUpdate.setBounds(370, 600, 100, 40);

        btngenerate = new JButton("GENERATE INVOICE");
        btngenerate.setBounds(600, 600, 190, 40);

        btnexit = new JButton("LOG OUT");
        btnexit.setBounds(810, 600, 120, 40);

        // Add components to the frame
        add(lblHiAdmin);
        add(btnclient);
        add(btnRESERVATIONS);
        add(btnAVAILorNOT);
        add(btninvoices);
        add(btnexit);
        add(btngenerate);
        add(btnAdd);
        add(btnDelete);
        add(btnUpdate);

        // Add action listeners
        btnexit.addActionListener(this);
        btnAdd.addActionListener(this);
        btnDelete.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnclient.addActionListener(this);
        btnAVAILorNOT.addActionListener(this);
        btngenerate.addActionListener(this);
        btninvoices.addActionListener(this);
    }
     

    private void addRecord(String Email, String Vehicle, String Date_Rent,String Date_Return, String Address, String Contact_Number) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_loginadmin", "Jurie", "12345")) {
            String sql = "INSERT INTO tbl_bookingreservation (Email, Vehicle,Date_Rent,Date_Return, Address, Conact_Number) VALUES (?, ?, ?, ?, ?,?)";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, Email);
                pstmt.setString(2, Vehicle);
                pstmt.setString(3, Date_Rent);
                pstmt.setString(4, Date_Return);
                pstmt.setString(5, Address);
                pstmt.setString(6, Contact_Number);
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
            String sql = "DELETE FROM tbl_bookingreservation WHERE Email=?";
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

    private void updateRecord(int selectedRow,String Email, String Vehicle, String Date_Rent,String Date_Return, String Address, String Contact_Number) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_loginadmin", "Jurie", "12345")) {
            String sql = "UPDATE tbl_bookingreservation SET Email=?, Vehicle=?, Date_Rent=?,Date_Return=? Address=?, Contact_Number=? WHERE Email=?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, Email);
                pstmt.setString(2, Vehicle);
                pstmt.setString(3, Date_Rent);
                pstmt.setString(4, Date_Return);
                pstmt.setString(5, Address);
                pstmt.setString(6, Contact_Number);
                pstmt.setString(7, (String) table.getValueAt(selectedRow, 0));
                pstmt.executeUpdate();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void fetchAndDisplayRecords(DefaultTableModel model) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_loginadmin", "Jurie", "12345");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM tbl_bookingreservation")) {

            while (rs.next()) {
                String Email = rs.getString("Email");
                String Vehicle = rs.getString("Vehicle");
                String Date_Rent = rs.getString("Day Rent");
                String Date_Return = rs.getString("Day Return");
                String Address = rs.getString("Address");
                String Contact_Number = rs.getString("Contact_Number");
                model.addRow(new Object[]{Email, Vehicle, Date_Rent,Date_Return, Address, Contact_Number});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnexit) {
            dispose();
            WelcomeFrame wf = new WelcomeFrame();
            wf.setVisible(true);
        } else if (e.getSource() == btnAVAILorNOT) {
            dispose();
            Adminservices ar = new Adminservices();
            ar.setVisible(true);
        } else if (e.getSource() == btnclient) {
            dispose();
            Admin ad = new Admin();
            ad.setVisible(true);
        } else if (e.getSource() == btngenerate) {
            dispose();
            GenerateInvoices gi = new GenerateInvoices();
            gi.setVisible(true);
        } else if (e.getSource() == btninvoices) {
            dispose();
            AdminInvoices ar = new AdminInvoices();
            ar.setVisible(true);
        }else if(e.getSource()==btnAdd){
            String Email = JOptionPane.showInputDialog(this, "Enter Email:");
            String Vehicle = JOptionPane.showInputDialog(this, "Enter Vehicle ID:");
            String Date_Rent = JOptionPane.showInputDialog(this, "Enter Days of Rent:");
            String Date_Return = JOptionPane.showInputDialog(this, "Enter Days of Return:");
            String Address = JOptionPane.showInputDialog(this, "Enter Address:");
            String Contact_Number = JOptionPane.showInputDialog(this, "Enter Contact Number:");
            addRecord(Email, Vehicle, Date_Rent,Date_Return, Address, Contact_Number);
            //add record
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.addRow(new Object[]{Email, Vehicle,Date_Rent, Date_Return, Address, Contact_Number});
    
        }else if(e.getSource()==btnDelete){
             int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this record?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    deleteRecord(selectedRow);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            }
        
        } else if (e.getSource() == btnUpdate) {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                String Email = JOptionPane.showInputDialog(this, "Enter new Email:", table.getValueAt(selectedRow, 0));
                String Vehicle = JOptionPane.showInputDialog(this, "Enter new Vehicle ID:", table.getValueAt(selectedRow, 1));
                String Date_Rent = JOptionPane.showInputDialog(this, "Enter new Days of Rent:", table.getValueAt(selectedRow, 2));
                String Date_Return = JOptionPane.showInputDialog(this, "Enter new Days of Return:", table.getValueAt(selectedRow, 3));
                String Address = JOptionPane.showInputDialog(this, "Enter new Address:", table.getValueAt(selectedRow, 4));
                String Contact_Number = JOptionPane.showInputDialog(this, "Enter new Contact Number:", table.getValueAt(selectedRow, 5));
                updateRecord(selectedRow, Email, Vehicle, Date_Rent,Date_Return, Address, Contact_Number);
                // Update the table 
                table.setValueAt(Email, selectedRow, 0);
                table.setValueAt(Vehicle, selectedRow, 1);
                table.setValueAt(Date_Rent, selectedRow, 2);
                table.setValueAt(Date_Return, selectedRow, 3);
                table.setValueAt(Address, selectedRow, 4);
                table.setValueAt(Contact_Number, selectedRow, 5);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a row to update");
            }
             
        }
    }

    public static void main(String[] args) {
        new AdminReservationUI();
    }

  
}
