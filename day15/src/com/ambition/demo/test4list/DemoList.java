package com.ambition.demo.test4list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: ambitions
 * @Date: 2020/09/11/14:06
 * @Description:
 * Collection
 *      List:有序，可重复
 *          有索引，可以通过索引直接操作
 *      Set:不可重复，大部分时无序的
 */
public class DemoList {
    public static void main(String[] args) {
        List list = new ArrayList();
        //添加元素
        list.add(123);
        list.add(456);
        list.add(789);
        //通过索引插入数据，add(int index,E list)
        list.add(2,4);//插入的索引一定要小于集合的长度
        //通过索引位置添加集合
        List list2  = new ArrayList();
        list2.add(0,11);
        list2.add(0,22);
        list.add(list2);
        System.out.println(list);
    }

    @Test
    public void test1(){
        List list = new ArrayList();
        //添加元素
        list.add(123);
        list.add(456);
        list.add(78);
        //E get(int index)通过角标获取元素 并返回数据
        System.out.println(list.get(2));

        //获取一个子集合 subList(int start,int end) 范围[start,end),返回一个新集合
        System.out.println(list.subList(0, 2));

        //获取元素索引 int indexOf(元素) 从前往后查找，返回第一个找到元素索引位置
        System.out.println(list.indexOf(123));
        //获取元素索引 int lastIndexOf(元素) 从后往前查找，返回第一个找到元素索引位置
        System.out.println(list.lastIndexOf(123));

        //删除指定索引位置元素，返回被删除的元素
        System.out.println(list.remove(2));

        //替换元素 E set(int index,E list) 替换指定位置元素,返回被替换元素
        Object set = list.set(0, 111);
        System.out.println(set);

        //遍历方式一iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //for each
        for (Object o : list) {
            System.out.println(o);
        }

        //for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
