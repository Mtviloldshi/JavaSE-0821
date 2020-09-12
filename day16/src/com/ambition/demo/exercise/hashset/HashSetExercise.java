package com.ambition.demo.exercise.hashset;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/14:19
 * @Description:
 */
public class HashSetExercise {
    public static void main(String[] args) {
        Set<Employee> set = new HashSet<>();
        set.add(new Employee("tom",new MyDate(1998,11,22)));
        set.add(new Employee("tom1",new MyDate(1992,11,22)));
        set.add(new Employee("tom3",new MyDate(1994,11,22)));
        set.add(new Employee("tom3",new MyDate(1994,11,22)));
        for (Employee employee : set) {
            System.out.println(employee.getName() + "\t" + employee.hashCode());
        }
    }
}

class Employee{
    private String name;
    private MyDate birthday;//员工的生日

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) &&
                birthday.equals(employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Employee() {
    }

    public Employee(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
}

class MyDate{
    private Integer year;
    private Integer month;
    private Integer day;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year.equals(myDate.year) &&
                month.equals(myDate.month) &&
                day.equals(myDate.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public MyDate() {
    }

    public MyDate(Integer year, Integer month, Integer day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
