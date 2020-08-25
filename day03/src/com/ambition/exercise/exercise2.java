package com.ambition.exercise;

import java.util.Scanner;

//键盘录入三个数，获取这三个数中的最大值(使用三目运算符)
public class exercise2 {
    public static void main(String[] args) {
        //1.创建扫描器
        Scanner scan = new Scanner(System.in);
        //2.提示输入
        System.out.println("请输入第一个数：");
        //3.接收键盘输入数据
        int num1 = scan.nextInt();
        System.out.println("请输入第二个数：");
        int num2 = scan.nextInt();
        System.out.println("请输入第三个数：");
        int num3 = scan.nextInt();

        //4.计算最大值
        int max = num1 > num2 ? (num1 > num3? num1 : num3) : (num2 > num3? num2 : num3);

        System.out.println("您输入的三个数最大值为：" + max);
        System.out.println("程序结束！");
    }
}
