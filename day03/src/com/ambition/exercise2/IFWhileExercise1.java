package com.ambition.exercise2;

import java.util.Scanner;

/*
    语法案例演示2：统计正数、负数个数
    案例：从键盘输入不断输入整数，输入0表示结束，统计一共有几个正数、负数
 */
public class IFWhileExercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入整数，输入0代表结束：");
        int number,zhenshu = 0,fushu = 0;
        while (true){
            number =  scan.nextInt();
            if (number == 0){
                break;//当number == 0 跳出循环
            }else if (number > 0){
                zhenshu++;
            }else {
                fushu ++;
            }
        }
        //第二种方式 do-while
//        do {
//            number =  scan.nextInt();
//            if (number > 0){
//                zhenshu++;
//            }else if(number < 0){
//                fushu ++;
//            }
//        }while (number != 0);

        System.out.print("正数个数为：" + zhenshu);
        System.out.print("\n负数个数为：" + fushu);
    }
}
