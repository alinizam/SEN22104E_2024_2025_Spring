/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05;

/**
 *
 * @author FSMVU
 */
public class Example08 {
  public static void main(String[] args) {
    String s="Ahmet";
    char [] chars={'A','h','m','e','t'};
    String s1=new String(chars);
    System.out.println(s1);
 
    String name="Ahmet";
    name="Mehmet";
    name="Ahmet";
    
    System.out.println("Ahmet"=="Ahmet");
    System.out.println(name=="Ahmet");
    System.out.println(s1=="Ahmet");
    System.out.println(s1.equals("Ahmet"));
    
    Employee e1=new Employee();
    Employee e2;
    e2=e1;
    System.out.println(e1==e2);
    
    System.out.println(name.substring(0, 2));
    System.out.println(name.replace("e", "a"));       
    System.out.println(name);       
  }
}
