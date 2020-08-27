package com.ambition.exercise2;
/*
    打印正倒直角三角形
 */
public class ForsExercise1 {
    public static void main(String[] args) {
        //正三角形
        //外层 控制行
        for (int i = 0; i < 5 ; i++){
            //内层 控制列
            //关键在内层的j < xx    一般情况下根据自己要输出的*的多少或者空格的多少，来跟外层的i找关联
//            for(int j = 0 ; j < i + 1; j++){
            for(int j = 0 ; j < i + 1; j++){
                System.out.print(" *");
            }
            //换行
            System.out.println();
        }

        //倒三角形
        for (int i = 0; i < 5 ; i++){
            //内层 控制列
            //关键在内层的j > xx    一般情况下根据自己要输出的*的多少或者空格的多少，来跟外层的i找关联
//            for(int j = 5 ; j >= i; j--){
            for(int j = 5 ; j > i; j--){
                System.out.print(" *");
            }
            //换行
            System.out.println();
        }
    }
}
