package com.ambition.exercise.homework3;

public class Test06 {
    public static void main(String[] args) {
        Base b = new Sub();
        System.out.println(b.x);//1
    }
}
class Base{
    int x = 1;
}
class Sub extends Base{
    int x = 2;
}
