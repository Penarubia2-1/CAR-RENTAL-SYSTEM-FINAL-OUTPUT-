import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author John Christopher Marfil
 * 
 */



public class GenerateInvoices extends JFrame implements ActionListener {
    private JLabel generate, lblcstmrName, lblVehicleModel, lblBaseCostPerDay, lblinvoice, lblRentalDays;
    private JTextField txtfldName = new JTextField();
    private JComboBox<String> vehiclecmb;
    private JTextField txtBCPday = new JTextField();
    private JTextField txtAdd = new JTextField();
    private JTextField txtDays = new JTextField();
    private JButton btnGenerate, btnBack, btnClear;
    
    private static final String[]id={"001","002","003","004","005","006",
    "007","008","009","010","011","012","013","014","015","016","017","018",
    "019","020","021","022","023","024","025"};
    GenerateInvoices() {
        setTitle("Generate Rental Invoices");
        setSize(600, 550);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        
      generate= new JLabel("GENERATE INVOICE",SwingConstants.CENTER);  
      generate.setBounds(0,20,600,30);
      generate.setFont(new Font("Arial Black",Font.BOLD,15));
      generate.setForeground(Color.white);
      add(generate);
      
      //additionalcost
      lblinvoice= new JLabel("Invoice ID");  
      lblinvoice.setBounds(80,90,190,30);
      lblinvoice.setFont(new Font("Arial Black",Font.BOLD,15));
      lblinvoice.setForeground(Color.white);

      
      txtAdd.setBounds(260,90,180,30);
      txtAdd.setFont(new Font("Arial",Font.BOLD,13));
      
      lblcstmrName= new JLabel("Customer Name");  
      lblcstmrName.setBounds(80,140,160,30);
      lblcstmrName.setFont(new Font("Arial Black",Font.BOLD,15));
      lblcstmrName.setForeground(Color.white);

      
      txtfldName.setBounds(260,140,180,30);
      txtfldName.setFont(new Font("Arial",Font.BOLD,13));
      
      //vehiclemodel
      lblVehicleModel= new JLabel("Vehicle ID");  
      lblVehicleModel.setBounds(80,190,160,30);
      lblVehicleModel.setFont(new Font("Arial Black",Font.BOLD,15));
      lblVehicleModel.setForeground(Color.white);

      vehiclecmb = new JComboBox<>(id);
      vehiclecmb.setBounds(260, 190, 180, 30);
      add(vehiclecmb);
     
      //basecost
      lblBaseCostPerDay= new JLabel("Cost Per Day");  
      lblBaseCostPerDay.setBounds(80,240,190,30);
      lblBaseCostPerDay.setFont(new Font("Arial Black",Font.BOLD,15));
      lblBaseCostPerDay.setForeground(Color.white);

     
      txtBCPday.setBounds(260,240,180,30);
      txtBCPday.setFont(new Font("Arial",Font.BOLD,13));
      
      //rentaldays
      lblRentalDays= new JLabel("Rental Days");  
      lblRentalDays.setBounds(80,290,190,30);
      lblRentalDays.setFont(new Font("Arial Black",Font.BOLD,15));
      lblRentalDays.setForeground(Color.white);

      txtDays.setBounds(260,290,180,30);
      txtDays.setFont(new Font("Arial",Font.BOLD,13));
      
      //button
      btnGenerate=new JButton("GENERATE INVOICES");
      btnGenerate.setBounds(300,335,180,30);
      btnGenerate.setFont(new Font("Arial",Font.BOLD,13));
      btnGenerate.addActionListener(this);
      btnGenerate.setBackground(Color.YELLOW);
      
      btnBack=new JButton("BACK");
      btnBack.setBounds(80,335,100,30);
      btnBack.setFont(new Font("Arial",Font.BOLD,13));
      btnBack.addActionListener(this);
      btnBack.setBackground(Color.YELLOW);
      
      btnClear=new JButton("Clear");
      btnClear.setBounds(190,335,100,30);
      btnClear.setFont(new Font("Arial",Font.BOLD,13));
      btnClear.addActionListener(this);
      btnClear.setBackground(Color.YELLOW);
      
      
      //add
      add(lblcstmrName);
      add(txtfldName);
      add(lblVehicleModel);
      add(lblBaseCostPerDay);
      add(txtBCPday);
      add(lblinvoice);
      add(txtAdd);
      add(lblRentalDays);
      add(txtDays);
      add(btnGenerate);
      add(btnBack);
      add(btnClear);
       

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnClear) {
            clearFields();
        } else if (e.getSource() == btnGenerate) {
            dispose();
            String name = txtfldName.getText();
            String vID =(String) vehiclecmb.getSelectedItem();
            String bcpDay = txtBCPday.getText();
            String add = txtAdd.getText();
            String days = txtDays.getText();
            //invoice
            new InvoiceDisplay(name, vID, bcpDay, add, days);
            
            clearFields(); 
        }
    
    else if(e.getSource()==btnBack){
        dispose();
        AdminReservationUI ar= new AdminReservationUI();
        ar.setVisible(true);
    }
    }
    private void clearFields() {
        txtfldName.setText("");
        vehiclecmb.setSelectedIndex(0);
        txtBCPday.setText("");
        txtAdd.setText("");
        txtDays.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GenerateInvoices();
        });
    }
}
