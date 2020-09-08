package com.ambition.exercise.ing3;

/**
 * @Author: ambitions
 * @Date: 2020/09/07/20:53
 * @Description:
 *
 * 声明一个Employee员工类，包含编号、姓名、薪资，
 */
public class Employee {
    private int number;
    private String name;
    private double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int number, String name, double salary) {
        this.number = number;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }
}
