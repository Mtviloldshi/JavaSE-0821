package com.ambition.demo.ing3;

/**
 * @Author: ambitions
 * @Date: 2020/09/18/10:45
 * @Description:
 *
 *      实现Runnable
 */
public class Demo2 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.start();
        t2.start();
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + ":"  + i);
        }
    }
}
