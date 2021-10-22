package jdbc.Com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Class11_TransactionManagement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Da@1234&as");

            //-------------------------------------||Transaction use in Statement||--------------------------------------------
//            Statement st = con.createStatement();
//            con.setAutoCommit(false);                                                     // By-default setAutoCommit is true so first must false this value
//            int result1 = st.executeUpdate("insert into copytable values(21,'Raj','TCP')");
//            int result2 = st.executeUpdate("insert into copytable values(22,'Manish','IP')");
//            int result3 = st.executeUpdate("insert into copytable values(23,'Gopal','UDP')");
//            int result4 = st.executeUpdate("delete from copytable where s_name = 'Rahim'");
//            if (result1 != 0 && result2 != 0 && result3 != 0 && result4 != 0)
//                System.out.println("Value is inserted successfully");
//            else
//                System.out.println("Value is not inserted");
//            con.commit();

            //-------------------------------------||Transaction use in PreparedStatement||--------------------------------------------
            PreparedStatement pst = con.prepareStatement("insert into copytable values(?,?,?)");
            con.setAutoCommit(false);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            boolean b = true;
            while (b){
                System.out.println("Enter Roll No :");
                int rollNo = Integer.parseInt(br.readLine());
                System.out.println("Enter Name :");
                String name = br.readLine();
                System.out.println("Enter Branch :");
                String branch = br.readLine();
                pst.setInt(1,rollNo);
                pst.setString(2,name);
                pst.setString(3,branch);
                pst.executeUpdate();
                System.out.println("What do you want: commit/rollback ");
                String want = br.readLine();
                if (want.equals("commit")){
                    con.commit();
                }
                else if (want.equals("rollback")){
                    con.rollback();
                }
                System.out.println("Do you want insert other values: y/n");
                String  ans = br.readLine();
                if (ans.equals("n") || ans.equals("N")){
                    b = false;                      // or you can break; statement
                }
                else {
                    System.out.println("insert karo");
                }
            }
            con.commit();
            System.out.println("record successfully saved");
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
