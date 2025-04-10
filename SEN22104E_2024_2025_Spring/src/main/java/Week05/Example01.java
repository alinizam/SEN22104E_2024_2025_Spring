/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FSMVU
 */
public class Example01 {
    public static void main(String[] args) {
      FileReader f=null;
      try {
        f=new FileReader("c:\\files\\hello.txt");
        System.out.println("read");
        f.close();
        
      } catch (IOException ex) {
        if (f!=null)
          try {
            f.close();
        } catch (IOException ex1) {
          Logger.getLogger(Example01.class.getName()).log(Level.SEVERE, null, ex1);
        }
        Logger.getLogger(Example01.class.getName()).log(Level.SEVERE, null, ex);
      }
      
  }
}
