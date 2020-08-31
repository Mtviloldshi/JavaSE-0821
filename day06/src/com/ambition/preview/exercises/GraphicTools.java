package com.ambition.preview.exercises;

/*
    1. 声明一个图形工具类GraphicTools，包含一个静态方法可以返回两个圆中面积大的那一个圆
    的方法
 */
public class GraphicTools {
    int radius;

    //求出圆面积 较大的一个
    public static double getBigArea(double area1, double area2) {
        return area1 > area2 ? area1 : area2;
    }
}
