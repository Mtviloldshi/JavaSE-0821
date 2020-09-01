package com.ambition.constructor;

public class DemoCat {
    public static void main(String[] args) {
        Cat cat = new Cat("cat");
        Cat cat1 = new Cat("cat");
        System.out.println(cat.name == cat1.name);
        System.out.println(cat == cat1);
        String str = "tom";
        String str1 = "tom";
        System.out.println(str == str1);
    }
}
