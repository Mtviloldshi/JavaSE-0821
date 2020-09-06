package com.ambition.exercise.homework8;

class HelloA{
    public HelloA(){
        System.out.println("HelloA"); //4
    }
    {
        System.out.println("I'm A Class"); // 3
    }
    static{
        System.out.println("static A");//1
    }
}

public class HelloB extends HelloA{
    public HelloB(){
        System.out.println("HelloB");//6
    }
    {
        System.out.println("I'm B Class");//5
    }
    static{
        System.out.println("static B");// 2
    }

    public static void main(String[] args) {
        new HelloB();
    }

}
