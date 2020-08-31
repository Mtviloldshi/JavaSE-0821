package com.ambition.exercise.after;

/*
    测试
 */
public class GraphicDemo {
    public static void main(String[] args) {
//        Graphic circle = new Graphic("圆形");
//        Graphic rectange = new Graphic("矩形");

        Graphic circle = new Circle("圆形", 5);
        Graphic rectange = new Rectange("矩形", 12, 15);

        System.out.println(circle.getInfo());
        System.out.println(rectange.getInfo());
    }
}
