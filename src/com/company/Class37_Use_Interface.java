package com.company;
interface PhoneGame{
    int a = 23;                 // Constant field or properties after compilation --> public static final int a = 23
    void pubg();                // In Interface, all methods are already abstract
    void milliMilitia();        // after compilation --> public abstract void milliMilitia
}
class Gaming implements PhoneGame{
    void Play(){
        System.out.println("Play Game...");
    }
    public void pubg(){
        System.out.println("Play Pubg");
    }
    public void milliMilitia(){
        System.out.println("MiliMilitia");
    }
}
public class Class37_Use_Interface {
    public static void main(String[] args) {
        Gaming p = new Gaming();
        p.Play();
        p.milliMilitia();
        p.pubg();
        System.out.println(p.a);        // It is not compulsory
    }
}
