package com.ambition.demo2.test08waitnotyfy;

import org.junit.Test;

/**
 * @Author: ambitions
 * @Date: 2020/09/18/16:14
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        WorkBench wb = new WorkBench();
        Cooker cooker = new Cooker(wb);
        Waiter waiter = new Waiter(wb);

        new Thread(cooker,"张三").start();
        new Thread(waiter,"李四").start();
    }

    @Test
    public void test(){
        show(100);
    }
    public void show(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n -i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

//服务员
class Waiter implements Runnable{
    private WorkBench workBench;

    public Waiter(WorkBench workBench) {
        this.workBench = workBench;
    }
    //取走快餐
    @Override
    public void run() {
        while (true){
            workBench.waits();
        }
    }
}

//厨师类
class Cooker implements Runnable{
    private WorkBench workBench;

    public Cooker(WorkBench workBench) {
        this.workBench = workBench;
    }
    //生产快餐
    @Override
    public void run() {
        while (true){
            workBench.cook();
        }
    }
}

class WorkBench{
    public static final int MAX = 10;
    public int num;//工作台存有的快餐份数

    //同步方法生产
    public synchronized void cook(){
        if (num >= MAX){//超过十份 不再生成，等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num++;//生成一份
        System.out.println(Thread.currentThread().getName() + "生产了一份，剩余" + num + "份餐");
        this.notify();//唤醒服务员，可以继续执行取餐
    }

    //同步方法取餐
    public synchronized void waits(){
        if (num <= 0){ //没有餐等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num--;//取餐
        System.out.println(Thread.currentThread().getName() + "取走了一份，剩余" + num + "份餐");

        this.notify();//通知厨师可以生产了
    }
}
