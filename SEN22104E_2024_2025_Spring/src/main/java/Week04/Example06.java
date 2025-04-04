/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FSMVU
 */
public class Example06 {
  public static void main(String[] args) {
    //catch type solution
    try {
      FileReader r=new FileReader("c:\\c\\hello.txt");
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Example06.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
