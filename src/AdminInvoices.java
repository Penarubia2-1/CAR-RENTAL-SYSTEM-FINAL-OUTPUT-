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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class AdminInvoices extends JFrame implements ActionListener {
    private JLabel lblHiAdmin;
    private JButton btnexit,btnAdd,btnedit,btnDelete,btnUpdate,btnRESERVATIONS,btnAVAILorNOT,btninvoices,btnclient;
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
            String sql = "SELECT * FROM tbl_invoices";
            rs = stmt.executeQuery(sql);

            // Process the result set
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
         else if(e.getSource()== btnclient){
             Admin ad = new Admin();
                  ad.setVisible(true);
         }
             
    }

       
}
