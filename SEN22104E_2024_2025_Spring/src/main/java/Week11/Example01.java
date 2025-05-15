/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week11;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author FSMVU
 */
public class Example01 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) throws SQLException {
    // TODO code application logic here
    String address="jdbc:mysql://localhost:3306/world";
    String user="root";
    String password="fsmsen";
    Connection c=DriverManager.getConnection(address,user,password);
    Statement s=c.createStatement();
    ResultSet rs=s.executeQuery("SELECT * FROM employee");
    while(rs.next()){
        System.out.println(rs.getInt("EmpID")+" "+rs.getString("FirstName")+" "+rs.getString("LastName"));
    }
    c.close();
    System.out.println("Connected");  
  }
  
}
