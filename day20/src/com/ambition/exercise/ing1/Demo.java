package com.ambition.exercise.ing1;

/**
 * @Author: ambitions
 * @Date: 2020/09/18/20:27
 * @Description:
 *
 *  生产者消费者
 *      一对一
 */
public class Demo {
    public static void main(String[] args) {
        WorkBench wb = new WorkBench();
        MyCooker mc = new MyCooker(wb);
        MyWaiter mw = new MyWaiter(wb);

        new Thread(mc,"厨师").start();
        new Thread(mw,"服务员").start();
    }
}

//消费者
class MyWaiter implements Runnable{
    private WorkBench workBench;

    public MyWaiter(WorkBench workBench) {
        this.workBench = workBench;
    }

    @Override
    public void run() {
        while (true){
            workBench.getWait();
        }
    }
}

//生产者
class MyCooker implements Runnable{
    private WorkBench workBench;

    public MyCooker(WorkBench workBench) {
        this.workBench = workBench;
    }

    @Override
    public void run() {
        while (true){
            workBench.setCook();
        }
    }
}

//共享数据
class WorkBench{
    public static int MAX = 10;//餐台最大放 餐盒数
    public int num;//餐台当前 餐盒数

    //取餐
    public synchronized void getWait(){
        if (num <= 0){//当餐台没有餐时
            try {
                this.wait();//程序等待，并释放锁
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num--;
        System.out.println(Thread.currentThread().getName() + "已取走一份餐，餐台剩余:" + num + "份餐");
        this.notify();//唤醒程序
    }

    //做盒饭
    public synchronized void setCook(){
        if (num >= MAX){//当餐台餐数超过10时
            try {
                this.wait();//程序等待，并释放锁
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num++;
        System.out.println(Thread.currentThread().getName() + "已做好一份餐，餐台剩余:" + num + "份餐");
        this.notify();//唤醒程序
    }
}
