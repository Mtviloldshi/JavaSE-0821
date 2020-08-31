package com.ambition.method2;

/**
 *  static修饰的方法不能调用实例方法()或实例变量
 *  实例方法可以调用static修饰的变量和方法
 *
 *  静态不能调用非静态
 *  非静态可以调用静态
 */
public class Cat {
    String name;
    int age;

    public void getInfo(){
        System.out.println("name:" + name + "\tage:" + age);
    }

    //静态方法不能访问非静态成员变量
    //也不能访问非静态方法
//    public static void print(){
//        getInfo();//不可调用
//        System.out.println("name:" + name + "\tage:" + age);//不可调用
//    }
}
