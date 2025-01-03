package org.example.challenge82;

public class TestClass {
    public static void main(String[] args) {
        ArrayOperations arr = new ArrayOperations(new int[]{1,3,5,7});
        ArrayOperations.Statistics sta = arr.new Statistics();

        System.out.println(sta.calculateMean());
    }
}
