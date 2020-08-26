package com.ambition.demo;

public class Test {
    public static void main(String[] args) {
        //打印正三角形
        for (int i = 1; i < 6; i++) {
            /*
                for循环里面只做三件事
                1.打印j个*号
                2.打印k个空格
                3.换行
             */
            //打印空格
            for (int k = 1; k <= 6 - i; k++) {
                /*
                    当i = 1的时候  k<=5 打印4个空格
                    当i = 2时 k <= 4 打印3个空格
                    ....
                    当i = 5时 k<=1 打印0个空格
                 */
                System.out.print(" ");
            }
            //打印*号
            for (int j = 1; j < i + 1; j++) {
                /*
                    当i = 1时 j<=2 打印1个*号
                    当i = 2时 j<=3 打印两个*号
                    。。。
                    当i = 5时 j<=6 打印5个*号
                 */
                System.out.print(" *");
            }
            System.out.println();
        }
        //打印倒三角形
        for (int i = 0; i < 4; i++) {
            //打印空格
            for (int k = 0; k < i ; k++) {
                System.out.print(" ");
            }
            //打印*号
            for (int j = 0; j <= 4  - i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
