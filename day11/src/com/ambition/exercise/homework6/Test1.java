package com.ambition.exercise.homework6;


/**
 * @author 86176
 * <p>
 * 4、在com.atguigu.test14包中声明测试类Test14_1
 * *  *
 * *  * ​	(1)请设计一个方法，可以用于比较两个图形的面积是否相等
 * *  *
 * *  * ​	(2)请设计一个方法，可以用于找出两个图形中面积大的那个
 * *  *
 * *  * ​	(3)public static void main(String[] args){}
 * *  *
 * *  * ​	在主方法中，创建1个圆、1个矩形、1个三角形对象，并分别调用(1)、(2)方法进行测试。
 * *  *
 */
public class Test1 {
    public static void main(String[] args) {
        Graphic c1 = new Circle(1);
        Graphic c2 = new Circle(5);
        Graphic r1 = new Rectangle(3,4);
        Graphic r2 = new Rectangle(3,5);
        Graphic t1 = new Triangle(3,5);
        Graphic t2 = new Triangle(3,6);

        System.out.println(getArea(c1,c2));
        System.out.println(selectArae(c1,r1));
        System.out.println(getArea(c1,t1));
    }

    /**
     * 比较圆面积是否相等
     *
     * @param area1
     * @param area2
     * @return
     */
    public static boolean getArea(Graphic area1, Graphic area2) {
        return area1.getArea() == area2.getArea() ? true : false;
    }

    /**
     * 找出两个圆 面积较大的那个
     *
     * @param area1
     * @param area2
     * @return
     */
    public static Graphic selectArae(Graphic area1, Graphic area2) {
        return area1.getArea() > area1.getArea() ? area1 : area2;
    }
}
