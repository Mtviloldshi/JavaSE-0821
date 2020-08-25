package com.ambition.demo2;

import java.util.Scanner;

/*
    do while
        初始化语句①
        do {
        循环体语句②；
        迭代语句③；
        } while (循环条件语句④)；
 */
public class Demo6 {
    public static void main(String[] args) {
        //统计正数、负数
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入五个整数");
        int i = 0,zhengshu = 0,fushu = 0 ;//初始化变量
        do {
            int num = scan.nextInt();//接收数据
            if (num > 0){
                zhengshu++;
            }else {
                fushu++;
            }
            i++;//迭代
        }while (i < 5);//条件语句
        System.out.println("正数个数：" + zhengshu);
        System.out.println("负数个数：" + fushu);
    }
}
