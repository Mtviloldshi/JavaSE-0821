package review.test01.ing1;

import org.junit.Test;

import java.util.Scanner;

/**
 * @Author: ambitions
 * @Date: 2020/09/16/12:12
 * @Description:
 */
public class Demo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scan.nextInt();
        int day = 0;
        int month = 0;
        int days = 0;//初始化总日期
        if (year > 0) {
            System.out.println("请输入月份：");
            month = scan.nextInt();
            if (month > 0 && month < 13) {
                System.out.println("请输入日期：");
                day = scan.nextInt();
                if (day > 0 && day < 32) {
                    for (int i = 2; i < month + 1; i++) {
                        if (i == 3) {
                            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                                days += 29;
                            } else {
                                days += 28;
                            }
                        } else if (i == 5 || i == 7 || i == 10 || i == 12) {
                            days += 30;
                        } else {
                            days += 31;
                        }
                    }
                } else {
                    System.out.println("非法日期");
                    return;
                }
            } else {
                System.out.println("非法月份");
                return;
            }
        } else {
            System.out.println("非法年份");
            return;
        }

        days += day;

        System.out.println(year + "年" + month + "月" + day + "日\t是今年的第" + days + "天");
    }
}
