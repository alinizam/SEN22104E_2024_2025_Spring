/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04;

/**
 *
 * @author FSMVU
 */
public class Example02 {
  public static void main(String[] args) {
    System.out.println("call a");
    a();
    System.out.println("call a returned successfully");
  }
  static void a(){
    System.out.println("a is called");
    b();            
    System.out.println("a is finish succesfully");
  }
  
   static void b(){
    System.out.println("b is called");
    Employee e=null;
    System.out.println(e.name);
    System.out.println("b is finish succesfully");
  }
}
