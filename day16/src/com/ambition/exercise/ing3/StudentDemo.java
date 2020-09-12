package com.ambition.exercise.ing3;

import java.util.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/18:05
 * @Description:
 * 用Comparable接口对下列四位同学的成绩做降序排序，如果成绩一样，那在成绩排序的基础上按
 * 照年龄由小到大排序
 *
 * 用Comparator实现按照姓名排序
 */
public class StudentDemo {
    public static void main(String[] args) {
        Set<Student> set = new TreeSet<>();
        set.add(new Student("zhangsan",20,100));
        set.add(new Student("lisi",30,90));
        set.add(new Student("wangwu",10,70));
        set.add(new Student("qianliu",8,100));

        System.out.println("按成绩和年龄排名:");
        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

        Set<Student> set1 = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        set1.add(new Student("zhangsan",20,100));
        set1.add(new Student("lisi",30,90));
        set1.add(new Student("wangwu",10,70));
        set1.add(new Student("qianliu",8,100));
        System.out.println("按姓名排序：");
        for (Student student : set1) {
            System.out.println(student.toString());
        }
    }
}
class Student implements Comparable<Student>{
    private String name;
    private Integer age;
    private Integer score;

    @Override
    public int compareTo(Student o) {
        int i = o.getScore() - this.getScore();
        i = i == 0? this.getAge() - o.getAge() : i;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(String name, Integer age, Integer score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

}
