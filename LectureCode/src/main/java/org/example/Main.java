package org.example;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        Variables var = new Variables("John Doe", 30, 50000.00F, 'm',  true);
        System.out.println(var.getName());
        System.out.println(var.getAge());
        System.out.println(var.getSalary());
        System.out.println(var.getGender());
        System.out.println(var.isAdult());
    }

}