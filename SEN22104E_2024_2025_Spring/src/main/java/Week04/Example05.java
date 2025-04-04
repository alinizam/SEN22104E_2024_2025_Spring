/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04;

/**
 *
 * @author FSMVU
 */
public class Example05 {

  public static void main(String[] args) {
    System.out.println("call a");
    a();
    System.out.println("call a returned successfully");
  }

  static void a() {
    int i;
    System.out.println("a is called");
    try {
      b();
      i=1000000;
    } catch (Exception e) {
      System.out.println("there is an error in a: " + e.toString());
    }
    System.out.println("a is finish succesfully");
  }

  static void b() {
    System.out.println("b is called");

    Employee e = null;
    System.out.println(e.name);
    System.out.println("Not any error");
    System.out.println("b is finish succesfully");
  }
}
