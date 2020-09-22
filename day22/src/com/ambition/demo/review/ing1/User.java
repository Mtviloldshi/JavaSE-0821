package com.ambition.demo.review.ing1;

/**
 * @Author: ambitions
 * @Date: 2020/09/19/18:59
 * @Description:
 */
public class User {
    private String name;
    public int age;
    protected String gender;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public User(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public User() {
    }

    public int testParam(int x, int y){
        System.out.println("testparam");
        return x * y;
    }

    private void privateTest(int x){
        System.out.println("privateTest : " + x);
    }
}
