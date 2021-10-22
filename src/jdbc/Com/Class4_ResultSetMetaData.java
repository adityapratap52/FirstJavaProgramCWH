package jdbc.Com;

import java.sql.*;

public class Class4_ResultSetMetaData {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Da@1234&as");
            PreparedStatement stmt = con.prepareStatement("select *from copyTable");
            ResultSet rs = stmt.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();

            //---------Methods of ResultSetMetaData--------------------------
            int result1 = rsm.getColumnCount();
//            String result2 = rsm.getCatalogName(1);
//            String result3 = rsm.getColumnName(2);
//            String result4 = rsm.getColumnTypeName(2);
//            String result5 = rsm.getTableName(2);

            //----------------Output of methods-----------------------------
            System.out.println("Total Column in Emp Table : "+result1);
//            System.out.println("Catalog(Database) name of Emp Table : "+result2);
//            System.out.println("Name of Column 2 is : "+result3);
//            System.out.println("Type of column 2 is : "+result4);
//            System.out.println("Table name of given 2 index : "+result5);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
