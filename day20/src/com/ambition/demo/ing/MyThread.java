package com.ambition.demo.ing;

/**
 * @Author: ambitions
 * @Date: 2020/09/18/10:07
 * @Description:
 *
 *  创建多线程的方式一:
 *      创建一个Thread类的子类，并重写方法
 *
 */
public class MyThread extends Thread{

    //线程要执行的东西
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "：" + i);
        }
    }
}
class Demo{
    public static void main(String[] args) {
        //创建一个线程对象
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        //启动线程
        myThread.start();
        myThread1.start();

        //普通方法调用
//        myThread.run();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

