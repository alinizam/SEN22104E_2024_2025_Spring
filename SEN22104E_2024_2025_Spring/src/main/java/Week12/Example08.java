/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Persistence;

/**
 *
 * @author ali.nizam
 */
 
public class Example08{
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("mycompany_SEN22104E_2024_2025");
        EntityManager em=emf.createEntityManager();
        Employee e=new Employee();
        e.setEmployeeId(10);
        e.setFirstName("Ahmet");
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        
    }
    
}
