/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author FSMVU
 */
public class Example02 {
   
  public static void main(String[] args) throws SQLException {
    // TODO code application logic here
    String address="jdbc:mysql://localhost:3306/world";
    String user="root";
    String password="fsmsen";
    Connection c=DriverManager.getConnection(address,user,password);
    Statement s=c.createStatement();
    int salary=4000;
    //String sqlString="SELECT * FROM employee WHERE salary>"+salary;

    String firstName="Ahmet";
    String sqlString="SELECT * FROM employee WHERE firstname='"+firstName+"'";
    System.out.println(sqlString);
    ResultSet rs=s.executeQuery(sqlString);
    while(rs.next()){
        System.out.println(rs.getInt("EmpID")+" "+rs.getString("FirstName")+" "+rs.getString("LastName"));
    }
    c.close();
    System.out.println("Connected");  
  }
}
