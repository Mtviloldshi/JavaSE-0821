package review.test02.ing4;

/**
 * @Author: ambitions
 * @Date: 2020/09/17/17:44
 * @Description:
 *  一直第一个人10岁 第二个人比第一个人大2岁，以此类推 第八个人多大
 *
 *          递归方法
 */
public class Demo1 {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        System.out.println(demo1.diGui(8));
    }

    public int diGui(int n){
        int sum = 10;
        if (n == 1){
            return sum;
        }else {
             sum = 2 + diGui(n - 1);
        }
        return sum;
    }
}
