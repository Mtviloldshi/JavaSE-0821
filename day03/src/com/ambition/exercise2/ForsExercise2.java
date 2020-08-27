package com.ambition.exercise2;

/*
    打印正三角形和菱形
 */
public class ForsExercise2 {
    public static void main(String[] args) {
        //正
        for (int i = 0; i < 5; i++) {
            //空格
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            //*
            for (int k = 0; k < i + 1; k++) {
                System.out.print(" *");
            }
            //换行
            System.out.println();
        }

        //倒
        for (int i = 0; i < 4; i++) {
            //空格
            //多输入两个空格 ：因为上一行是5个* 然后接下来输入的为4个* 对齐底部所以多输入两个空格每一行
            for (int j = 0; j < i + 2; j++) {
                System.out.print(" ");
            }
            //*
            //少输入 一行*
            for (int k = 0; k < 4 - i; k++){
                System.out.print(" *");
            }
            //换行
            System.out.println();
        }
    }
}
