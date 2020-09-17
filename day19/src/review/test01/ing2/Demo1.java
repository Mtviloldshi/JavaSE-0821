package review.test01.ing2;

/**
 * @Author: ambitions
 * @Date: 2020/09/16/12:58
 * @Description:
 *
 *  求 1+2！+3！+...+20！
 *  2561327494111820313
 */
public class Demo1 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i < 21; i++) {
            long count= 1;//每次计算完初始化count的值
            for (int j = 1; j <= i; j++) {
                count = count * j ;
            }
            sum += count;
        }
        System.out.println(sum);
    }
}
