package com.ambition.demo.test05.ArrayList;

import java.util.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/11/16:18
 * @Description:
 */
public class Exercise {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int score = random.nextInt(100);
            list.add(new Student("stu" + i,score));
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Student student = (Student)iterator.next();
            if (student.getAge() < 60){
                iterator.remove();
            }
        }
        for (Object obj:
             list) {
            Student student = (Student)obj;
            System.out.println(student.toString());
        }
    }
}

class Student{
    private String name;
    private Integer age;//成绩

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
