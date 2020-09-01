package com.ambition.constructor;

public class DemoPerson {
    public static void main(String[] args) {
        Person p = new Person();
        Person p1 = new Person("tom");
        Person p2 = new Person("tom1",19);
        System.out.println(p1.name == p2.name);
    }
}
