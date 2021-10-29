package com.tambola;

public class GameApp {
    public static void main(String[] args) throws InterruptedException{
        Dealer deal = new Dealer();
        Thread dealer = new Thread(deal);
        dealer.start();
        dealer.join();

        Checker ch = new Checker();
        Thread checker = new Thread(ch);
        checker.start();
    }
}
