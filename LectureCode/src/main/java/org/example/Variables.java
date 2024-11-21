package org.example;

public class Variables {
    private String name;
    private int age;
    private float salary;
    private char gender;
    private boolean isAdult;


    public Variables() {
    }

    public Variables(String name, int age, float salary, char gender, boolean isAdult) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.isAdult = isAdult;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getSalary() {
        return salary;
    }

    public char getGender() {
        return gender;
    }

    public boolean isAdult() {
        return isAdult;
    }
}
