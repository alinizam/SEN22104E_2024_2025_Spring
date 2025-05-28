/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14Lab;
import Week12.Employee;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.Query;
/**
 *
 * @author ali.nizam
 */
public class Example04 {
    public static void main(String[] args) throws IOException {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("FSMVU");
        EntityManager em=emf.createEntityManager();
        Query q=em.createQuery("select e from Employee e");
        List<Employee> employees=q.getResultList();
        BufferedWriter f=new BufferedWriter(new FileWriter("c:\\files\\employees.txt"));
        for (Employee e : employees) {
            f.write(e.getEmployeeId()+" "+e.getFirstName()+" "+e.getLastname()+" "+e.getSalary());
            f.newLine();
        }
        f.close();
        em.close();
        emf.close();
    }
}
