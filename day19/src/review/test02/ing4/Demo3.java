package review.test02.ing4;

/**
 * @Author: ambitions
 * @Date: 2020/09/17/18:02
 * @Description: 斐波那契数列
 *                  前两数之和等于后一位数
 */
public class Demo3 {
    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        System.out.println(demo3.diGui(4));
    }

    public int diGui(int n) {
        if (n >= 2) {
            return diGui(n - 1) + diGui(n - 2);
        }else
        return 1;

    }
}
