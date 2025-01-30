package org.example.challenge101;

public class PrintThread extends Thread{

    private final int thread;

    public PrintThread(int thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        System.out.printf("\nThread T-%d Started\n", thread);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Thread T-%d Finished\n", thread);
    }
}
