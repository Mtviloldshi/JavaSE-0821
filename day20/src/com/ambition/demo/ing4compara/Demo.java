package com.ambition.demo.ing4compara;

/**
 * @Author: ambitions
 * @Date: 2020/09/18/10:49
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
