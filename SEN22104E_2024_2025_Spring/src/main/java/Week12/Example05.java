/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ali.nizam
 */
public class Example05 {
    public static void main(String[] args) throws SQLException {
        Connection con; 
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB","root","Nizam1234");
        Statement s=con.createStatement();
        String sql="SELECT * FROM employee";
        ResultSet rs=s.executeQuery(sql);
        ResultSetMetaData rsmd=rs.getMetaData();
        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            System.out.println(rsmd.getColumnName(i));
        }
    }
}
