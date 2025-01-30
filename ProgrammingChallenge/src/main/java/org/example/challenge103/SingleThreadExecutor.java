package org.example.challenge103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try{
            PrintNumbers task = new PrintNumbers();
            executorService.submit(task);
        }finally {
            System.out.println("Finally");
        }
        executorService.shutdown();
    }
}
