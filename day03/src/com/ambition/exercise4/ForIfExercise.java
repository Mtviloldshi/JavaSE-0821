package com.ambition.exercise4;

/*
    第9题：完数
        9、一个数如果恰好等于它的因子之和，这个数就称为"完数"。（因子：除去这个数本身的约数）
        例如6=1＋2＋3.编程 找出1000以内的所有完数
 */
public class ForIfExercise {
    public static void main(String[] args) {

        for (int i = 1; i < 1001; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    //取模为0 说明j为i因子 进行相加
                    sum += j;
                }
            }
            //总因子数相加和=本身 是完数 输出
            if (sum == i) {
                System.out.println(i + "是完数");
            }
        }
    }
}
