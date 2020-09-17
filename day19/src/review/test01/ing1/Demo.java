package review.test01.ing1;

/**
 * @Author: ambitions
 * @Date: 2020/09/16/11:34
 * @Description: 用循环控制语句打印输出： 1+3+5+...+99=?
 */
public class Demo {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 100; i += 2) {
            sum += i;
        }
        System.out.println(sum);

        int j = 1;
        while (j < 100) {
            sum += j;
            j += 2;
        }
        System.out.println(sum);
    }
}
