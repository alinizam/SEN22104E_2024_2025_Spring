/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FSMVU
 */
public class Example02 {

  public static void main(String[] args) {
    Scanner s = null;
    try {
      s = new Scanner(Paths.get("c:\\files\\hello.txt"));
      System.out.println(s.next());
      System.out.println(s.nextInt());
      if (s != null) {
        s.close();
      }
    } catch (IOException ex) {
      if (s != null) {
        s.close();
      }
      Logger.getLogger(Example02.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
