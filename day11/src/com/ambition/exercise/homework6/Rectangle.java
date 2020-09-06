package com.ambition.exercise.homework6;

/**
 * 矩形
 */
public class Rectangle extends Graphic{
    private double height;
    private double weight;
    @Override
    public double getArea(){
        return height * weight;
    }
    @Override
    public double getPerimeter(){
        return (height + weight) * 2;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Rectangle(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public Rectangle() {
    }
}
