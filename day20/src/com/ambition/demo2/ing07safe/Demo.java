package com.ambition.demo2.ing07safe;

/**
 * @Author: ambitions
 * @Date: 2020/09/18/14:22
 * @Description:
 *
 *      火车票：
 *          G1
 */
public class Demo {
    public static void main(String[] args) {
        SaleTicket saleTicket = new SaleTicket("12306");
        SaleTicket saleTicket1 = new SaleTicket("黄牛");
        SaleTicket saleTicket2 = new SaleTicket("车站窗口");

        saleTicket.start();
        saleTicket1.start();
        saleTicket2.start();
    }
}

class SaleTicket extends Thread{

    public SaleTicket(String name){
        super(name);
    }

    @Override
    public void run() {
        int count = 100;//局部变量导致各个线程卖了100张，不合要求
        while (count > 0){
            System.out.println(Thread.currentThread().getName() + "卖了第：" + count + "张票");
            count--;
        }
    }
}
