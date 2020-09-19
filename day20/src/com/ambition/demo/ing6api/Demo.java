package com.ambition.demo.ing6api;

/**
 * @Author: ambitions
 * @Date: 2020/09/18/11:23
 * @Description:
 *
 *      线程睡眠 sleep(long time)
 *          线程睡眠，使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）
 *      线程礼让
 *          概率礼让
 *          public static void yield()：线程礼让，yield只是让当前线程暂时失去执行权，让系统的线程调度器
 *          重新调度一次，希望优先级与当前线程相同或更高的其他线程能够获得执行机会，但是这个不能保
 *          证，完全有可能的情况是，当某个线程调用了yield方法暂停之后，线程调度器又将其调度出来重
 *          新执行。
 *      线程加入 t1.join()
 *          这时只有t1线程执行完毕才会继续执行当前线程
 *      守护线程 setDaemon(boolean true)
 *          非守护线程死亡，守护线程即死
 */
public class Demo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("悟空");
        MyThread t2 = new MyThread("八戒");

        t1.start();
        t2.start();
    }
}
class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i == 10){
                System.out.println("小睡三秒");
                try {
                    Thread.yield();
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}