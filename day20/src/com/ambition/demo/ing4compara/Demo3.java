package com.ambition.demo.ing4compara;

/**
 * @Author: ambitions
 * @Date: 2020/09/18/10:58
 * @Description:
 */
public class Demo3 {
    public static void main(String[] args) {
        //匿名内部类对象
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }.start();

        //匿名内部类对象
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }).start();
    }
}
