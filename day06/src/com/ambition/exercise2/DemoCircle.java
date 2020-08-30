package com.ambition.exercise2;

public class DemoCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        c1.r = 5;
        c2.r = 3;

        System.out.println("半径为：" + c1.r + "的圆面积为" + (c1.r * c1.r * Math.PI));
        System.out.println("半径为：" + c2.r + "的圆面积为" + (c2.r * c2.r * Math.PI));
    }
}
