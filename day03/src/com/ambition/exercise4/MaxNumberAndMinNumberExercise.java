package com.ambition.exercise4;

import java.util.Scanner;

/*
    第7题：最大公约数和最小公倍数
    7、输入两个正整数m和n，求其最大公约数和最小公倍数
    //最大公约数： 两个数能够同时除清同一个数的最大数，这个数就是这两个数的最大公约数，例如 16 和 8能同时除清1 2 4 8 但只有8这个数是最大的，所以最大公约数就为8
    //最小公倍数，能够同时除清这两个数的最小的一个属，这个数就是这两个数的最小公倍数，例如16和8能同时被 16 32 48 除清 但只有16这个数是最小的所以 最小公倍数为16
 */
public class MaxNumberAndMinNumberExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        int max = number1 > number2 ? number1 : number2;
        int min = number1 < number2 ? number1 : number2;
        int maxYue = 0, minBei = 0;

        for (int i = min; i >= 1; i--) {//最大公约数，从最小值开始找起
            if (max % i == 0 && min % i == 0) {
                maxYue = i;
                break;
            }
        }
        System.out.println(maxYue + "是最大公约数");
        //最小公倍数 = m*n / 最大公约数
        //System.out.println(m*n/maxYue +"是" + m + "和" + n + "的最小公倍数");
        //从max 运行效率更高
        for (int i = max; i <= max * min; i++) {
                if (i % max == 0 && i % min == 0){
                    minBei = i;
                    break;
                }
        }
        System.out.println(minBei + "是最小公倍数");
    }
}
