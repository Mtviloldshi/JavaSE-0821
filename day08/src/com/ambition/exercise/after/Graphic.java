package com.ambition.exercise.after;

/*
    （1）父类Graphic图形 包含属性：name（图形名），属性私有化，不提供无参构造，只提供有参构造
        包含求面积getArea()：返回0.0 求周长getPerimeter()方法：返回0.0 显示信息getInfo()方法：返回图形
        名称、面积、周长
 */
public class Graphic {
    private String name;

    public Graphic(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //图形面积
    public double getArea() {
        return 0.0;
    }

    //图形周长
    public double getPerimeter() {
        return 0.0;
    }

    //图形显示信息
    public String getInfo() {
        return "图形名称：" + name + "、图形面积：" + getArea() + "、图形周长：" + getPerimeter();

    }
}
