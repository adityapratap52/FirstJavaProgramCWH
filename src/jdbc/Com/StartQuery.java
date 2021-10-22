package jdbc.Com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StartQuery {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Student Management App");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("Press 1 to ADD Student Data");
            System.out.println("Press 2 to Delete Student Data");
//            System.out.println("Press 3 to UPDATE Student Data");
            System.out.println("Press 3 to Display Students Data");
            System.out.println("Press 0 to Exit App");

            int c = Integer.parseInt(br.readLine());
            if (c == 1){
               // add student Data

                System.out.println("Enter user name");
                String name = br.readLine();

                System.out.println("Enter user Branch");
                String branch = br.readLine();

                System.out.println("Enter user Number");
                int number = Integer.parseInt(br.readLine());

                // Create student object to store student
                Student st = new Student(name,branch,number);
                boolean answer = CreateDatabasePath.insertStudentToDB(st);
                if (answer){
                    System.out.println("Student is added Successfully....");
                }
                else {
                    System.out.println("Something went wrong try again.....");
                }
                System.out.println(st);
            }
            else if (c == 2){
                // Delete Student Data
                System.out.println("Enter id for delete row");
                int userId = Integer.parseInt(br.readLine());
                boolean answer = CreateDatabasePath.deleteStudent(userId);
                if (answer){
                    System.out.println("Successfully Deleted.....");
                }
                else {
                    System.out.println("Value is not deleted try again");
                }
            }
            else if (c == 3){
                // Display Student Data
                CreateDatabasePath.showAllStudents();
            }
            else if (c == 0){
                break;
            }
            else {
                System.out.println("Input is not Correct");
            }
        }
    }
}
