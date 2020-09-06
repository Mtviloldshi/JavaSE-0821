package com.ambition.exercise.homework8;


public class Test1 extends Father{
    private String name = "test";

    public static void main(String[] args) {
        Test1 test = new Test1();
        System.out.println(test.getName());
    }
}
class Father {
    private String name = "father";

    public String getName() {
        return name;
    }
}
