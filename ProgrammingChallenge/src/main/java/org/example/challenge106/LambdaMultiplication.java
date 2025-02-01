package org.example.challenge106;

import java.util.function.BinaryOperator;

class LambdaMultiplication {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (a, b) ->  a * b;
        System.out.println(multiply.apply(4, 5));
    }
}
