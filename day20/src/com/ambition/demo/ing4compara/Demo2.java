package com.ambition.demo.ing4compara;

/**
 * @Author: ambitions
 * @Date: 2020/09/18/10:51
 * @Description:
 *
 *      继承Thread类：
 *          使用简单
 *          有单继承限制
 *      实现Runnable接口：
 *          使用相对复杂
 *          避免了单继承带来的限制
 *          方便共享数据
 */
public class Demo2 {
    public static void main(String[] args) {
        new Thread(new MyRunnable()).start();
        new Thread(new MyRunnable()).start();
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
