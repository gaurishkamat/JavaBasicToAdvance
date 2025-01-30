package org.example.challenge104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultipleThreadExecutor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            PrintThread task = new PrintThread();
            service.submit(task);
        }

        if(!service.awaitTermination(10, TimeUnit.MILLISECONDS)){
            service.shutdown();
        }
    }
}
