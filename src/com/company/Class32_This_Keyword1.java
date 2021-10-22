package com.company;
class base{
    int roll_no;
    String name;
    String city;
    int fee;
    public base(int roll_no,String name, String city) {
        this.roll_no = roll_no;                         // If your parameter name is same to Variable name then you must to be use this keyword otherwise it throw  0 or null
        this.name = name;
        this.city = city;
    }

//    public int getRoll_no() {
//        return roll_no;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getCity() {
//        return city;
//    }
    public base(int roll_no,String name, String city,int fee){
        this(roll_no,name,city);
        this.fee = fee;
    }
    public void display(){
        System.out.println(roll_no+" "+name+" "+city+" "+fee);
    }
}
public class Class32_This_Keyword1 {
    public static void main(String[] args) {
        base b = new base(3,"Aditya","Delhi");
        base b1 = new base(3,"Aditya","Delhi",40000);
        b.display();
        b1.display();

        // Use in Getters
//        base b = new base(3,"Aditya","Delhi");
//        System.out.println("Roll No: "+b.roll_no);
//        System.out.println("Name: "+b.getName());
//        System.out.println("City: "+b.getCity());
    }
}
