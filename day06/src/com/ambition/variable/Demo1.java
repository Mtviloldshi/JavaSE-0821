package com.ambition.variable;
/*
    局部变量： 在所有的{}中有用，没有修饰符，没有默认初始值
    成员变量：在整个类中有用，可以有修饰符，有默认值
        类变量 ：静态变量 ，使用static修饰符修饰的，每个类的每个对象共享一个空间的变量
        实例变量 ：没有static修饰的的成员变量，每个对象实例独有一份空间
 */
public class Demo1 {
    //成员变量
    int a;//成员位置
    String name = "tom";//给定初始值
    public static void main(String[] args) {
        //局部变量
        int a = 10;

    }

    {
        int c;//局部变量
    }
}
