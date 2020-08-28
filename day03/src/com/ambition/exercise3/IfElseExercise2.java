package com.ambition.exercise3;

import java.util.Scanner;

/*
    第4题：相亲
        4、大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，当然要提出一定的条件：高：180cm
            以上；富：财富1千万以上；帅：是。
            如果这三个条件同时满足，则：“我一定要嫁给他!!!”
            如果三个条件中有为真的情况，则：“嫁吧，比上不足，比下有余。”
            如果三个条件都不满足，则：“不嫁！”
 */
public class IfElseExercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入身高：");
        double weight = scan.nextDouble();
        System.out.println("请输入财富：");
        int wealth = scan.nextInt();
        System.out.println("是否长得帅？");
        char isHandsome = scan.next().charAt(0);

        if (weight < 0) {
            System.out.println("输入身高有误！");
        } else if (weight > 179 && wealth > 10000000 && isHandsome == '是') {
            System.out.println("我一定要嫁给他！！！");
        }else if(weight > 179 || weight > 10000000 || isHandsome == '是'){
            System.out.println("嫁吧，比上不足，比下有余。");
        }else {
            System.out.println("不嫁！");
        }
    }
}
