package review.test01.ing1;
import java.util.Scanner;

/**
 * @Author: ambitions
 * @Date: 2020/09/16/12:28
 * @Description:
 */
public class Demo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scan.nextInt();
        System.out.println("请输入月份：");
        int month = scan.nextInt();
        System.out.println("请输入日期：");
        int day = scan.nextInt();
        int day1 = 0;
        int days = 0;//初始化总日期
        for (int i = 1; i < month; i++) {
            if (i == 2){
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                    days += 29;
                }else {
                    days += 28;
                }
            }else if (i == 4 || i == 6 || i == 9 || i == 11){
                days += 30;
            }else {
                days += 31;
            }
        }
        days += day;
        System.out.println(year + "年" + month + "月" + day + "日\t是今年的第" + days + "天");
    }
}
