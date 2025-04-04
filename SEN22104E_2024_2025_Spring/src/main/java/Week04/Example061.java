/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FSMVU
 */
public class Example061 {

  //Specify type solution
  public static void main(String[] args) throws FileNotFoundException, IOException {
    //catch type solution
    FileReader r = new FileReader("c:\\c\\hello.txt");
    System.out.println((char) r.read());
    System.out.println((char) r.read());
    System.out.println((char) r.read());
  }
}
