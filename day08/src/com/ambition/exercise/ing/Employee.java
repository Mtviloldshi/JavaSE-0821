package com.ambition.exercise.ing;
//this() 必须在构造方法中的第一行
public class Employee {
    private int number;
    private String name;
    private double salary;
    private char gender;

    public  Employee() {

    }

    public Employee(int number, String name, double salary, char gender) {
        this.number = number;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    public String getInfo() {
        return "员工姓名：" + name + "\t\t员工编号：" + number + "\t员工薪资：" + salary + "\t员工性别：" + gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
