package com.ambition.exercise2;
/*
    ## 第二题
    * 语法点：方法，运算符，for，while
 */
public class ForWhileTest {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 5){
            for (int b = 1; b <= 5; b++){
                System.out.print(b + " ");
            }
            System.out.println();
            a++;
        }
    }
}
