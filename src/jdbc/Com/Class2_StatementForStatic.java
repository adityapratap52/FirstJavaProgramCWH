package jdbc.Com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Class2_StatementForStatic {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db1","root","Da@1234&as");

            // ------------Statement is use for static query------------------
            Statement stmt=con.createStatement();

            // -------------This is all static query not dynamic query----------------
//            int result = stmt.executeUpdate("insert into emp values(34,'Fazan','B.Sc')");
//            int result=stmt.executeUpdate("update emp set name='Vimal',branch= 'Mtech' where id=33");
//            int result=stmt.executeUpdate("delete from emp where id=33");
//            int result = stmt.executeUpdate("drop table emp");
//            int result = stmt.executeUpdate("create table emp(id int(10) primary key,name varchar(30) not null, branch varchar(10) not null)");
//            System.out.println(result+" records affected");

//            ResultSet rs=stmt.executeQuery("select * from emp");
//            while(rs.next())
//                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(3));
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
