package com.ambition.node;
//获取一个四位数的个位，十位，百位，千位
public class Demo5 {

    public static void main(String[] args) {
        int number = 1234;
        int qian = number/1000;
        int bai = (number - (qian*1000))/100;
        int shi = (number - (qian*1000 + bai*100))/10;
        int ge = (number - (qian*1000 + bai*100 + shi*10));
        System.out.println("千位：" + qian);
        System.out.println("百位：" +bai);
        System.out.println("十位：" +shi);
        System.out.println("个位：" +ge);
    }

}
