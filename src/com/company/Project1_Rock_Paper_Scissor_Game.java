package com.company;
import java.util.Random;
import java.util.Scanner;
class Game {
    public void take_Input() {
        int u_count = 0;
        int c_count = 0;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("\tRock , Paper , Scissor Game\n");
        for (int i = 0; i < 3; i++) {
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("Choose 1- Rock ,2- Paper ,3- Scissor Game\n");
            int n = sc.nextInt();
            if (n < 1 || n > 3) {
                System.err.println("You have taken Wrong input Please Restart Game");
                break;
            }
            int a = random.nextInt(3);
            a = a + 1;
            System.out.println("Computer Choose: " + a);
            if (n == 1 && a == 3) {
                System.out.println("User Win this Chance!");
                System.out.println("\nUser Point: " + ++u_count);
                System.out.println("Computer Point: " + c_count);

            } else if (n == 2 && a == 1) {
                System.out.println("User Win this Chance!");
                System.out.println("\nUser Point: " + ++u_count);
                System.out.println("Computer Point: " + c_count);
            } else if (n == 3 && a == 2) {
                System.out.println("User Win this Chance!");
                System.out.println("\nUser Point: " + ++u_count);
                System.out.println("Computer Point: " + c_count);
            } else if (n == a) {
                System.out.println("User and Computer Choose same value so this chance is DRAW!");
                System.out.println("\nUser Point: " + u_count);
                System.out.println("Computer Point: " + c_count);
            } else {
                System.out.println("Computer Win this Chance!");
                System.out.println("\nComputer Point: " + ++c_count);
                System.out.println("User Point: " + u_count);
            }
        }
        if (u_count > c_count) {
            System.out.println("--------User Win this Game!--------");
        } else if (u_count < c_count) {
            System.out.println("--------Computer Win this Game!--------");
        } else {
            System.out.println("--------This Game is Draw!--------");
        }

    }
}
public class Project1_Rock_Paper_Scissor_Game {
    public static void main(String[] args) {

        Game g = new Game();
        g.take_Input();
    }
}

