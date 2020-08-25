package com.ambition.exercise2;

/*
    ## 第一题
    * 语法点：运算符，while，if
 */
public class WhileIfTest1 {
    public static void main(String[] args) {
        int i = 0;
        int i2 = 10;
        while (i < 5) {
            if (i >= 2 && i2 < 15) {
                System.out.println("i:" + i + ",i2:" + i2);
            }
            i2++;
            i++;
        }
        System.out.println("------------------------------");
        while (i2 < 20){
            i++;
            i2++;
            if (i > 8 || i2 <= 18){
                System.out.println("i:" + i + ",i2:" + i2);
            }
        }
    }
}
