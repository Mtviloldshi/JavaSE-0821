package review.test02.ing3;

/**
 * @Author: ambitions
 * @Date: 2020/09/17/14:39
 * @Description:
 * 用递归 求20 - 1 的阶乘和
 */
public class Demo {
    public static void main(String[] args) {
        long sums = 0;
        for (int i = 1; i < 21; i++) {
            long sum1 = 1;
            for (int j = 1; j <= i; j++) {
                sum1 *=  j;
            }
            sums += sum1;
        }

        System.out.println(sums);


        Demo demo = new Demo();
        long sum = 0;
        for (int i = 1; i < 21; i++) {
            sum += demo.diGui(i);
        }
        System.out.println(sum);
    }

    public long diGui(int n){
        if (n == 1){
            return 1;
        }else
        return n * diGui(n - 1);
    }

}
