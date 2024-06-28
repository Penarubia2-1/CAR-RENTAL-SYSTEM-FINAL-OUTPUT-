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

public class InvoiceDisplay extends JFrame {
    private JLabel lblInvoice;

    InvoiceDisplay(String customerName, String vehicleModel, String baseCostPerDay, String additionalCost, String rentalDays) {
        setTitle("Invoice");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        lblInvoice = new JLabel("<html><b>Customer Name:</b> " + customerName + "<br>"
                + "<b>Vehicle ID:</b> " + vehicleModel + "<br>"
                + "<b>Base Cost Per Day:</b> $" + baseCostPerDay + "<br>"
                + "<b>Additional Cost:</b> $" + additionalCost + "<br>"
                + "<b>Rental Days:</b> " + rentalDays + "<br>"
                + "<b>Total Amount Due:</b> $" + calculateTotal(baseCostPerDay, additionalCost, rentalDays)
                + "</html>");
        lblInvoice.setBounds(20, 20, 360, 200);
        lblInvoice.setFont(new Font("Arial", Font.PLAIN, 16));

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
}

