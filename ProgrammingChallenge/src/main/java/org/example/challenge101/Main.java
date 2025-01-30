package org.example.challenge101;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new PrintThread(1);
        Thread t2 = new PrintThread(2);
        Thread t3 = new PrintThread(3);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();

    }
}
