package com.ambition.exercise.after3;

public class PersonTest {
    public static void main(String[] args) {
        Person student = new Student("小枚", 18, '女', 99);
        Person teacher = new Teacher("阿秋", 28, '男', 9999);

        System.out.println(student.getInfo());
        System.out.println(teacher.getInfo());
    }
}
