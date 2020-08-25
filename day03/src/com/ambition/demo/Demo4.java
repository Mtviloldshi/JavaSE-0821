package com.ambition.demo;
import java.util.Scanner;
//键盘录入两整数求和
public class Demo4 {
    public static void main(String[] args) {
        //1.创建扫描器
        Scanner scan = new Scanner(System.in);
        //2.提示信息
        System.out.println("请输入第一个整数： ");
        //3.接收键盘录入的数据
        int a = scan.nextInt();
        System.out.println("请输入第二个整数：");
        int b = scan.nextInt();

        System.out.println("第一个整数与第二个整数之和为：" + (a + b));
        System.out.println("程序结束");
    }
}

