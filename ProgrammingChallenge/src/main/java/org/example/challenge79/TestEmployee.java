package org.example.challenge79;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Gaurish", 35, 35000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Gau");
        System.out.println(emp.getEmployeeDetails());
    }
}

