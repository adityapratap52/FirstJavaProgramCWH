package jdbc.Com;

import java.io.FileOutputStream;
//import java.sql.*;
import java.sql.*;

public class Class7_RetrieveImg {
    static Connection con;
    static PreparedStatement psd;
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Da@1234&as");
            FileOutputStream fout = new FileOutputStream("D:\\adi.jpg");

            Blob blob;
            byte []b;
            psd = con.prepareStatement("select *from imgstore");
            ResultSet rs = psd.executeQuery();

            while (rs.next()){
                blob = rs.getBlob("photo");
                b = blob.getBytes(1,(int)blob.length());
                fout.write(b);
            }
            System.out.println("Image Received successfully");
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                con.close();
                psd.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
