package org.example;

import java.util.Collections;

class StudentPriorityQueue {

    private static class Student{
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

    }

    public static void main(String[] args) {
        System.out.println("Hello Student");
        Student s1 = new Student("Gaurish", 'A');
    }

}
