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
public class Example02_2 {

  public static void main(String[] args) {
    try(Scanner s= new Scanner(Paths.get("c:\\files\\hello.txt"));) {
      System.out.println(s.next());
      System.out.println(s.nextInt());
    } catch (IOException ex) {
      Logger.getLogger(Example02_2.class.getName()).log(Level.SEVERE, null, ex);
    }  
  }
}
