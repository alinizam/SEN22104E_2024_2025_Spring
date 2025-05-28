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
public class Example04 {
    public static void main(String[] args) throws SQLException {
        Connection con; 
        
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB","root","Nizam1234");
        con.setAutoCommit(false);
        Statement s=con.createStatement();
        String sql="UPDATE employee SET salary=200000 WHERE employeeId=1";
        int changeRecordNumber=s.executeUpdate("UPDATE employee SET salary=1100000 WHERE employeeId=1");
        changeRecordNumber=s.executeUpdate("UPDATE employee SET salary=2200000 WHERE employeeId=2");
        changeRecordNumber=s.executeUpdate("UPDATE employee SET salary=3300000 WHERE employeeId=3");
        if (1==1) throw new ArithmeticException();
        changeRecordNumber=s.executeUpdate("UPDATE employee SET salary=4400000 WHERE employeeId=4");
        con.commit();
        System.out.println(changeRecordNumber);
    }
}