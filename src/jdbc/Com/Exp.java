package jdbc.Com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exp {

    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Da@1234&as");
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
//        stmt.executeUpdate("insert into emp values(5,'Anuj','Mtech')");
//        stmt.executeUpdate("update emp set id = 50 where id = 5");
//        stmt.executeUpdate("delete from emp where id = 33");
//        int x = stmt.executeUpdate("drop table emp");
//        int x = stmt.executeUpdate("create table emp(id int(10) primary key,name varchar(30) not null, branch varchar(10) not null)");
//        System.out.println(x+" table created");

        ResultSet rs = stmt.executeQuery("select *from emp");
        rs.relative(4);
//        while (rs.next())
            System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("branch")+" "+rs.getInt(4));
        con.close();
    }
}
