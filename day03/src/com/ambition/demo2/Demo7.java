package com.ambition.demo2;

import java.util.Scanner;

/*
    随机生成一个100以内的数，猜数字游戏
    从键盘输入数，如果大了提示，大了，如果小了，提示小了，如果对了，就不再猜了，并统计一共
    猜了多少次
    提示：随机数 Math.random()
    double num = Math.random();// [0,1)的小数
 */
public class Demo7 {
    public static void main(String[] args) {
        double num  = Math.random();//[0-1)之间的double类型的小数
        int random = (int) (num*100);

//        System.out.println(random);
        Scanner scan = new Scanner(System.in);
        int number,count = 0;
        String str;
        do {
            System.out.println("请输入你要猜的数：");
            number = scan.nextInt();
//            if (number > random){
//                System.out.println("你猜的数高了");
//            }else if (number < random){
//                System.out.println("你猜的数低了");
//            }else {
//                System.out.println("恭喜你猜对了");
//            }
            //优化
             str = number > random?  "你猜的数高了": "你猜的数低了";
            System.out.println(str);
            count++;
        }while (random != number);
        System.out.println("恭喜你猜对了，总共猜了：" + count + "次");
    }
}
