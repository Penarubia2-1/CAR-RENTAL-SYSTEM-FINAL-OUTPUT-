import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InvoiceDisplay extends JFrame implements ActionListener {
    private JButton btnSend,btnback;
    private JTextArea txtInvoice;

    InvoiceDisplay(String email, String vID, String baseCostPerDay, String invoice, String rentalDays) {
        setTitle("Invoice");
        setSize(400, 550);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String invoiceText = "Invoice ID: " + invoice + "\n"+"\n"+
                "Email: " + email + "\n"+"\n"
                + "Vehicle Model: " + vID + "\n"+"\n"
                + "Base Cost Per Day: " + baseCostPerDay + "\n"+"\n"
                + "Rental Days: " + rentalDays + "\n"+"\n"
                + "Total Amount Due: " + calculateTotal(baseCostPerDay, rentalDays);

        txtInvoice = new JTextArea(invoiceText);
        txtInvoice.setBounds(80, 50, 290, 300);
        txtInvoice.setFont(new Font("Arial", Font.PLAIN, 16));
        txtInvoice.setEditable(false);
        txtInvoice.setBackground(null);
        txtInvoice.setBorder(null);
        add(txtInvoice);

        btnSend = new JButton("SAVE");
        btnSend.setBounds(110, 360, 190, 30);
        btnSend.setFont(new Font("Arial", Font.BOLD, 14));
        btnSend.setBackground(Color.ORANGE);
        btnSend.setForeground(Color.BLACK);
        btnSend.addActionListener(this);
        add(btnSend);
        
        btnback = new JButton("SEND ANOTHER INVOICE");
        btnback.setBounds(90, 405, 230, 30);
        btnback.setFont(new Font("Arial", Font.BOLD, 14));
        btnback.setBackground(Color.ORANGE);
        btnback.setForeground(Color.BLACK);
        btnback.addActionListener(this);
        add(btnback);

        setVisible(true);
        setResizable(false);
    }

    private String calculateTotal(String baseCostPerDay, String rentalDays) {
        double baseCost = Double.parseDouble(baseCostPerDay);
        int days = Integer.parseInt(rentalDays);
        double total = baseCost  * days;
        return String.format("%.2f", total);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSend) {
            JOptionPane.showMessageDialog(this, "Invoice Save!");
        }
        else if(e.getSource()==btnback){
            GenerateInvoices gi=new GenerateInvoices();
            gi.setVisible(true);
        }
    }

   }
