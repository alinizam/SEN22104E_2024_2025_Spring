/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07;

/**
 *
 * @author FSMVU
 */
public class Example09 {
  public static void main(String[] args) {
    StringBuilder sb=new StringBuilder();
    System.out.println(sb.length()+" "+sb.capacity());
    sb.append("Fatih");
    System.out.println(sb.length()+" "+sb.capacity());
    sb.append(" Sulten Mehmet Vakıf");
    System.out.println(sb.length()+" "+sb.capacity());
    
    sb.setLength(20);
    System.out.println(sb);
    System.out.println(sb.length()+" "+sb.capacity());

    
}
}