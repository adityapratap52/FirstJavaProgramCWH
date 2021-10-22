package jdbc.Com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class Class12_BatchProcessing {
    static Connection con;
    static Statement stmt;
    static PreparedStatement pst;

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Da@1234&as");

            //----------------------------------||For Statement||------------------------------
//            stmt = con.createStatement();
//            stmt.addBatch("insert into copytable values(211,'Tanmay2','MCA')");
//            stmt.addBatch("insert into copytable values(212,'Ramesh2','BBA')");
//            stmt.addBatch("insert into copytable values(213,'Suresh2','MBA')");
//            int []result = stmt.executeBatch();
//            int count = 0;
//            for (int element : result){
//                count++;
//            }

            //----------------------------------||For PreparedStatement||------------------------------
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            pst = con.prepareStatement("insert into copytable values(?,?,?)");
            int count = 0;
            while (true){
                System.out.println("Enter roll no :");
                int rollNo = Integer.parseInt(br.readLine());
                System.out.println("Enter your name :");
                String name = br.readLine();
                System.out.println("Enter your branch :");
                String branch = br.readLine();

                pst.setInt(1,rollNo);
                pst.setString(2,name);
                pst.setString(3,branch);
                pst.addBatch();
                count++;
                System.out.println("Are you inserted other values : y/n");
                String ans = br.readLine();
                if (ans.equals("n")){
                    break;
                }
            }
            pst.executeBatch();
            System.out.println("\n"+count+ " Rows inserted");
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                pst.close();
//                stmt.close();
                con.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
