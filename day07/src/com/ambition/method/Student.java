package com.ambition.method;
/*
    当被调用方法与类成员变量无关系的时候，使用静态方法
 */
public class Student {
    int age;
    String name;

    public void study() {
        System.out.println("学习中...");
    }

    //返回值类型，int
    public int add(int a ) {
        return a;
    }

    //static修饰：类方法(静态方法)
    public static void show(){
        System.out.println("static");
    }
}
