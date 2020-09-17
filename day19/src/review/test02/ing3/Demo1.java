package review.test02.ing3;

/**
 * @Author: ambitions
 * @Date: 2020/09/17/13:45
 * @Description:
 *
 *  判断101- 200 之间共有多少个素数 并输出素数
 */
public class Demo1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i < 201; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.print(i + "\t");
                count++;
            }
        }
        System.out.println("\n总共有：" + count + "个");
    }
}
