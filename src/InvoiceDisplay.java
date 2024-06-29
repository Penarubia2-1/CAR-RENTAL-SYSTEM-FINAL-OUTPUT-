/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 639319165346
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InvoiceDisplay extends JFrame implements ActionListener{
    private JLabel lblInvoice;
    private JButton btnsend;
    private JTextArea txtInvoice;

    InvoiceDisplay(String customerName, String vehicleModel, String baseCostPerDay, String additionalCost, String rentalDays) {
        setTitle("Invoice");
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
                        
     String invoiceText = "Customer Name: " + customerName + "\n"
                + "Vehicle ID: " + vehicleModel + "\n"
                + "Base Cost Per Day: $" + baseCostPerDay + "\n"
                + "Additional Cost: $" + additionalCost + "\n"
                + "Rental Days: " + rentalDays + "\n"
                + "Total Amount Due: $" + calculateTotal(baseCostPerDay, additionalCost, rentalDays);

JTextArea txtInvoice = new JTextArea(invoiceText);
txtInvoice.setBounds(20, 20, 360, 200);
txtInvoice.setFont(new Font("Arial", Font.PLAIN, 16));
txtInvoice.setEditable(false);
txtInvoice.setBackground(null);
txtInvoice.setBorder(null);

add(txtInvoice); 
        btnsend = new JButton("Send Email");
        btnsend.setBounds(80,190,150,30);
        btnsend.setFont(new Font("Arial", Font.BOLD, 18));
        btnsend.setBackground(Color.orange);
        btnsend.setForeground(Color.black);
        btnsend.addActionListener(this);
        add(btnsend);

        add(lblInvoice);

        setVisible(true);
        setResizable(false);
    }

    private String calculateTotal(String baseCostPerDay, String additionalCost, String rentalDays) {
        
        double baseCost = Double.parseDouble(baseCostPerDay);
        double addCost = Double.parseDouble(additionalCost);
        int days = Integer.parseInt(rentalDays);

        double total = (baseCost + addCost) * days;
        return String.format("%.2f", total);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}

