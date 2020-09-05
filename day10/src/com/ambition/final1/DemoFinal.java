package com.ambition.final1;
/*
    final   修饰的变量就是常量,不可被修改
    final   修饰的方法是最终方法 不能被重写
    final   修饰的类为最终类，不能被继承
 */
public class DemoFinal {
    public static void main(String[] args) {
      Student s = new Student();
//      s.name = "11";
    }
}
class Student{
    final String name = "Tom";

    public final void show(){
        System.out.println("final...");
    }
}

class JavaStudent extends Student{
//    public final void show(){
//        System.out.println("final...");
//    }
}
