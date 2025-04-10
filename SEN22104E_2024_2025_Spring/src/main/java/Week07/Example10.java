/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07;

/**
 *
 * @author FSMVU
 */
public class Example10 {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    sb.append("Ahmet");
    System.out.println(sb);
    sb.append(" Ak");
    System.out.println(sb);
    sb.insert(0, "Student ");
    System.out.println(sb);
    sb.append(new char[]{' ','G', 'r', 'a','d','e'});
    System.out.println(sb.reverse());
  }
}
