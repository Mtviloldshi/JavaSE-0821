package com.ambition.exercise2;

import java.time.Year;
import java.util.Scanner;

/*
## 第一题
语法点：变量，运算符，switch...case

    案例需求：编写一个程序，为一个给定的年份找出其对应的中国生肖。中国的生肖基于12年一个周期，每年用一个动物代表：
    rat（鼠）、ox（牛）、tiger（虎）、rabbit（兔）、dragon（龙）、snake（蛇）、
    horse（马）、sheep（羊）、monkey（候）、rooster（鸡）、dog（狗）、pig（猪）。
 */
public class SwitchTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scan.nextInt();
        if (year > 0){
            switch (year%12){
                case 1:
                    System.out.println(year + "年是鸡年");
                    break;
                case 2:
                    System.out.println(year + "年是狗年");
                    break;
                case 3:
                    System.out.println(year + "年是猪年");
                    break;
                case 4:
                    System.out.println(year + "年是鼠年");
                    break;
                case 5:
                    System.out.println(year + "年是牛年");
                    break;
                case 6:
                    System.out.println(year + "年是虎年");
                    break;
                case 7:
                    System.out.println(year + "年是兔年");
                    break;
                case 8:
                    System.out.println(year + "年是龙年");
                    break;
                case 9:
                    System.out.println(year + "年是蛇年");
                    break;
                case 10:
                    System.out.println(year + "年是马年");
                    break;
                case 11:
                    System.out.println(year + "年是羊年");
                    break;
                case 0:
                    System.out.println(year + "年是猴年");
                    break;
            }

        }else{
            System.out.println("输入有误！");
        }
    }
}
