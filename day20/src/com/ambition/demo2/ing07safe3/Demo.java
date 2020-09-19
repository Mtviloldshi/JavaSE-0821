package com.ambition.demo2.ing07safe3;

/**
 * @Author: ambitions
 * @Date: 2020/09/18/14:34
 * @Description:
 *
 *  线程安全问题的原因（条件        ）：
 *      1.有共享数据
 *      2.多线程情况
 *      3.多条语句操作共享数据
 *线程问题安全解决：
 *      1.使用同步代码块，把操作共享数据的多条语句包裹起来，使其成为同步的代码块
 *
 */
public class Demo {
    public static void main(String[] args) {
        SaleTicketRunnable str = new SaleTicketRunnable();
        Thread t1 = new Thread(str, "12306");
        Thread t3 = new Thread(str, "黄牛");
        Thread t2 = new Thread(str, "车站窗口");

        t2.start();
        t1.start();
        t3.start();
    }
}
//线程任务类
class SaleTicketRunnable implements Runnable{
    private int count = 100;

    //线程任务：卖票
    @Override
    public void run() {
        while (true){
            sell();
        }
    }

    //买票方法，同步方法，锁对象默认是this
    public synchronized void sell(){
        if (count > 0){
            System.out.println(Thread.currentThread().getName() + "卖了第：" + count + "张票");
            count--;
        }
    }
}
