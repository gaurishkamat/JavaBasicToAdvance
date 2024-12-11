package org.example;

class Course {
    static  int maxCapacity;

    String courseName;
    int enrolledStudents;

    static{
        setMaxCapacity();
    }

    public Course(String courseName, int enrollStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrollStudents;
    }

    public void enrolledStudents(){
        System.out.println("Total students for the course " + this.courseName + ": " + this.enrolledStudents );
    }

    public void unEnrollStudents(){
        this.enrolledStudents--;
    }

    static void setMaxCapacity(){
        maxCapacity = 50;
    }

    public static void main(String[] args) {
        Course course1 = new Course("Advance Java", 2);
        course1.unEnrollStudents();
        course1.unEnrollStudents();
        course1.enrolledStudents();

        Course course2 = new Course("JavaScript", 4);
        course2.enrolledStudents();
        course2.unEnrollStudents();
        course1.unEnrollStudents();

        int count = Course.maxCapacity;
        System.out.println("Total number of students: " + count );
    }

}
