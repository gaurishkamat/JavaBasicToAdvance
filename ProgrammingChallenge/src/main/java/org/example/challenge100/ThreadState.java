package org.example.challenge100;

public class ThreadState extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.printf("From inside %s\n", getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
