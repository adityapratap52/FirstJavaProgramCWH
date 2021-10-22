package com.company;

class fruit{
    int id;
    String name;
    int price;
    public void apple(){            //It receive publicly id and name from EXP
        System.out.println("Id of Apple is: "+id);
        System.out.println("Name of Apple is: "+name);
    }
    public int graps(){
        return price;
    }
}

public class Class24_OOPs_Basic_Concepts {
    public static void main(String[] args) {
        fruit mango = new fruit();
        mango.id = 123;
        mango.name = "Adi";
        mango.price = 12;
        mango.apple();              //It send publicly id and name to apple
//        System.out.println(mango.id);
        System.out.println(mango.price);
    }
}
//package com.company;
//class Employee{
//    int id;
//    String name;
//    int salary;
//    public void printDetails(){
//        System.out.println("My id is: "+id);
//        System.out.println("My name is: "+name);
//    }
//    public int get_Salary(int salary){
//        return salary;
//    }
//}
//public class Class25_OOPs_Basic_Concepts{
//
//    public static void main(String[] args) {
//        System.out.println("This is our Custom Class");
//        Employee harry = new Employee(); // Instantiating a mew Employee Object
//        Employee john = new Employee(); // Instantiating a mew Employee Object
//
//        // Setting Attributes/Properties of Harry
//        harry.id = 123;
//        harry.name = "Aditya";
//        harry.salary = 35000;
//
//        // Setting Attributes/Properties of John
//        john.id = 345;
//        john.name = "Prashant";
////        john.salary = 30000;
//
//        // Print Properties/Attributes
//        harry.printDetails();
//        john.printDetails();
//        System.out.println(harry.get_Salary(30000));
//        //System.out.println(harry.id);
//        //System.out.println(harry.name);
//
////        OOp();
//    }
//}