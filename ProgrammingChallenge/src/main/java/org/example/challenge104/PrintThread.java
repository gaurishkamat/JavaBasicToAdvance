package org.example.challenge104;

public class PrintThread implements Runnable{

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        System.out.printf("Started with Thread %s\n", current);

        try {
            Thread.sleep(getRandom());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("Ended with Thread %s\n", current);
    }

    private int getRandom(){
        return (int) (Math.random() * 5) - 1;
    }
}
