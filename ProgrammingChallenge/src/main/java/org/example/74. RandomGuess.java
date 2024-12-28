package org.example;

import java.util.Scanner;

class RandomGuess {

    int random;
    RandomGuess(){
        random = (int) Math.ceil(Math.random() * 100);
    }

    int guess(int guessNumber){
        return  guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RandomGuess randomGuess = new RandomGuess();
        int result;

        do{
            System.out.print("Welcome to the guessing Game, guess the number between 1-100: ");
            int guessNum = input.nextInt();
            result = randomGuess.guess(guessNum);
            if(result > 0 ){
                System.out.println("Guess a smaller number");
            }else if(result < 0 ){
                System.out.println("Guess a bigger number");
            }else{
                System.out.println("Amazing!!, you guessed it right");
            }
        }while(result != 0);
    }
}
