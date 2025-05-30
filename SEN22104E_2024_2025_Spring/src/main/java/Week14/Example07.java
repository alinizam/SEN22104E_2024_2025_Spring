/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author FSMVU
 */
public class Example07 {

  public static void main(String[] args) throws IOException {
    char c;
    // Create a BufferedReader using System.in
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter 'q’ to quit.");
    // read characters
    do {
      c = (char) br.read();
      System.out.println(c);
    } while (c != 'q');
    br.close();
  }
}
