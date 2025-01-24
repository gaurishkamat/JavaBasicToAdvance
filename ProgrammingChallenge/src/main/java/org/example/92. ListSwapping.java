package org.example;

import java.util.Arrays;
import java.util.List;

class ListSwapping {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(list);
        swap(list, 1, 2);
        System.out.println(list);
    }

    public static void swap(List<Integer> list, int o1, int o2){
        int swap = list.get(o1);
        list.set(o1, list.get(o2));
        list.set(o2, swap);
    }

}
