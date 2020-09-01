package com.ambition.constructor;
/*
    构造器
        用于初始化对象，无返回值，方法名跟类名必须一样
        默认情况下，每个类都有一个隐藏的无参构造器。当手动的创建了任何一个构造器，默认隐藏的无参构造器就没有了
 */
public class Person {
    public String name;
    public int age;

    //构造器：用于初始化对象，无返回值，方法名跟类名必须一样
    public Person(){
        System.out.println("构造器");
    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
}
