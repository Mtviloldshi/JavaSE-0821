package com.ambition.exercise.after2;

/*
    （4）在测试类中
        声明一个方法， public static void goToToilet(Person p){ p.toilet(); } 在main中，创建不同子类对
        象，调用goToToilet方法进行测试
 */
public class PersonTest {
    public static void main(String[] args) {
//        Person p = new Woman();
//        Person p2 = new Man();
        goToToilet(new Woman());
        goToToilet(new Man());
    }
    public static void goToToilet(Person p) {
        p.toilet();
    }
}
