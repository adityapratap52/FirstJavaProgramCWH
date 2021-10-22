package jdbc.Com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.*;

public class Class6_StoreImg {
    static Connection con;
    static PreparedStatement pst;
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Da@1234&as");
            FileInputStream fis = new FileInputStream("E:\\Desktop Wallpaper\\joker.jpg");
            pst = con.prepareStatement("insert into imgstore values(?,?)");
            pst.setString(1,"Adi");
            pst.setBinaryStream(2,fis,fis.available());
            int result = pst.executeUpdate();
            if (result == 0)
                System.out.println("Image not insert successfully");
            else
                System.out.println("Image inserted Successfully");

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                pst.close();
                con.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
