package review.test01.ing2;

import java.util.Scanner;

/**
 * @Author: ambitions
 * @Date: 2020/09/16/13:26
 * @Description:
 */
public class Demo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        show(num);
    }
    public static void show(int n){
        for (int i = 0; i <= n; i++) {
            //打印空格
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            //打印*
            for (int k = 0; k < i; k++) {
                System.out.print(" *");
            }
            //打印换行
            System.out.println();
        }
    }
}
