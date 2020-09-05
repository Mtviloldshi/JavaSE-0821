package com.ambition.exercise.before2;

/*
    声明一个Employee员工类，包含编号、姓名、薪资，实现Comparable接口，要求，按照薪资比
    较大小，如果薪资相同，按照编号比较大小。

 */
public class Employee implements Comparable {
    private int number;
    private String name;
    private double salary;//薪资

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

    //第一种方法
//    @Override
//    public int compareTo(Object o) {
//        //向下转型
//        Employee employee = (Employee) o;
////        if (this.salary != employee.salary) {//比较薪资
//        if (this.salary > employee.salary) {
//            return 1;
//        } else if (this.number > employee.number) {//比较编号
//            return 1;
//        }
//        return 0;
//    }

    //第二种方法
    @Override
    public int compareTo(Object o) {
        //向下转型
        Employee employee = (Employee) o;
        if (this.salary != employee.salary) {//比较薪资
            return (int) (this.salary - employee.salary);
        } else if (this.number != employee.number) {//比较编号
            return this.number - employee.number;
        }
        return 0;
    }
}
