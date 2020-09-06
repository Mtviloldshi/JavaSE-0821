package com.ambition.exercise.homework6;

/**
 * @author 86176
 *
 * 1、在com.atguigu.test14包中声明图形Graphic、圆Circle、矩形Rectangle类、三角形Triangle类
 *
 * ​	2、图形Graphic类中有：
 *
 * ​		①public double getArea()方法：返回面积
 *
 * ​		②public double getPerimeter()方法：返回周长
 *
 * ​		③public String getInfo()方法：返回图形信息
 *
 *
 */
public class Graphic implements Comparable{
    public double getArea(){
        return 0;
    }
    public double getPerimeter(){
        return 0;
    }
    public String getInfo(){
        return null;
    }

    @Override
    public int compareTo(Object o) {
        Graphic graphic = (Graphic) o;
        int i = (int) (this.getArea() - graphic.getArea());
        i = i == 0? 0 : i;
        return i;
    }
}
