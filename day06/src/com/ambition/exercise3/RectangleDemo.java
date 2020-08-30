package com.ambition.exercise3;

/*
    1）在main()方法中创建Rectangle对象，并用set方法为属性赋值

​	（2）调用get方法打印属性的值，调用getArea打印面积，调用getPerimeter打印周长

​	（3）再次调用set方法修改属性的值为原来属性值的两倍

​	（4）调用getInfo方法打印矩形信息
 */
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        int i = 10, j = 10;

        r1.setHeight(i);
        r1.setWeight(j);

        double area = r1.getArea(r1.getHeight(), r1.getWeight());
        double perimeter = r1.getPerimeter(r1.getHeight(), r1.getWeight());

        System.out.println(r1.getInfo(r1.getHeight(), r1.getWeight(), area, perimeter));

        r1.setHeight(i * 2);
        r1.setWeight(j * 2);

        area = r1.getArea(r1.getHeight(), r1.getWeight());
        perimeter = r1.getPerimeter(r1.getHeight(), r1.getWeight());

        System.out.println(r1.getInfo(r1.getHeight(), r1.getWeight(), area, perimeter));
    }
}
