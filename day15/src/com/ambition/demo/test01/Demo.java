package com.ambition.demo.test01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author: ambitions
 * @Date: 2020/09/11/9:58
 * @Description:
 *
 *  集合：是个存储多个数据的容器，类似数组
 *  有数组为什么还要用集合？
 *      数组的不足（特点）：
 *          1.长度固定
 *          2.数组提供的功能有限
 *          3.数据可以存基本数据类型和引用数据类型
 *          4.数组存储数据特点单一，即有序的，可重复的。
 *      集合：
 *          1.可变长度，自动拓展长度
 *          2.集合提供了更丰富的功能（对数据的增删改查）
 *          3.集合只能存引用数据类型
 *          4.集合提供多个类，提供不同特点数据存储方式
 */
public class Demo {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        //添加元素 add()
        coll.add(11);//自动装箱
        coll.add(12);//自动装箱
        coll.add(13);//自动装箱
        System.out.println(coll);//重写toString()

        //添加一个集合 addAll()
        Collection coll2 = new ArrayList();
        coll2.add(33);
        coll2.add(44);
        coll2.add(55);

        coll.addAll(coll2);
        System.out.println(coll);

        //删除 boolean remove(Object obj)
        System.out.println(coll.remove(11));
        System.out.println(coll);

        //删除一个集合 boolean remove(Collection col)//删除所有coll2相同元素
        coll.removeAll(coll2);
        System.out.println(coll);

        //判断当前集合是否有某个元素
        System.out.println(coll.contains(11));

        //判断当前集合是否包含另一个集合
        System.out.println(coll.containsAll(coll2));

        //返回集合长度
        System.out.println(coll.size());

        //返回两集合交集，到当前集合
        coll.retainAll(coll2);

        //集合转数组 返回数组
        Object[] objects = coll.toArray();
    }
}
