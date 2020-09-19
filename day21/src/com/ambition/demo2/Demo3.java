package com.ambition.demo2;

import java.lang.reflect.Constructor;

/**
 * @Author: ambitions
 * @Date: 2020/09/19/11:39
 * @Description:
 */
public class Demo3 {
    public static void main(String[] args) throws Exception {
        //获取Class 字节码对象
        Class aClass = Class.forName("com.ambition.demo2.Animal");
        //获取构造器
        Constructor c1 = aClass.getConstructor(String.class, int.class, char.class);
        //获取对象
        Object o = c1.newInstance("tom", 12, 'f');
        System.out.println(o);
        System.out.println(c1);

        //获取对象，需要空参构造方法
        Object o1 = aClass.newInstance();
        System.out.println(o1);
    }
}

class Animal{
    private String name;
    public int age;
    char gender;

    public Animal(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}