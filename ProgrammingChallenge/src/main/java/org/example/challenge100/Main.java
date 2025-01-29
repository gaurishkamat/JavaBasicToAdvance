package org.example.challenge100;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new ThreadState();

        System.out.printf("Create thread %s\n", t1.getState());

        t1.start();

        t1.join();

        System.out.printf("Thread finished %s\n", t1.getState());
    }
}
