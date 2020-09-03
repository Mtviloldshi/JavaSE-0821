package com.ambition.customer.manager.project2;
/*
    Customer为实体类，用来封装客户信息
    该类封装客户的以下信息：
    String name ：客户姓名
    char gender  ：性别
    int age          ：年龄
    String phone：电话号码
    String email ：电子邮箱
    提供各属性的get/set方法
    提供所需的构造器	（可自行确定）

 */
public class Customer {
    private String name;
    private char gender;
    private int age;
    private String phone;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public Customer() {
    }
}
