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
public class Example01_2 {

  public static void main(String[] args) {

    try ( FileReader f = new FileReader("c:\\files\\hello.txt");
          FileReader f1 = new FileReader("c:\\files\\hello.txt")) {
      
      System.out.print((char)f.read());
      System.out.print((char)f.read());
      System.out.print((char)f.read());
      System.out.print((char)f.read());
      System.out.print((char)f.read());
      System.out.print((char)f.read());
      System.out.println((char)f.read());
      
      System.out.println("success");
      return;
    } catch (IOException ex) {
      System.out.println("exception");
      Logger.getLogger(Example01_2.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
