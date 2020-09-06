package com.ambition.exercise.homework6;

/**
 * 三角形
 */
public class Triangle extends Graphic{
    private double Di;
    private double height;
    @Override
    public double getArea(){
        return Di * height / 2;
    }
    @Override
    public double getPerimeter(){
        return height + height + height;
    }

    public double getDi() {
        return Di;
    }

    public void setDi(double di) {
        Di = di;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle() {
    }

    public Triangle(double di, double height) {
        Di = di;
        this.height = height;
    }
}
