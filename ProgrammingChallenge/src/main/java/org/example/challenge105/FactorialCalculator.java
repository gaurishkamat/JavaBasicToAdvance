package org.example.challenge105;

import java.util.concurrent.Callable;

public class FactorialCalculator implements Callable<Integer> {

    private final int number;

    public FactorialCalculator(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        if(number<=1){
            return  1;
        }

        int res = 1;
        for (int i = 2; i < number; i++) {
            res *= i;
        }
        return res;
    }
}
