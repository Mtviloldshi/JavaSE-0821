package com.ambition.demo.ing5threadclass;

/**
 * @Author: ambitions
 * @Date: 2020/09/18/11:09
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr,"富庆");

        //设置优先级，在线程启动前,概率提高了
        t1.setPriority(6);

        new Thread(mr,"悟空").start();
        t1.start();


        //获取线程优先级
        System.out.println(t1.getPriority());

//        for (int i = 0; i < 1000; i++) {
//            System.out.println(i);
//        }
//        System.out.println(t1.isAlive());
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
