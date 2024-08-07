import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daiichi Magno
 */
public class BookingReservation  extends JFrame implements ActionListener {
    private JLabel lblVehicleModel, lbldays, lblAddress,lblContactnumber,lblreturn,Reservation,lblname;
    private JTextField txtfldname = new JTextField();
    private JComboBox<String> vehiclecmb;
    private JTextField txtflddays = new JTextField();
    private JTextField txtfldreturndays = new JTextField();
    private JTextField txtfldAddress = new JTextField();
    private JTextField txtfldContactnumber = new JTextField();   
    private JButton btnreserve, btnBack, btnReset;
    private Connection connn;

    private static final String[]id={"Chevrolet","Mustang","Ford","Challenger","Dodge","Cherry Tiggo",
    "Land Rover","Geely GX3","Bai Wagon","Mini MPV","Mini Van","Box Van","Micro Van","Panel Van","Mazda 2","Mazda 3","BYD Dolphin","Honda Brio",
    "Toyota Wigo","Ford Ranger","Toyota Hilux","Isuzu D-Max","Nissan Navarra","Foton Thunder"};
    
    BookingReservation(){
    setTitle("Reservtion");
    setSize(600, 600);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setBackground(Color.black);
     try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the database connection
            String url = "jdbc:mysql://localhost:3308/db_loginadmin";
            String username = "Jurie";
            String password = "12345";
            connn = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database connection error: " + ex.getMessage());
            ex.printStackTrace();
        }
    
     //image
        Reservation = new JLabel();
        Reservation.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\63931\\OneDrive\\Pictures\\Documents\\NetBeansProjects\\New\\CAR-RENTAL-SYSTEM-FINAL-OUTPUT-\\src\\imgreservation.png").getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH)));
        Reservation.setBounds(0, 120, 600, 600);
         
    
    lblname = new JLabel("EMAIL:");
    lblname.setBounds(90, 50, 200, 30);
    lblname.setFont(new Font("Arial", Font.BOLD, 20));
    lblname.setForeground(Color.white);
    
    
    
    lblVehicleModel = new JLabel("VEHICLE:");
    lblVehicleModel.setBounds(90, 100, 200, 30);
    lblVehicleModel.setFont(new Font("Arial", Font.BOLD, 20));
    lblVehicleModel.setForeground(Color.white);
    
    
    lbldays = new JLabel("DATE OF RENT:");
    lbldays.setBounds(90, 150, 200, 30);
    lbldays.setFont(new Font("Arial", Font.BOLD, 20));
    lbldays.setForeground(Color.white);
    
    lblreturn = new JLabel("DATE OF RETURN:");
    lblreturn.setBounds(90, 200, 200, 30);
    lblreturn.setFont(new Font("Arial", Font.BOLD, 20));
    lblreturn.setForeground(Color.white);
    
    lblAddress = new JLabel("ADDRESS:");
    lblAddress.setBounds(90, 250, 200, 30);
    lblAddress.setFont(new Font("Arial", Font.BOLD, 20));
    lblAddress.setForeground(Color.white);
    
    lblContactnumber = new JLabel("CONTACT NUMBER:");
    lblContactnumber.setBounds(90, 300, 200, 30);
    lblContactnumber.setFont(new Font("Arial", Font.BOLD, 20));
    lblContactnumber.setForeground(Color.white);
        
    btnBack = new JButton("BACK");
    btnBack.setBounds(70, 350, 100, 30);
    btnBack.setFont(new Font("Arial", Font.BOLD, 15));
    btnBack.addActionListener(this);
    btnBack.setBackground(Color.yellow);
    
    btnReset = new JButton("CLEAR");
    btnReset.setBounds(230, 350, 100, 30);
    btnReset.setFont(new Font("Arial", Font.BOLD, 15));
    btnReset.addActionListener(this);
    btnReset.setBackground(Color.yellow);
    
    btnreserve = new JButton("RESERVE");
    btnreserve.setBounds(350, 350, 120, 30);
    btnreserve.setFont(new Font("Arial", Font.BOLD, 15));
    btnreserve.addActionListener(this);
    btnreserve.setBackground(Color.yellow);
    
    txtfldname.setBounds(280, 50, 200,30);
    txtfldname.setFont(new Font("Arial", Font.PLAIN, 20));
    
    vehiclecmb = new JComboBox<>(id);
    vehiclecmb.setBounds(280, 100, 200, 30);
    add(vehiclecmb);
   
    
    txtflddays.setBounds(280, 150, 200,30);
    txtflddays.setFont(new Font("Arial", Font.PLAIN, 20));
    
     txtfldreturndays.setBounds(280, 200, 200,30);
    txtfldreturndays.setFont(new Font("Arial", Font.PLAIN, 20)); 
    
    
    txtfldAddress.setBounds(280,250 , 200,30);
    txtfldAddress.setFont(new Font("Arial", Font.PLAIN, 20));
    
    txtfldContactnumber.setBounds(290, 300, 200,30);
    txtfldContactnumber.setFont(new Font("Arial", Font.PLAIN, 20));
   
 
    
 
 
    add(btnreserve);
    add(btnBack);
    add(lblVehicleModel);
    add(btnReset);
    add(lbldays);
    add(lblreturn);
    add(txtfldreturndays);
    add(lblContactnumber);
    add(lblAddress);
    add(txtflddays);
    add(txtfldContactnumber);
    add(txtfldAddress);
    add(Reservation);
    add(txtfldname);      
    add(lblname);
    
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
         
            if(e.getSource() == btnBack){
                dispose();
            ChooseServices cs = new ChooseServices();
            cs.setVisible(true);
    }
   else if(e.getSource() == btnReset){     
            String vID =(String) vehiclecmb.getSelectedItem();
            txtflddays.setText("");
            txtfldContactnumber.setText("");
            txtfldAddress.setText("");
            txtfldname.setText("");
            
          
           
        }
   else if (e.getSource() == btnreserve){
      try{
       String insertQuery = "INSERT INTO tbl_bookingreservation (Email, Vehicle_ID, Days,Address,Contact_Number) VALUES (?, ?, ?, ?, ?)";
          
       PreparedStatement pstmt = connn.prepareStatement(insertQuery);
                pstmt.setString(1, txtfldname.getText());
                pstmt.setString(2, (java.lang.String) vehiclecmb.getSelectedItem());
                pstmt.setString(3, txtflddays.getText());
                pstmt.setString(4, txtfldAddress.getText());
                pstmt.setString(5, txtfldContactnumber.getText());
              
            
                int rowsInserted = pstmt.executeUpdate();
                if (rowsInserted > 0) {
                   dispose();
                    JOptionPane.showMessageDialog(this, "Sign up successful! User added to database.");
                }
                  
                

                // Clear input fields after successful signup
                

            } catch (NumberFormatException | SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    
   }
}

    