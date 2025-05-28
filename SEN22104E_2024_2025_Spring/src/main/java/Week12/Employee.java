/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ali.nizam
 */
@Entity
@Table(name="employee")
public class Employee implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "EmployeeId")
    private Integer employeeId;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "Lastname")
    private String lastname;
    @Column(name = "Salary")
    private String salary;

    private static final long serialVersionUID = 1L;

    
    
 

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int id) {
        this.employeeId = id;
    }
  
    @Override
    public String toString() {
        return "Week12.Employee[ id=" + employeeId + " ]";
    }

    public Employee() {
    }

    public Employee(Integer employeeId) {
        this.employeeId = employeeId;
    }

    

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    

    
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeId != null ? employeeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.employeeId == null && other.employeeId != null) || (this.employeeId != null && !this.employeeId.equals(other.employeeId))) {
            return false;
        }
        return true;
    }

     
    
}
