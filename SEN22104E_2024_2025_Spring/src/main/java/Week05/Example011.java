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
public class Example011 {
    public static void main(String[] args) {
      FileReader f=null;
      try {
        f=new FileReader("c:\\files\\hello.txt");
        
        System.out.println("success");
        return; 
      } catch (IOException ex) {
        System.out.println("exception");
        Logger.getLogger(Example011.class.getName()).log(Level.SEVERE, null, ex);
      }finally{
          System.out.println("finally");
          if (f!=null)
             try {
               f.close();
           } catch (IOException ex1) {
             Logger.getLogger(Example011.class.getName()).log(Level.SEVERE, null, ex1);
           }
      }
      
  }
}
