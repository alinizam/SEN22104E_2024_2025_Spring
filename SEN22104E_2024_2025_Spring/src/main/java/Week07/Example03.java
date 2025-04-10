/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07;

/**
 *
 * @author FSMVU
 */
public class Example03 {
  public static void main(String[] args) {
    int a=3;
    changeA(a);
    System.out.println(a);
    Employee e=new Employee();
    e.salary=5000;
    changeEmpSalary(e);
    System.out.println(e.salary);
    String s="5000";
    changeString(s);
    System.out.println(s);
    
  }
  
  static void changeString(String text){
    text="10000";
  }
  static void changeEmpSalary(Employee emp){
    emp.salary=10000;
  }
  static void changeA(int aValue){
    aValue=5;
  }
}
