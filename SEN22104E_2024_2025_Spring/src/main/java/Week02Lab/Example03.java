/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02Lab;

import javax.swing.JFrame;

/**
 *
 * @author ali.nizam
 */
public class Example03 {

    public static void main(String[] args) {
        Object o = new Example01();
        Example01 e = new Example01();

        Employee e1 = new Employee();
        Object o1 = e1;
        Employee e2 = (Employee) o1;
        e2.setFirstName("Ahmet");
        // System.out.println(e1.getFirstName());
        displayName(e1);
        displayName(new Object());
        displayName(o1);
    }

    static void displayName(Object o) {
        if (o instanceof Employee) {
            Employee  e=(Employee)o;
            System.out.println(e.getFirstName()); 
        }
       

    }
}
