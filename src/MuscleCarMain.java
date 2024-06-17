
import java.awt.EventQueue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author John Mark Penarubia
 */
public class MuscleCarMain extends availablevehicles{
     public static void main(String[] args) {
        // TODO code application logic here
        
  EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MuscleCar mc = new MuscleCar();
                mc.setVisible(true);         
            }
            
         });
      }
}