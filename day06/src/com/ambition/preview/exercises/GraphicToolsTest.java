package com.ambition.preview.exercises;

public class GraphicToolsTest {
    public static void main(String[] args) {
        GraphicTools area1 = new GraphicTools();
        GraphicTools area2 = new GraphicTools();

        area1.radius = 3;
        area2.radius = 5;

        double areas1 = area1.radius * area1.radius * Math.PI;
        double areas2 = area2.radius * area2.radius * Math.PI;

        System.out.println("面积较大的圆面积为：" + GraphicTools.getBigArea(areas1, areas2));
    }
}
