package com.ambition.exercise3;
/*
 * 语法与技能：
 * 包、类（属性、构造器、方法）、对象、this
 * eclipse使用
 * 在com.atguigu.test02.bean包中定义一个圆形Circle类。
 * 属性：私有化
 * r：半径
 * 构造方法：
 * 无参构造方法
 * 满参构造方法
 * 成员方法：
 * get/set方法
 * showArea方法：打印圆形面积
 * showPerimeter方法：打印圆形周长
 * 在com.atguigu.test02.test包中定义测试类TestCircle：创建Circle对象，并测试。

 * 开发提示：
 */

public class Circle {
    double r;

    //打印圆面积
    public void showArea() {
        System.out.println("面积：" + r * r * Math.PI);
    }

    //打印周长
    public void showPerimeter() {
        System.out.println("周长:" + 2 * Math.PI * r);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
