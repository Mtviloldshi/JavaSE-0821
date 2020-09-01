package com.ambition.objarray;

public class StudentTest {
    public static void main(String[] args) {
        Student[] stu = new Student[5];

        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Student();
            stu[i].name = "stu0" + i;
            stu[i].age = 18 + i;
        }

        for (int i = 0; i < stu.length; i++) {
            System.out.println("学生:" + stu[i].name + "\t年龄:" + stu[i].age);
        }
    }
}
