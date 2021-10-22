package com.company;

// Question 1

/* class Employee1{
    String name;
    int salary;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

public class Chap8_Practice_Set {
    public static void main(String[] args) {
        Employee1 aditya = new Employee1();

        aditya.salary = 60000;
        aditya.name = "Aditya Pratap Singh";

        aditya.setName("CodeWithAdi");
        System.out.println(aditya.getSalary());
        System.out.println(aditya.getName());
    }
} */

// Question 2

/* class cellphone{
    public void call(){
        System.out.println("Calling Prabhat...");
        ring();
    }
    public void ring(){
        System.out.println("Ringing...");
        vibrate();
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
}

public class Chap8_Practice_Set {
    public static void main(String[] args) {
        cellphone step = new cellphone();
        step.call();
    }
} */

// Question 3

/* class square{
    int a;
    public int area(){
        return a*a;
    }
    public int perimeter(){
        return 4*a;
    }
}
public class Chap8_Practice_Set {
    public static void main(String[] args) {
        square math = new square();
        math.a = 2;
        System.out.println("Area of Square = " +math.area());
        System.out.println("Perimeter of Square = "+math.perimeter());
    }
} */

// Question 4

class rectangle{
    int l,b;
    public int area(){
        return l*b;
    }
    public int perimeter(){
        return 2*(l+b);
    }
}

public class Chap8_Practice_Set {
    public static void main(String[] args) {
        rectangle math = new rectangle();
        math.l = 3;
        math.b = 4;
        int i = 0;
        while (i <3) {
            System.out.println("Area of Square = " +math.area());
            System.out.println("Perimeter of Square = "+math.perimeter());
            System.out.println();
            i++;
        }
    }
}