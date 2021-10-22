package jdbc.Com;

import java.sql.*;

public class Class5_DatabaseMetaData {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Da@1234&as");
            DatabaseMetaData dbmd = con.getMetaData();

            //---------Methods of ResultSetMetaData--------------------------
            String driverName = dbmd.getDriverName();
            String driverVersion = dbmd.getDriverVersion();
            String userName = dbmd.getUserName();
            String dbPName = dbmd.getDatabaseProductName();
            String dbPVersion = dbmd.getDatabaseProductVersion();

            //----------------Output of methods-----------------------------
            System.out.println("Driver name of JDBC : "+driverName);
            System.out.println("Driver Version : "+driverVersion);
            System.out.println("User Name : "+userName);
            System.out.println("Database product name : "+dbPName);
            System.out.println("Database product version : "+dbPVersion);
            System.out.println("*****************************************");
            String table1[] = {"TABLE"};
            String table2[] = {"VIEW"};

            ResultSet rs = dbmd.getTables(null,null,null,table2);
            while (rs.next())
                System.out.println(rs.getString(3));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
