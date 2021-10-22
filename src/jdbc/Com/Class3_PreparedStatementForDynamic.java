package jdbc.Com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Class3_PreparedStatementForDynamic {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Da@1234&as");
            //*--*--*--*--*--*--*--*--*--*--*--*--*||insert value||*--*--*--*--*--*--*--*--*--*--*--*--*
//            PreparedStatement pst = con.prepareStatement("insert into copyTable values(?,?,?)");
//            pst.setInt(1,9);               // 1 specifies the first parameter in the query
//            pst.setString(2,"Lakhan");
//            pst.setString(3,"BAMS");
//
//            int result = pst.executeUpdate();                 // without this method row will not insert
//            System.out.println(result+" rows inserted");

            //*--*--*--*--*--*--*--*--*--*--*--*||update value||*--*--*--*--*--*--*--*--*--*--*--*--*
//            PreparedStatement pst = con.prepareStatement("update copyTable set s_name = ? where roll_no = ?");
//            pst.setString(1,"Yadav");
//            pst.setInt(2,10);
//            int result = pst.executeUpdate();
//            System.out.println(result+" row Updated");

            //*--*--*--*--*--*--*--*--*--*--*--*--*||delete value||*--*--*--*--*--*--*--*--*--*--*--*--*
//            PreparedStatement pst = con.prepareStatement("delete from copytable where s_name = ?");
//            pst.setString(1,"Lakhan");
//            int result = pst.executeUpdate();
//            System.out.println(result+" row deleted");
//
//            ResultSet rs = pst.executeQuery("select *from copytable");      // executeQuery is available in both Statement and PreparedStatement
//            while (rs.next()){
//                System.out.println("**********************************************");
//                System.out.println("Roll No : "+rs.getInt(1));
//                System.out.println("Student Name : "+rs.getString(2));
//                System.out.println("Branch : "+rs.getString(3));
//                System.out.println("**********************************************");
//            }

            //*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*
            //*--*--*--*--*--*--*--*--*--*--*||insert records until user press n||*--*--*--*--*--*--*--*--*--*--*--*--*--*--*

            PreparedStatement pst = con.prepareStatement("insert into copyTable values(?,?,?)");
            Scanner sc = new Scanner(System.in);        // you can use BufferedReader instead of Scanner
            do {
                System.out.println("Do you want to continue : Y/N");
                String s = sc.next();
                if (s.startsWith("N") || s.startsWith("n")){
                    break;
                }
                else if (s.startsWith("Y") || s.startsWith("y")){

                    System.out.println("Enter Student's Roll No :");
                    int rollNo = sc.nextInt();
                    System.out.println("Enter Student's Name :");
                    String name = sc.next();
                    System.out.println("Enter Student's Branch :");
                    String branch = sc.next();

                    pst.setInt(1,rollNo);
                    pst.setString(2,name);
                    pst.setString(3,branch);
                    int result = pst.executeUpdate();
                    System.out.println(result+" row inserted");
                }
                else {
                    System.out.println("You choose wrong option.Try again!");
                }

            }while (true);

            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
