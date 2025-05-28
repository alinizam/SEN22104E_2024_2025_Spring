/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Week13Lab;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ali.nizam
 */
public class Mavenproject4 {

    public static void main(String[] args) {

        getEmployeeById(201);

    }

    static void insertNewActor() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_mavenproject4_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();

        Actor a = new Actor();
        a.setActorId((short) 201);
        a.setFirstName("Ahmet");
        a.setLastName("Mehmet");

        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

    static void getEmployee() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_mavenproject4_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("select a from Actor a");
        List<Actor> actors = q.getResultList();
        for (Actor actor : actors) {
            System.out.println(actor.getFirstName() + " " + actor.getLastName());
        }
    }
    
    
     static void getEmployeeWithNamedQuery() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_mavenproject4_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createNamedQuery("Actor.findAll");
        List<Actor> actors = q.getResultList();
        for (Actor actor : actors) {
            System.out.println(actor.getFirstName() + " " + actor.getLastName());
        }
    }

    static void getEmployeeById(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_mavenproject4_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        Actor actor = em.find(Actor.class, (short)id);

        System.out.println(actor.getFirstName() + " " + actor.getLastName());

    }
    
    static void getAndUpdateEmployeeById(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_mavenproject4_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        
         em.getTransaction().begin();
 

        Actor actor = em.find(Actor.class, (short)id);
        actor.setLastName("AkAk");
        
        
        em.getTransaction().commit();
        em.close();
        emf.close();

    }
    
    
    static void updateEmployee() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_mavenproject4_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("Update Actor a set a.lastName='Ak' where a.actorId=:pId");
        q.setParameter("pId", (short)201);
        em.getTransaction().begin();
        q.executeUpdate();
        em.getTransaction().commit();
        em.close();
        emf.close();
        
    }

}
