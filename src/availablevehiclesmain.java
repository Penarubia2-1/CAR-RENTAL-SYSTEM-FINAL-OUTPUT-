


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author John Mark Penarubia
 */
import java.awt.EventQueue;
public class availablevehiclesmain  {
      public static void main(String[] args) {
        // TODO code application logic here
        
  EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                availablevehicles av = new availablevehicles();
                av.setVisible(true);         
            }
            
         });
      }
}
     

 