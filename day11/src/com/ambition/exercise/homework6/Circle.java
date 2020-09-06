package com.ambition.exercise.homework6;

/**
 * @author 86176
 *
 *  ​	3、圆类和矩形类重写这两个方法
 *  *
 *  * ​
 */
public class Circle extends Graphic{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return radius * radius * Math.PI;
    }
    @Override
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
//    public String getInfo(){
//        return null;
//    }
}
