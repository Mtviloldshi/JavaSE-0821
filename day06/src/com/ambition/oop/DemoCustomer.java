package com.ambition.oop;

public class DemoCustomer {
    public static void main(String[] args) {
        ///通过类来创建对象
        Customer cust = new Customer();//创建Customer对象 并存入变量customer

        //使用对象
        cust.name = "张三";//给属性赋值
        cust.age = 18;
        cust.gender = '男';

        //获取属性值
        System.out.println("姓名：" + cust.name);
        System.out.println("年龄：" + cust.age);
        System.out.println("性别：" + cust.gender);
        cust.shopping();
    }
}
