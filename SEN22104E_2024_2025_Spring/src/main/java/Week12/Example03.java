/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ali.nizam
 */
public class Example03 {
    
    public static void main(String[] args) throws SQLException {
        Connection con; 
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB","root","Nizam1234");
        String sql="INSERT INTO employee (employeeId,firstName,lastName,salary) VALUES (?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1, 6);
        ps.setString(2, "Ayşe");
        ps.setString(3, "Mavi");
        ps.setInt(4, 100000);
       
        int changeRecordNumber=ps.executeUpdate();
        System.out.println(changeRecordNumber);
        con.close();
    }
 
}
