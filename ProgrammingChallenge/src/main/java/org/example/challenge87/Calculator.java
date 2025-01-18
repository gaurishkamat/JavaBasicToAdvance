package org.example.challenge87;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int first = input.nextInt();
        int second = input.nextInt();

        try{
            System.out.printf("Division Result: %d", first / second);
        }catch(ArithmeticException exception){
            System.out.println("Arithmetic exception: " + exception.getMessage());
        }catch (Exception exception){
            System.out.println("Exception " + exception.getMessage());
        }finally {
            System.out.println("\nFinally block");
        }
    }
}
