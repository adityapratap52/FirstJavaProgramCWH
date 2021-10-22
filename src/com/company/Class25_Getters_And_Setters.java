package com.company;
//class Employee{
//    private int id ;
//    private String name;
//
//    public void setName(String n){
//        this.name = n;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setId(int n){
//        this.id = n;
//    }
//
//    public int getId(){
//        return id;
//    }
//}
//
//public class Class26_Getters_And_Setters {
//    public static void main(String[] args) {
//        Employee Name = new Employee();
//
//        //Name.id = 123;          // Throws an error due to private access modifier
//        //Name.name = "Rahul";      // Throws an error due to private access modifier
//
//        Name.setName("Ramesh");
//        Name.setId(234);
//        System.out.println(Name.getName());
//        System.out.println(Name.getId());
//    }
//}


class Employee{
    private float radius ;
    private float area ;
    private float parameter ;

    public void setRadius(int r){this.radius = r;}
    public float getRadius(){
        return radius;
    }

    public void setArea(int a){
        this.area = a;
    }
    public float getArea(){
        return area;
    }

    public void setParameter(int p){
        this.parameter = p;
    }
    public float getParameter(){
        return parameter;
    }
}

public class Class25_Getters_And_Setters {
    public static void main(String[] args) {
        Employee Name = new Employee();

        Name.setRadius(7);
        Name.setArea(154);
        Name.setParameter(44);
        if (Name.getArea() == (Name.getRadius()*22f*Name.getRadius())/7f && Name.getParameter() == (2f*22*Name.getRadius())/7f) {
            System.out.println(Name.getRadius());
            System.out.println(Name.getArea());
            System.out.println(Name.getParameter());
        }
        else
        {
            System.out.println("Area or Parameter is not correct from radius");
        }
    }
}