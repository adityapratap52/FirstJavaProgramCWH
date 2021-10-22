package jdbc.Com;

import java.sql.*;

public class Class8_StoreFile {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Da@1234&as");
//            PreparedStatement pst = con.prepareStatement("")
            Statement st = con.createStatement();
//            int result = st.executeUpdate("create table fileStore(name varchar(300),file clob)");
//            System.out.println(result+" rows successfully");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
