package com.ambition.oop;

public class DemoStudent {
    public static void main(String[] args) {
        //创建学生对象
        Student student = new Student();
        //使用属性
        student.name = "lxy";
        student.age = 22;
        student.gender = '男';
        student.studentNumber = 228;

        //获取属性
        System.out.println("姓名：" +  student.name);
        System.out.println("年龄：" +  student.age);
        System.out.println("性别：" +  student.gender);
        System.out.println("学号：" +  student.studentNumber);

        //行为
        student.setClass();
    }
}
