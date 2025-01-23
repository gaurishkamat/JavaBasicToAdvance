package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Frequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 5, 4, 6, 3, 1, 4, 7);
        System.out.println(Collections.frequency(list, 4));
    }
}
