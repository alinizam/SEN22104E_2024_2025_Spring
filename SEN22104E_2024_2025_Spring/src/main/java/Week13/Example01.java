/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author ali.nizam
 */
public class Example01 {
    
    
    public static void main(String[] args) {
        displayDepartmentById();
    }
    static void displayDepartment(){
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_mavenproject4_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        Query q=em.createQuery("select d from Department d");
        List<Department> depts=q.getResultList();
        for (Department dept : depts) {
            System.out.println(dept);
        }
        em.close();
        emf.close();
    }
    
    static void changeDepartment(){
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_mavenproject4_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        
        Query q=em.createQuery("select d from Department d");
        List<Department> depts=q.getResultList();
        
        em.getTransaction().begin();
        Department dQuery=depts.get(0);
        dQuery.setDeptName("IT");
        Department dEM=em.find(Department.class, 1);
        dEM.setDeptName("GM");
        em.detach(dEM);
        
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
    static void displayDepartmentById(){
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_mavenproject4_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        
        Query q=em.createQuery("select d from Department d where d.deptId>:deptID");
        q.setParameter("deptID", 1);
        List<Department> depts=q.getResultList(); 
        for (Department dept : depts) {
            System.out.println(dept);
        } 
        em.close();
        emf.close();
    }
    
    static void enterDepartment(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_mavenproject4_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(new Department(3, "MN"));
        
        em.getTransaction().commit();
        em.close();
        emf.close();
    
    }
}
