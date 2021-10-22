package com.company;
import java.util.Random;
import java.util.Scanner;
class Game1{
    public int input;
    public int randN;
    public int noOfGuesses = 0;

    Game1() {
        Random random = new Random();
        this.randN = random.nextInt(100);
    }
    public void takeUserInput(){
        System.out.println("Please Guess the Number");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
    }
    boolean isCorrectNumber() {
        noOfGuesses++;
        if (input == randN) {
            System.out.printf("Yes! You guessed it right, It was %d in %d attempt",input,noOfGuesses);
            return true;
        }
        else if (input > randN) {
            System.out.println("Your input number is large to random number");
        }
        else if (input < randN) {
            System.out.println("Your input number is small to random number");
        }
        return false;
    }
}
public class  Project4_Guess_Number {
    public static void main(String[] args) {
            Game1 g = new Game1();
            boolean b = false;
            while (!b) {
                g.takeUserInput();
                b = g.isCorrectNumber();
            }
        }
}
