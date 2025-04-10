/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07;

/**
 *
 * @author FSMVU
 */
public class Example08StringBuilder {
  public static void main(String[] args) {

    StringBuilder s = new StringBuilder("a");
    for (int i = 0; i < 1000000; i++) {
      s.append( "a");
    }
    System.out.println(s);
  }
}
