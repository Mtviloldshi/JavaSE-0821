package review.test01.ing1;

import java.util.Scanner;

/**
 * @Author: ambitions
 * @Date: 2020/09/16/12:18
 * @Description:
 */
public class Demo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scan.nextInt();
        int day1 = 0;
        int days = 0;//初始化总日期
        System.out.println("请输入月份：");
        int month = scan.nextInt();
        System.out.println("请输入日期：");
        int day = scan.nextInt();
        for (int i = 1; i <= month; i++) {
            if (i == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    day1 = 29;
                } else {
                    day1 = 28;
                }
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                day1 = 30;
            } else {
                day1 = 31;
            }
            if (i < month){
                days += day1;
            }
        }
        days += day;
        System.out.println(year + "年" + month + "月" + day + "日\t是今年的第" + days + "天");
    }
}
