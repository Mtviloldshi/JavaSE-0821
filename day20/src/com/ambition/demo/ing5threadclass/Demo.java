package com.ambition.demo.ing5threadclass;

/**
 * @Author: ambitions
 * @Date: 2020/09/18/11:05
 * @Description:
 *
 *      通过构造方法给线程指定线程名
 */
public class Demo {
    public static void main(String[] args) {
        new MyThread("悟空").start();
        new MyThread("富庆").start();
    }
}
class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
