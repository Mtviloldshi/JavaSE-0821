package com.ambition.demo.review.ing2;

/**
 * @Author: ambitions
 * @Date: 2020/09/20/12:55
 * @Description:
 *      线程安全
 *          三人窗口同时卖票
 */
public class Demo2 {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();
        new Thread(st,"一号窗口").start();
        new Thread(st,"二号窗口").start();
        new Thread(st,"三号窗口").start();
    }

}
class SellTicket implements Runnable{
    private int sum = 200;
    @Override
    public void run() {
        while (true){
            test();
        }
    }

    public synchronized void test(){
        if (sum > 0){
            System.out.println(Thread.currentThread().getName() + "卖出了第" + sum + "张票");
            sum--;
        }
    }
}
