package org.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

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

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", grade=" + grade +
                    '}';
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Student> queue = new PriorityQueue<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getGrade() - s2.getGrade();
            }
        });

        queue.offer(new Student("Gaurish", 'A'));
        queue.offer(new Student("Rohit", 'C'));
        queue.offer(new Student("Siddhant", 'B'));
        queue.offer(new Student("Girish", 'A'));

        System.out.printf("Queue is %s", queue);

    }

}
