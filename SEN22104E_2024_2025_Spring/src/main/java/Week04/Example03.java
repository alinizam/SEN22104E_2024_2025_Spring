/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04;

/**
 *
 * @author FSMVU
 */
public class Example03 {

  public static void main(String[] args) {
    try {
      Employee e = null;
      System.out.println(e.name);
      System.out.println("Not any error");
    }catch (Exception e){
      System.out.println("there is an error: "+e.toString());
    }
    System.out.println("Finished");
  }
}
