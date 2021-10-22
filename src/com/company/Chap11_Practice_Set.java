package com.company;
 abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    @Override
    public void write(){
        System.out.println("This is write method");
    }
    @Override
    public void refill(){
        System.out.println("This is write method");
    }
    void changeNib(){
        System.out.println("Changing Nib");
    }
}
class Monkey{
     void jump(){
         System.out.println("Monkey Jump....");
     }
     void bite(){
         System.out.println("Monkey bite....");
     }
}
interface BasicAnimal{
     void eat();
     void sleep();
}
class Human extends Monkey implements BasicAnimal{
     @Override
     public void eat(){
         System.out.println("Monkey eating...");
     }
     @Override
     public void sleep(){
         System.out.println("Monkey eating...");
     }
}
abstract class Telephone{
     abstract void ring();
     abstract void lift();
     abstract void disconnect();
}
class SmartTelephone extends Telephone{
     void ring(){
         System.out.println("Ringing...");
     }
     void lift(){
         System.out.println("Lifting...");
     }
     void disconnect(){
         System.out.println("Disconnecting...");
     }
     void pick(){
         System.out.println("Picking....");
     }
}
interface TvRemote{
     void play();
     void change();
}
interface SmartTvRemote extends TvRemote{
     void stop();
     void run();
}
class Tv implements SmartTvRemote{
     public void play(){
         System.out.println("Play Video...");
     }
     public void change(){
         System.out.println("Change Video...");
     }
     public void stop(){
         System.out.println("Stop Video...");
     }
     public void run(){
         System.out.println("Run Video...");
     }
}
public class Chap11_Practice_Set {
    public static void main(String[] args) {
        /*{Question 1 and 2}  --> [1]- abstract class pen with method write and refill
                                 [2]- Create a concrete class FountainPen with additional method changeNib()
          */
        //FountainPen p = new FountainPen();
        //p.refill();
        //p.write();
        //p.changeNib();


        /*{Question 3} - Class Monkey with jump and bite methods , class human which inherits
        this Monkey class and implements BasicAnimal interface with eat and sleep methods
          */
        //Human h = new Human();
        //h.eat();
        //h.sleep();
        //h.bite();
        //h.jump();


        /*{Question 4}- class Telephone with ring, lift nad disconnect methods as abstract methods
        Create another class SmartTelePhone and demonstrate polymorphism
         */
        //Telephone t = new SmartTelephone();
        //t.ring();
        //t.lift();
        //t.disconnect();
        //t.pick();         // it gives error


        /*{Question 5 and 6}--> [5] - Create an interface TvRemote and use it to inherit another interface SmartTvRemote
                            [6] - Create a class Tv which implements TvRemote interface from Q6
         */
        Tv t = new Tv();
        t.play();
        t.change();
        t.run();
        t.stop();
    }
}
