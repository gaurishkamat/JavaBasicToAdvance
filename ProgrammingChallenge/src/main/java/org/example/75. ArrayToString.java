package org.example;

import java.util.Scanner;

class ArrayToString {
    public static void main(String[] args) {
        String[] arr = new String[] {"This", "is", "the", "best", "course", "for", "Java",
        "on", "the", "Internet", "today."};
        StringBuilder sb = new StringBuilder();

        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
