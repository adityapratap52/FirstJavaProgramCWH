package com.company;
class Circle{
    public int radius;
    Circle(int radius){
        this.radius = radius;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int radius, int height){
        super(radius);
        this.radius = radius;
        this.height = height;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*height;
    }
}

class Rectangle1{
    public int length;
    public int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int volume(){
        return this.length*this.width;
    }
}
class Cuboid extends Rectangle1{
    public int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int volume1(){
        this.volume();
        return this.length*this.height*this.width;
    }
}

public class Chap10_Practice_Set {
    public static void main(String[] args) {

        // Question 1 and 3 both
        //Circle s = new Circle(7);
        //Cylinder1 c = new Cylinder1(7,5);
        //System.out.format("\nArea of Circle: %f",c.area());
        //System.out.println("\nVolume of Cylinder: "+c.volume());

        // Question 2 and 4 both
        Cuboid c = new Cuboid();
        c.setHeight(3);
        c.setLength(4);
        c.setWidth(7);
        System.out.println(c.volume());
        System.out.println(c.volume1());
    }
}
