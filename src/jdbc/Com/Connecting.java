package jdbc.Com;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connecting {
    static Connection con;
    public static Connection createC(){
        String url = "jdbc:mysql://localhost:3306/db1";
        String user = "root";
        String password = "Da@1234&as";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
