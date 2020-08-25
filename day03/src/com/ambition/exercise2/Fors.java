package com.ambition.exercise2;

/*
    打印倒三角形，效果如图所示：
 */
public class Fors {
    public static void main(String[] args) {
        //打印等腰三角形
        for (int i = 1; i < 6; i++) {
            //打印空格
            for (int k = 1; k <= 6 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++){
                System.out.print(" *");
            }
                System.out.println();
        }
        for (int i = 1; i < 6; i++) {//控制列
            //每行有三件事
            /*
                k个空格
                j个*号
                换行
             */
            for (int k = 1; k < i; k++) {
                /*
                    当空格依次增加 1 2 3 4
                    使得k < i
                    当i = 1时 k=i=1 打印0个空格
                    当i = 2时 k<1 1 < 2 打印1个空格
                    当i = 3时 1<3 打印2个空格
                    当i = 4时 1<4 打印3个空格
                    当i = 5时 1<5 打印4个空格

                 */
                System.out.print(" ");
            }
            for (int j = 1; j <= 6 - i; j++) {
                /*
                    打印*
                    *依次减少 5 4 3 2 1
                    使得 j <= 6-i
                    当i = 1时 j<=5 打印5个*
                    当i = 2时 j<=4 打印4个*
                    当i = 3时 j<=3 打印3个*
                    当i = 4时 j<=2 打印2个*
                    当i = 5时 j<=1 打印1个*
                 */
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
