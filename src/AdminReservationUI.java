/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
import com.mysql.cj.x.protobuf.MysqlxCrud.Update;
import com.mysql.cj.xdevapi.Table;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import static java.awt.event.PaintEvent.UPDATE;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class AdminReservationUI extends JFrame implements ActionListener {
    JLabel lblHiAdmin;
    JButton btnexit,btnAdd,btnedit,btnDelete,btnUpdate,btngenerate,btnRESERVATIONS,btnAVAILorNOT,btninvoices,btnclient;
    private JTable table;
    private JScrollPane scrollPane;
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
        model.addColumn("Vehicle_ID");
        model.addColumn("Days");
        model.addColumn("Address");
        model.addColumn("Contact Number");

        // Fetch records from database and populate the table
        fetchAndDisplayRecords(model);

        setVisible(true);
    
        
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
        add(btninvoices);
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
        btninvoices.addActionListener(this);

    }
    private void Update (){
         Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Connect to the database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_loginadmin", "Jurie", "12345");

            // Create and execute a query
            stmt = conn.createStatement();
   String sql = "UPDATE tbl_bookingreservation SET Email=?, Vehicle_ID=?, Days=?, Address=?, Contact_Number=? WHERE Email=?";            rs = stmt.executeQuery(sql);

            // Process the result set
            while (rs.next()) {
                String Email = rs.getString("Email");
                String Vehicle_ID = rs.getString("Vehicle_ID");
                String Days = rs.getString("Days");
                String Address =rs.getString("Address");
                               
                String Contact_Number=rs.getString("Contact_Number");
                // Add row to table model
                model.addRow(new Object[]{Email,Vehicle_ID,Days,Address,Contact_Number});
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
       private void fetchAndDisplayRecords(DefaultTableModel model)  {
         Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Connect to the database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_loginadmin", "Jurie", "12345");

            // Create and execute a query
            stmt = conn.createStatement();
            String sql = "SELECT * FROM tbl_bookingreservation";
            rs = stmt.executeQuery(sql);

            // Process the result set
            while (rs.next()) {
                String Email = rs.getString("Email");
                String Vehicle_ID = rs.getString("Vehicle_ID");
                String Days = rs.getString("Days");
                String Address =rs.getString("Address");
                               
                String Contact_Number=rs.getString("Contact_Number");
                // Add row to table model
                model.addRow(new Object[]{Email,Vehicle_ID,Days,Address,Contact_Number});
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
        else if(e.getSource()==btnAVAILorNOT){
            AdminAVAILorNOT ar =new AdminAVAILorNOT();
            ar.setVisible(true);
        }
         else if(e.getSource()==btnclient){
            Admin ad = new Admin();
            
            ad.setVisible(true);
        }
         else if(e.getSource()==btngenerate){
            GenerateInvoices gi =new GenerateInvoices();
            gi.setVisible(true);
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
                        String Vehicle_ID = JOptionPane.showInputDialog(this, "Enter new contact:", table.getValueAt(selectedRow, 1));
                        String Days = JOptionPane.showInputDialog(this, "Enter new check-in date (YYYY-MM-DD):", table.getValueAt(selectedRow, 2));
                        String Address = JOptionPane.showInputDialog(this, "Enter new check-out date (YYYY-MM-DD):", table.getValueAt(selectedRow, 3));
                      
                        String Contact_Number = JOptionPane.showInputDialog(this, "Enter new room type:", table.getValueAt(selectedRow, 4));
                        try{
                       Update (selectedRow, Email,Vehicle_ID, Days,Address,Contact_Number);                    
                        } catch (IllegalArgumentException ex) {
                            JOptionPane.showMessageDialog(this, "Invalid date format. Use YYYY-MM-DD.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        }else {
                        JOptionPane.showMessageDialog(this, "Please select a row to update");
                    }
                    break;

               

               
        // Example:
        
    }
  
    }

}
    }
  
    
     
