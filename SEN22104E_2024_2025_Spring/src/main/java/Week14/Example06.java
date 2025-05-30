/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author FSMVU
 */
public class Example06 {
  public static void main(String[] args) throws FileNotFoundException {
     PrintWriter pw = new PrintWriter("c:\\files\\a.txt");
     pw.format("%08d%n", 5);
     pw.format("%08d%n", 123135);
     pw.format("%08d%n", 512);
     pw.format("%08d%n", 85);
     pw.format("%08d%n", 52313);
         
     pw.close();
  }
}
