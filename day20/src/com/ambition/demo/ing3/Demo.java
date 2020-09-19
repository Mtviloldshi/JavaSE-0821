package com.ambition.demo.ing3;


/**
 * @Author: ambitions
 * @Date: 2020/09/18/10:26
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        //创建线程任务对象
        MyThread mt = new MyThread();
        MyThread mt2 = new MyThread();


        //启动线程
        mt.start();
        mt2.start();
    }
}
//线程任务对象 继承Thread
class MyThread extends Thread{

    //线程任务
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
