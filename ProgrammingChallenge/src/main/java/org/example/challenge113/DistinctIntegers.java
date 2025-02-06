package org.example.challenge113;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctIntegers {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,5,4,1,2,3,4,5,6,7,8,7);

        List<Integer> sortedList = integerList.stream()
                .distinct()
                .toList();

        System.out.println(sortedList);
    }
}
