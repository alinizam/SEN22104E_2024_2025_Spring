/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Week12Lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ali.nizam
 */
public class Example01 {

    public static void main(String[] args) throws SQLException {
        Connection con; 
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB","root","Nizam1234");
        Statement s=con.createStatement();
        String name="Ahmet";
        name=name+"' OR '1'='1";
        String sql="SELECT * FROM Employee WHERE firstname='"+name+"'";
        System.out.println(sql);
        ResultSet rs=s.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getInt("employeeId")+"-"+rs.getString(2));
        }
    }
}
