package com.ambition.exercise.ing2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/18:01
 * @Description:
 * 3. ### 练习4
 *    （1）声明一个圆类型，包含半径，实现Comparable接口，按照半径大小排序
 *    （2）存储几个圆对象到TreeSet中，并且遍历显示
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Circle> set = new TreeSet<>(new Comparator<Circle>() {
            @Override
            public int compare(Circle o1, Circle o2) {
                return (int)(o2.getRadius() - o1.getRadius());
            }
        });
        set.add(new Circle(12.0));
        set.add(new Circle(2.0));
        set.add(new Circle(10.0));
        set.add(new Circle(21.0));
        set.add(new Circle(122.0));

        for (Circle circle : set) {
            System.out.println(circle.getRadius());
        }
    }
}
class Circle{
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Circle() {
    }
}
