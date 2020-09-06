package com.ambition.exercise.homework3;



//如下代码是否可以编译通过，如果能，结果是什么，如果不能，为什么？
//        不能 私有属性只能在本类中使用
//
class Father{
    private static String name = "atguigu";
    int age = 0;

}
public class Child extends Father{
    public String grade;


    public static void main(String[] args){
        Father f = new Child();
        System.out.println();
    }
}
