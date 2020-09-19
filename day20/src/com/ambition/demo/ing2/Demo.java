package com.ambition.demo.ing2;

/**
 * @Author: ambitions
 * @Date: 2020/09/18/10:20
 * @Description:
 *
 *  创建多线程的方式二：
 *      实现Runnable接口
 */
public class Demo {
    public static void main(String[] args) {
        //创建一个线程任务对象
        MyRunnable mr = new MyRunnable();
        //创建线程对象
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        //启动线程
        t1.start();
        t2.start();

//        for (int i = 0; i < 20; i++) {
//            System.out.println(Thread);
//        }
    }
}

//线程任务类
class MyRunnable implements  Runnable{

    //线程任务
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
