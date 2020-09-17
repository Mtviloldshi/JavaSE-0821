package review.test01.ing2;

/**
 * @Author: ambitions
 * @Date: 2020/09/16/12:53
 * @Description:
 *
 *  通项公式如下： f(n)=n + (n-1) + (n-2) + .... + 1，
 *  n 大于5 小于10000
 */
public class Demo2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 9999; i > 4; i--){
            sum += i;
        }

        System.out.println(sum);
    }
}
