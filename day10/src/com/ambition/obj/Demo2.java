package com.ambition.obj;

public class Demo2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.toString());
    }
}

class Dog{
    String name;
    int age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}