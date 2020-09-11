package com.ambition.exercise.text.test3list;

import org.junit.Test;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @Author: ambitions
 * @Date: 2020/09/10/18:38
 * @Description:
 *  LinkedList特点：双向链表存储数据
 *                  增删快、查找慢
 *
 *      LinkedList 特有API
 * void addFirst(Object obj )
 * void addLast(Object obj )
 * Object getFirst()
 * Object getLast()
 * Object removeFirst()
 * Object removeLast ()
 *
 *  基于链表实现的抽象数据结构-队列：先进先出（FIFO）
 * boolean offer(Object obj) : 入队
 * Object peek() : 出队
 * 基于链表实现的抽象数据结构-栈：后进先出（LIFO）
 * void push(E e) ：压栈
 * E pop() ：弹栈
 */
public class ListLinkedList {
    @Test
    public void test1(){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("linkedlist1");
        linkedList.add("linkedlist2");
        linkedList.add("linkedlist3");


        //在首尾添加元素
        linkedList.addFirst("linkedFirst");
        linkedList.addLast("linkedLast");
        System.out.println(linkedList);

        //获取首尾元素
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        //删除首尾元素
        linkedList.removeFirst();
        linkedList.removeLast();

        //删除指定元素 添加指定位置元素 获取指定位置元素....
        System.out.println(linkedList.get(0));

        ListIterator<String> stringListIterator = linkedList.listIterator(linkedList.size());
        //void add()：通过迭代器添加元素到对应集合
        //void set(Object obj)：通过迭代器替换正迭代的元素
        //void remove()：通过迭代器删除刚迭代的元素
        //boolean hasPrevious()：如果以逆向遍历列表，往前是否还有元素。
        //Object previous()：返回列表中的前一个元素。
        //int previousIndex()：返回列表中的前一个元素的索引
        //boolean hasNext()
        //Object next()
        //int nextIndex()
    }
}
