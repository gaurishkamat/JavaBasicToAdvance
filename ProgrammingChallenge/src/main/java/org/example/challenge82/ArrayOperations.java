package org.example.challenge82;

import java.util.Arrays;

public class ArrayOperations {

    private int[] numbers;

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    public class Statistics{

        public int calculateMean(){
            double sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return (int) sum / numbers.length;
        }

        public int calculateMedian(){
            int sortedNumbers = Arrays.stream(numbers).sorted().sum();
            return (int) sortedNumbers / numbers.length;
        }
    }
}
