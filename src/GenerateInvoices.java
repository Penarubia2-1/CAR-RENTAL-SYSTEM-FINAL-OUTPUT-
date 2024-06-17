import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marfil
 * 
 */

public class GenerateInvoices extends JFrame implements ActionListener{
  private JFrame f= new JFrame("Generate Rental Invoices"); 
  private JLabel lblcstmrName,lblVehicleModel,lblBaseCostPerDay,lblAdditionalCost,lblRentalDays;
  private JTextField txtfldName=new JTextField();
  private JTextField txtVModel=new JTextField();
  private JTextField txtBCPday=new JTextField();
  private JTextField txtAdd=new JTextField();
  private JTextField txtDays=new JTextField();
  private JButton btnGenerate,btnBack;
  
  GenerateInvoices(){
      f.setSize(600,500);
      f.setLayout(null);
      f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
      
      //customername
      lblcstmrName= new JLabel("Customer Name");  
      lblcstmrName.setBounds(80,50,160,30);
      lblcstmrName.setFont(new Font("Arial Black",Font.BOLD,15));
      
      txtfldName.setBounds(260,50,180,30);
      txtfldName.setFont(new Font("Arial",Font.PLAIN,13));
      
      //vehiclemodel
      lblVehicleModel= new JLabel("Vehicle ID");  
      lblVehicleModel.setBounds(80,95,160,30);
      lblVehicleModel.setFont(new Font("Arial Black",Font.BOLD,15));
      
      txtVModel.setBounds(260,95,180,30);
      txtVModel.setFont(new Font("Arial",Font.PLAIN,13));
      
      //basecost
      lblBaseCostPerDay= new JLabel("Base Cost Per Day");  
      lblBaseCostPerDay.setBounds(80,135,190,30);
      lblBaseCostPerDay.setFont(new Font("Arial Black",Font.BOLD,15));
      
      txtBCPday.setBounds(260,135,180,30);
      txtBCPday.setFont(new Font("Arial",Font.PLAIN,13));
      
      //additionalcost
      lblAdditionalCost= new JLabel("Base Cost Per Day");  
      lblAdditionalCost.setBounds(80,175,190,30);
      lblAdditionalCost.setFont(new Font("Arial Black",Font.BOLD,15));
      
      txtAdd.setBounds(260,175,180,30);
      txtAdd.setFont(new Font("Arial",Font.PLAIN,13));
      
      //rentaldays
      lblRentalDays= new JLabel("Rental Days");  
      lblRentalDays.setBounds(80,215,190,30);
      lblRentalDays.setFont(new Font("Arial Black",Font.BOLD,15));
      
      txtDays.setBounds(260,215,180,30);
      txtDays.setFont(new Font("Arial",Font.PLAIN,13));
      
      //button
      btnGenerate=new JButton("GENERATE INVOICES");
      btnGenerate.setBounds(250,272,180,30);
      btnGenerate.setFont(new Font("Arial",Font.BOLD,13));
      btnGenerate.addActionListener(this);
      
      btnBack=new JButton("BACK");
      btnBack.setBounds(140,272,100,30);
      btnBack.setFont(new Font("Arial",Font.BOLD,13));
      btnBack.addActionListener(this);
      
      
      //fadd
      f.add(lblcstmrName);
      f.add(txtfldName);
      f.add(lblVehicleModel);
      f.add(txtVModel);
      f.add(lblBaseCostPerDay);
      f.add(txtBCPday);
      f.add(lblAdditionalCost);
      f.add(txtAdd);
      f.add(lblRentalDays);
      f.add(txtDays);
      f.add(btnGenerate);
      f.add(btnBack);
      
      
      f.setVisible(true);
      f.setResizable(false);
      
  }
  @Override
  public void actionPerformed(ActionEvent e){
      
  }

   
}