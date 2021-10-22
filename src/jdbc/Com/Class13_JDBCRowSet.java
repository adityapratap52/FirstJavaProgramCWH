package jdbc.Com;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class Class13_JDBCRowSet {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //-------------Creating and executing rowSet---------------
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            rowSet.setUrl("jdbc:mysql://localhost:3306/db1");
            rowSet.setUsername("root");
            rowSet.setPassword("Da@1234&as");

            rowSet.setCommand("select *from copytable");
            rowSet.execute();
            //--------------------Normal executing--------------------
//            int count = 0;
//            while (rowSet.next()){
//                count++;
//                System.out.println("Id : "+rowSet.getInt(1));
//                System.out.println("Name : "+rowSet.getString(2));
//                System.out.println("Branch : "+rowSet.getString(3));
//                System.out.println("---------------------------------------------------------------");
//            }
//            System.out.println("Total rows in CopyTable : "+count);

            //------------------------Adding Listener and moving rowSet-----------------------
            rowSet.addRowSetListener(new MyListener());
            int count1 = 0;
            while (rowSet.next()){
                count1++;
                System.out.println("Id : "+rowSet.getInt(1));
                System.out.println("Name : "+rowSet.getString(2));
                System.out.println("Branch : "+rowSet.getString(3));
                System.out.println("---------------------------------------------------------------");
            }
            System.out.println("Total rows in CopyTable : "+count1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class MyListener implements RowSetListener{
    public void rowSetChanged(RowSetEvent event){
        System.out.println("Row Set Changed");
    }
    public void cursorMoved(RowSetEvent event){
        System.out.println("Cursor Moved");
    }
    public void rowChanged(RowSetEvent event){
        System.out.println("Row Changed");
    }
}
