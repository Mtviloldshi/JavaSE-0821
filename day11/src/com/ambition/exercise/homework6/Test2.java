package com.ambition.exercise.homework6;

/**
 * @author 86176
 *
 * 5、在com.atguigu.test14包中测试类Test14_2
 *  *  *
 *  *  * ​	(1)请设计一个方法，可以用于遍历一个图形数组
 *  *  *
 *  *  * ​	(2)请设计一个方法，可以用于给一个图形数组进行按照面积从小到大排序
 *  *  *
 *  *  * ​	(3)public static void main(String[] args){}
 *  *  *
 *  *  * ​	在主方法中，创建1个圆、1个矩形、1个三角形对象，放到数组中，遍历显示，然后排序后再遍历显示。
 */
public class Test2 {

    public static void main(String[] args) {
        Graphic c1 = new Circle(1);//3.14
        Graphic c2 = new Circle(5);//78
        Graphic r1 = new Rectangle(3,4);//12
        Graphic r2 = new Rectangle(3,5);//15
        Graphic t1 = new Triangle(3,5);//7.5
        Graphic t2 = new Triangle(3,6);//9

        Graphic[] graphics = {c1,c2,r1,r2,t1,t2};
        traverseArr(graphics);
        for (int i = 0; i < graphics.length - 1; i++) {
            for (int j = 0; j < graphics.length - i -1; j++) {
                if (graphics[j].compareTo(graphics[j + 1]) > 0){
                    Graphic temp = graphics[j];
                    graphics[j] = graphics[j + 1];
                    graphics[j + 1] = temp;
                }
            }
        }
        System.out.println();
        traverseArr(graphics);
    }
    /**
     * 遍历图形数组
     */
    public static void traverseArr(Graphic[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getArea());
        }
    }
}
