package com.ambition.exercise.after;

/*
    （2）子类Circle圆继承Graphic图形 包含属性：radius 重写求面积getArea()和求周长getPerimeter()方
        法，显示信息getInfo()加半径信息
 */
public class Circle extends Graphic {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }


    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public String getInfo() {
        return "半径为：" + this.radius + "图形名称：" + super.getName() + "、图形面积：" +
                this.getArea() + "、图形周长：" + this.getPerimeter();
    }
}
