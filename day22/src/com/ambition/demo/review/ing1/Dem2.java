package com.ambition.demo.review.ing1;

/**
 * @Author: ambitions
 * @Date: 2020/09/19/21:48
 * @Description:
 */
public class Dem2 {
    public static void main(String[] args) {
        //创建学生对象
        Student stu = new Student("张三",13);
        //创建老师对象
        Teach teach = new Teach("lis",new Student());
        teach.setName("李四");
        teach.setStudent(stu);
        System.out.println(teach.toString());
        String name = "李四";
    }
}

class Teach{
    private String name;
    private Student student;//定义学生类属性，相当于这个老师的学生

    public Teach() {
    }

    @Override
    public String toString() {
        return "Teach{" +
                "name='" + name + '\'' +
                ", student=" + student +
                '}';
    }

    public Teach(String name, Student student) {
        this.name = name;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
}


