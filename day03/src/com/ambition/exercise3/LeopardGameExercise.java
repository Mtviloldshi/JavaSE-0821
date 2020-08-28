package com.ambition.exercise3;

import java.util.Scanner;

/*
    7、赌数游戏：随机产生3个1-6的整数，如果三个数相等，那么称为“豹子”，如果三个数之和大于9，称
        为“大”，如果三个数之和小于等于9，称为“小”，用户从键盘输入押的是“豹子”、“大”、“小”，并判断是否
        猜对了
        提示：随机数 Math.random()产生 [0,1)范围内的小数
 */
public class LeopardGameExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //产生三个随机数1-6
        int randomNumber1 = (int) (Math.random() * 6 + 1);
        int randomNumber2 = (int) (Math.random() * 6 + 1);
        int randomNumber3 = (int) (Math.random() * 6 + 1);
        String result;//定义开奖结果
        if (randomNumber1 == randomNumber2 && randomNumber1 == randomNumber3){
            result = "豹子";
        }else if ((randomNumber1 + randomNumber2 + randomNumber3) > 9){
            result = "大";
        }else {
            result = "小";
        }
        System.out.println("请输入你押的结果：");
        //接收输入的数据
        String randomStr = scan.next();
        if (result.equals(randomStr)){//比较是否正确
            System.out.println("猜对了！");
        }else {
            System.out.println("猜错了！");
        }
        //随机数结果
        System.out.println(randomNumber1);
        System.out.println(randomNumber2);
        System.out.println(randomNumber3);
    }
}
