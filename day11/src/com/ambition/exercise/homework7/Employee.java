package com.ambition.exercise.homework7;

/**
 * @author 86176
 *
        员工类属性：编号、姓名、年龄、薪资
 * *
 */
public class Employee {
    private  String position;
    private int number;
    private String name;
    private int age;
    private double salary;

    @Override
    public String toString() {
        return position + "\t" +  number + "\t" + name +
                "\t\t"+ age + "\t\t" +  salary;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Employee(String position, int number, String name, int age, double salary) {
        this.position = position;
        this.number = number;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }
}
