package com.ambition.demo2.ing07safe;

/**
 * @Author: ambitions
 * @Date: 2020/09/18/14:29
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) {
        SaleTicket1 saleTicket = new SaleTicket1("12306");
        SaleTicket1 saleTicket1 = new SaleTicket1("黄牛");
        SaleTicket1 saleTicket2 = new SaleTicket1("车站窗口");

        saleTicket.start();
        saleTicket1.start();
        saleTicket2.start();
    }
}

class SaleTicket1 extends Thread{
//     int count = 100;//三百张 三个对象
    public static int count = 100;//不合适 也有线程安全问题
    public SaleTicket1(String name){
        super(name);
    }

    @Override
    public void run() {

        while (count > 0){
            System.out.println(Thread.currentThread().getName() + "卖了第：" + count + "张票");
            count--;
        }
    }
}