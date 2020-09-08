package com.ambition.javadoc;

import org.junit.Test;

/**
 * @author 86176
 * @version 1.0
 * 学生类
 */
public class Student {
    private String name;
    int age;
    int a;



    public void setA(int a) {
        this.a = a;
    }


    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }
}
