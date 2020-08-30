package com.ambition.exercise2;

public class CountDemo {
    public static void main(String[] args) {
        Count count1 = new Count();
        Count count2 = new Count();

        count1.rate = count2.rate = 0.035;
        count1.number = 123456;
        count2.number = 123789;
        count1.balance = 100;
        count2.balance = 1000;

        System.out.println("账户：" + count1.number + "的余额为：" + count1.balance + "\t年利率为：" + count1.rate);
        System.out.println("账户：" + count2.number + "的余额为：" + count2.balance + "\t年利率为：" + count2.rate);
    }
}
