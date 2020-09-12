package com.ambition.demo.treeset;

import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/15:25
 * @Description:
 *  让元素本身具备可比较性，也就是实现comparable接口
 */
public class Demo4 {
    public static void main(String[] args) {
        Set<Student> set = new TreeSet<>();
        set.add(new Student("tom", 12, 99));
        set.add(new Student("tom1", 13, 99));
        set.add(new Student("tom2", 14, 79));
        set.add(new Student("tom3", 15, 69));
        set.add(new Student("tom4", 16, 59));
        set.add(new Student("tom4", 16, 51));
        set.add(new Student("tom4", 16, 51));

        for (Student student : set) {
            System.out.println(student.toString());
        }
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int age;
    private Integer score;

    public Student(String name, int age, Integer score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public Student() {
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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        int i = this.age - o.getAge();
        i = i == 0 ? this.score - o.score : i;
        i = i == 0? this.name.compareTo(o.name) : i;
        return i;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
