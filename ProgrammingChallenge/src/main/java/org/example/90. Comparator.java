package org.example;

import java.util.Arrays;
import java.util.List;

class Comparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear", "Giraffe", "Zebra", "Lion", "Tiger");
        System.out.println(list);
        sortAsDescending(list);
        System.out.println(list);
    }

    public static void sortAsDescending(List<String> list){
        list.sort(new java.util.Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)) {
                    return 0;
                } else if (o1.charAt(0) < o2.charAt(0)) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }
}
