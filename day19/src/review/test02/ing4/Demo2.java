package review.test02.ing4;

/**
 * @Author: ambitions
 * @Date: 2020/09/17/17:53
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        System.out.println(demo2.diGui(20));
    }

    public int diGui(int n){
        if (n <= 2){
            return n;
        }else
            return diGui(n - 1) + diGui(n - 2);
    }
}
