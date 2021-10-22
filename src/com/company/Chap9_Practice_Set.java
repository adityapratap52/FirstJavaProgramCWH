package com.company;
class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double print_area(){
        return 2 * Math.PI * radius * radius + 2*Math.PI * radius * height;
    }
    public double print_Volume(){
        return Math.PI * radius * radius * height;
    }
}

class Rectangle{
    private int length;
    private int width;

    public Rectangle() {            // This is default Constructor
        this.length = 7;
        this.width = 5;
    }
    public Rectangle(int length, int width) {           // This is parameterized Constructor, it will run when we insert values in object
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}

public class Chap9_Practice_Set {
    public static void main(String[] args) {
        Cylinder n = new Cylinder(9,12);        // Internal value use to Exercise 2

        // Exercise 1
//        n.setRadius(9);
//        n.setHeight(12);
//        System.out.println(n.getRadius());
//        System.out.println(n.getHeight());

//        System.out.println(n.print_area());
//        System.out.println(n.print_Volume());

        Rectangle t = new Rectangle();
        System.out.println(t.getLength());
        System.out.println(t.getWidth());
    }
}
