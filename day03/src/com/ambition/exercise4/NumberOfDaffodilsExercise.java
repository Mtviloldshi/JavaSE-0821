package com.ambition.exercise4;

/*
    第5题：水仙花数
    5、输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
    例如： 153 = 1*1*1 + 5*5*5 + 3*3*3
    打印所有水仙花数的个数？
 */
public class NumberOfDaffodilsExercise {
    public static void main(String[] args) {
        int ge, shi, bai,count = 0;

        for (int i = 100; i < 1000; i++) {
            bai = i / 100; //i / 100 % 10
            shi = (i - bai * 100) / 10; // i / 10 % 10
            ge = i % 10;//i / 1 % 10
            if ((bai * bai * bai + shi * shi * shi + ge * ge * ge) == i) {
                System.out.print("水仙花数：" + i + "\t");
                count++;
            }
        }
        System.out.println(count);
    }
}
