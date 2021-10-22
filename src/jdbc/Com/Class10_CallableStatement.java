package jdbc.Com;

import java.sql.*;

public class Class10_CallableStatement {
    static Connection con;
    static CallableStatement cst;
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Da@1234&as");

//            create or replace procedure "INSERTR"
//            (id IN NUMBER,
//            name IN VARCHAR2)
//            is
//                    begin
//            insert into user420 values(id,name);
//            end;

            PreparedStatement pst = con.prepareStatement("create or replace procedure CallVal(id in number,name in varchar)is begin insert into copytable values(id,name); end; ");
            int result = pst.executeUpdate();
            System.out.println(result+" create successfully");
//            cst = con.prepareCall();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
