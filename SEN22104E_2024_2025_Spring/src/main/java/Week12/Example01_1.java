/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ali.nizam
 */
public class Example01_1 {
    public static void main(String[] args) throws SQLException {
        Connection con; 
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB","root","Nizam1234");
        //Statement s=con.createStatement();
        String sql="SELECT * FROM Employee WHERE firstName=? AND salary>?";
        
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1, "Ahmet");
      //  ps.setInt(2, 6000);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt("employeeId")+"-"+rs.getString(2)+"-"+rs.getString(4));
        }
    }
}
