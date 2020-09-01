package com.ambition.exercise.ing;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1234, "刘", 8000, '男');
        Employee e2 = new Employee(1235, "刘", 80000, '男');
        System.out.println(e1.getInfo());
        System.out.println(e2.getInfo());
        System.out.println(e1.getGender() == e2.getGender());
        System.out.println(e1.getName() == e2.getName());
    }
}
