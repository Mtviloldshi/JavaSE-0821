package com.ambition.demo.linkedlist;

import java.util.LinkedList;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/10:11
 * @Description:LinkedList ：继承List接口 底层使用双向链表存储数据，具有增删快，查找慢的特点
 * 1.LinkedList特有方法
         * void addFirst(Object obj )
         * void addLast(Object obj )
         * Object getFirst()
         * Object getLast()
         * Object removeFirst()
         * Object removeLast ()
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(123);
        //在最前端和最尾端 添加数据addFirst(Object obj ) addLast(Object obj ) 无返回值
        list.addLast(456);

        //Object getFirst() Object getLast()获取最前端元素和最后一个元素 返回获取的元素
        System.out.println(list.getLast());

        //Object removeFirst() Object removeLast () 删除第一个元素和 删除最后一个元素，返回被删除元素
        System.out.println(list.removeLast());
        System.out.println(list);
        Integer integer = list.get(0);
        System.out.println(integer);
    }


}
