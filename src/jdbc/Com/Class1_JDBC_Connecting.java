package jdbc.Com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Class1_JDBC_Connecting {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");                     // Registration of Driver Class
            Connection con= DriverManager.getConnection(                // Connection establish using DriverManager
                    "jdbc:mysql://localhost:3306/db1","root","Da@1234&as");

            Statement stmt=con.createStatement();                         // Use Connection to fire a query
            ResultSet rs=stmt.executeQuery("select * from emp");    //Execute query
            while(rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + " " + rs.getString(3));
            }
            con.close();                                                // Connection Closed
        }catch(Exception e){ System.out.println(e);}
    }
}
