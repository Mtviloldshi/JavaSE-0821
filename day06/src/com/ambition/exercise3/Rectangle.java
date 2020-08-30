package com.ambition.exercise3;
//5
/*
    1、声明矩形类com.atguigu.bean.Rectangle

​	（1）包含属性：长和宽，要求属性私有化

​	（2）给每一个属性提供get/set方法

​	（3）public double getArea()

​	（4）public double getPerimeter()

​	（5）提供getInfo()返回矩形对象的信息

​	例如：长：4，宽：2，面积：8，周长：12
 */
public class Rectangle {
    private double height;
    private double weight;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //求面积
    public double getArea(double height, double weight) {
        return height * weight;
    }

    //求周长
    public double getPerimeter(double height, double weight) {
        return height + weight;
    }

    //输出基本信息
    public String getInfo(double height, double weight, double area, double perimeter) {
        return "长：" + height + ",宽：" + weight + ",面积：" + area + ",周长：" + perimeter;
    }
}
