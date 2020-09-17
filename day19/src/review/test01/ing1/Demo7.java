package review.test01.ing1;

import java.util.Scanner;

/**
 * @Author: ambitions
 * @Date: 2020/09/16/12:40
 * @Description:
 */
public class Demo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scan.nextInt();
        System.out.println("请输入月份：");
        int month = scan.nextInt();
        System.out.println("请输入日期：");
        int day = scan.nextInt();
        int days = geyDays(year, month, day);
        System.out.println(year + "年" + month + "月" + day + "日\t是今年的第" + days + "天");
    }

    public static int geyDays(int year, int month, int day) {
        int[] dayOfMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;
        for (int i = 0; i < month - 1; i++) {
            if (i == 1) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    sum += dayOfMonths[i] + 1;
                } else {
                    sum += dayOfMonths[i];
                }
            } else if (i == 3 || i == 5 || i == 8 || i == 10) {
                sum += dayOfMonths[i];
            }else {
                sum += dayOfMonths[i];
            }
        }
        return sum + day;
    }
}
