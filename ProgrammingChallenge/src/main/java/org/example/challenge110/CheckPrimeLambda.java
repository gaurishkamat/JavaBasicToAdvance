package org.example.challenge110;

public class CheckPrimeLambda{

    public static void main(String[] args) {
        Prime prime = (num) -> {
            int i = 2;
            while (i < num) {
                if (num % i == 0) {
                    return false;
                }
                i++;
            }
            return true;
        };

        System.out.printf(prime.isPrime(12) ? "is a Prime number" : "is not a Prime number");
    }
}
