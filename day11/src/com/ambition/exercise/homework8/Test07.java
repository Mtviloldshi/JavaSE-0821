package com.ambition.exercise.homework8;

public class Test07 {
    public static void main(String[] args) {
        Son son = new Son();
    }
}
class Father1{
    static{
        System.out.println("（1）父类的静态代码块");//11
    }
    {
        System.out.println("（2）父类的非静态代码块");//33
    }
    Father1(){
        System.out.println("（3）父类的无参构造");//44
    }
}
class Son extends Father1{
    static{
        System.out.println("（4）子类的静态代码块");//22
    }
    {
        System.out.println("（5）子类的非静态代码块");//55
    }
    Son(){
        System.out.println("（6）子类的无参构造");//66
    }
}
