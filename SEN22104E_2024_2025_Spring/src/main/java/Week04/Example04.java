/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04;

/**
 *
 * @author FSMVU
 */
public class Example04 {
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
    try {
      Employee e = null;
      System.out.println(e.name);
      System.out.println("Not any error");
    }catch (Exception e){
      System.out.println("there is an error: "+e.toString());
    }
    System.out.println("b is finish succesfully");
  }
}
