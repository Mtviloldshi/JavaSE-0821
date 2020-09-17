package review.test02.ing3;

/**
 * @Author: ambitions
 * @Date: 2020/09/17/14:33
 * @Description:
 *  用递归的方法完成
 *      n + (n-1) + (n-2)....
 */
public class Demo3 {
    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        System.out.println(demo3.diGui(100));
    }

    public int diGui(int n){
        if (n == 1){
            return 1;
        }else
            return n + diGui(n - 1);
    }
}
