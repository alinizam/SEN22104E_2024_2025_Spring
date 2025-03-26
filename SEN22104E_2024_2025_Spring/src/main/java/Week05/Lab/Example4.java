/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05.Lab;

/**
 *
 * @author ali.nizam
 */
public class Example4 {

    public static void main(String[] args) {
        Employeee[] workers = new Employeee[3];
        Employeee p1 = new Employeee();
        p1.salary = 5000;
        workers[0] = p1;
        Employeee p2 = new Employeee();
        p2.salary = 10000;
        workers[2] = p2;
        int total = 0;
        for (Employeee p : workers) {
            try {
                 total += p.salary;
            } catch (Exception e) {
                System.out.println("No employeee");
            }
 
           
        }
        System.out.println("Total : "+total);

    }
}
