/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14Lab;

import Week12.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ali.nizam
 */
public class Example05 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("FSMVU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        try (BufferedReader f = new BufferedReader(new FileReader("c:\\files\\employees.txt"))) {
            String line;
            while ((line = f.readLine()) != null) {
                int salary = Integer.parseInt((line.split(" "))[3]);
                salary += 1000;
                System.out.println(salary);
                Employee e = em.find(Employee.class, Integer.parseInt((line.split(" "))[0]));
                e.setSalary(String.valueOf(salary));

            }

            em.getTransaction().commit();

        } catch (Exception e) {

            System.out.println(e.getLocalizedMessage());
        }

    }

}
