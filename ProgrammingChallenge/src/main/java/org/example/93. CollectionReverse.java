package org.example;

import java.util.Arrays;
import java.util.List;

class CollectionReverse {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 5, 4, 6, 3, 1, 4, 7);
        System.out.println(list);
        reverse(list);
        System.out.println(list);
    }

    public static void reverse(List<Integer> list){
        for(int i=0; i<list.size() / 2;i++){
            ListSwapping.swap(list, i, list.size() - 1 - i);
        }

    }

}
