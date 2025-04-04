/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04;

/**
 *
 * @author FSMVU
 */
public class Example08 {

  public static void main(String[] args) {
    try {
      int i = 1 / 1;
      return;
    } catch (Exception e) {
      System.out.println("Error");
    } finally {
      //cleanup 
      System.out.println("Finaly worked");
    }
  }
}
