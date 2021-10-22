package jdbc.Com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateDatabasePath {
    public static boolean insertStudentToDB(Student st){
        boolean f= false;
        try {
            // JDBC Code...
            Connection con = Connecting.createC();
            String q = "insert into emp(name,branch,number) values(?,?,?)";

            // PreparedStatement........
            PreparedStatement pstmt = con.prepareStatement(q);

            // See the value of parameters
            pstmt.setString(1,st.getsName());
            pstmt.setString(2,st.getsBranch());
            pstmt.setInt(3,st.getsNumber());

            // execute...
            pstmt.executeUpdate();
            con.close();
            f=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }

    public static boolean deleteStudent(int userId) {
        boolean f= false;
        try {
            // JDBC Code...
            Connection con = Connecting.createC();
            String q = "delete from emp where id = ?";

            // PreparedStatement........
            PreparedStatement pstmt = con.prepareStatement(q);

            // See the value of parameters
            pstmt.setInt(1,userId);

            // execute...
            pstmt.executeUpdate();
            con.close();
            f=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }

    public static void showAllStudents() {
        try {
            // JDBC Code...
            Connection con = Connecting.createC();
            String q = "select *from emp";

            // PreparedStatement........
            Statement pstmt = con.createStatement();

            // execute...
            ResultSet rs = pstmt.executeQuery(q);
            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String branch = rs.getString(3);
                int number = rs.getInt(4);
                System.out.println("ID : "+id);
                System.out.println("Name : "+name);
                System.out.println("Branch : "+branch);
                System.out.println("Number : "+number);
                System.out.println("*************************************************");
            }
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
