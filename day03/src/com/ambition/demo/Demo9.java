package com.ambition.demo;
//if-else if - else
import java.util.Scanner;
//计算如下函数：x和y的关系满足如下： （1）x>=3； y = 2x + 1; （2）-1<=x<3； y = 2x; （3）
//x<-1； y = 2x – 1; 从键盘输入x的值，计算出y的值并输出。
//***使用if-else有覆盖范围时，小范围放前面
public class Demo9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入x的值：");
        int x = scan.nextInt();
        int y;

        if (x >= 3) {
            y = 2 * x + 1;
        } else if (x >= -1 && x < 3) {
            y = 2 * x;
        } else {
            y = 2 * x - 1;
        }
        System.out.println("y = " + y);
    }
}
