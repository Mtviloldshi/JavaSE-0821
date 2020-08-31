package com.ambition.exercise.after;

/*
    （3）子类矩形Rectange继承Graphic图形 包含属性：length、width 重写求面积getArea()和求周长
        getPerimeter()方法
 */
public class Rectange extends Graphic {
    private int length;
    private int weight;

    public Rectange(String name, int length, int weight) {
        super(name);
        this.length = length;
        this.weight = weight;
    }

    //图形面积
    public double getArea() {
        return length * weight;
    }

    //图形周长
    public double getPerimeter() {
        return length * 2 + weight * 2;
    }

//    //图形显示信息
//    public String getInfo() {
//        return "图形名称：" + super.getName() + "、图形面积：" + getArea() + "、图形周长：" + getPerimeter();
//
//    }
}
