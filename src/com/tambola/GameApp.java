package com.tambola;

public class GameApp {
    public static void main(String[] args) throws InterruptedException{
        Dealer dealer = new Dealer();
        Thread dealerThread = new Thread(dealer);
        dealerThread.start();
        dealerThread.join();

        Checker checker = new Checker();
        Thread checkerThread = new Thread(checker);
        checkerThread.start();
    }
}
