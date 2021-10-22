package com.company;
class Employee2{
    int id;
    String name;
    int age;
        Employee2(){System.out.println("Constructor use");}   // It is a constructor

    // Example of default constructor
//    void display(){
//        System.out.println(id+" "+name);        // 0 and null are default constructor output
//    }

    //---------------- Example of parameterized constructor---------------------
//    Employee2(int i, String n){
//        id = i;
//        name = n;
//    }
//    void display(){
//        System.out.println(id+" "+name);        // 18 and Aditya are parameterized constructor output
//    }

    // ----------------Example of overloaded constructor-------------------------
//    Employee2(int i, String n){         // 121 , Aditya and 0 are overloaded parameterized constructor output
//        id = i;
//        name = n;
//    }
//    Employee2(int i, String n, int a){  // 121 , Aditya and 20 are overloaded parameterized constructor output
//        id = i;
//        name = n;
//        age = a;
//    }

//    void display(){
//        System.out.println(id+" "+name+" "+age);
//    }

    // Copy one constructor to another constructor
//    Employee2(int i, String n){         // 1241 , Aditya and 0 are parameterized constructor output
//        id = i;
//        name = n;
//    }
//    Employee2(Employee2 i){                // 1241 , Aditya and 34 are copied constructor output
//        id = i.id;                              // (i = s) let i variable
//        name = i.name;
//        age = 34;
//    }
    void display(){
        System.out.println(id+" "+name+" "+age);
    }

    // Another Example -- Copy one constructor to another constructor
//    Employee2(int i, String n){         // 121 , Aditya and 0 are parameterized constructor output
//        id = i;
//        name = n;
//    }
//    Employee2(){age = 23;}              // 121 , Aditya and 23 are copied constructor output
//    void display(){
//        System.out.println(id+" "+name+" "+age);
//    }
}
public class Class26_Constructor {
    public static void main(String[] args) {
            Employee2 e = new Employee2();          // Call to default constructor

            //Employee2 e = new Employee2(121,"Aditya");          // Call to parameterized constructor

            //Employee2 e = new Employee2(121,"Aditya");                  // Call to overloaded parameterized constructor
            //Employee2 e1 = new Employee2(121,"Aditya",20);          // Call to overloaded parameterized constructor


            //Employee2 e = new Employee2(1241,"Aditya");                  // Copy parameterized constructor e to e1
            //Employee2 e1 = new Employee2(e);

//            Employee2 e = new Employee2(121,"Aditya");                  //another example -  Copy parameterized constructor e to e1
//            Employee2 e1 = new Employee2();
//            e1.id = e.id;
//            e1.name = e.name;

            e.display();
            //e1.display();
    }
}
