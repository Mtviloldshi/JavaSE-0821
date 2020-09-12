package com.ambition.demo.deque;

import java.util.LinkedList;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/11:10
 * @Description:
 *  Deque:
 *      队列：先进先出,先进去的元素，取出时先被取出
 *      API:
 *          boolean offer(E e):入队
 *          E poll()：出队
 *          peek()：检查
 *
 *      栈：先进后出，先进去的元素，取出时最后才被取出
 *      API:
 *          boolean push(E e):压栈
 *          E pop():弹栈
 */
public class DequeDemo {
    public static void main(String[] args) {
        LinkedList<String> lin = new LinkedList<>();
        lin.offer("hello");
        lin.offer("java");
        lin.offer("world");
    }
}
