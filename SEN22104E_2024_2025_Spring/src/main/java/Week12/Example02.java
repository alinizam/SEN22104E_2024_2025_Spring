/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ali.nizam
 */
public class Example02 {
    public static void main(String[] args) throws SQLException {
        Connection con; 
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB","root","Nizam1234");
        Statement s=con.createStatement();
        //String sql="UPDATE employee SET salary=15000 WHERE employeeId=1";
        //String sql="UPDATE employee SET salary=salary*2";
        String sql="DELETE FROM employee WHERE employeeId=3";
        int changeRecordNumber=s.executeUpdate(sql);
        System.out.println(changeRecordNumber);
    }
}
