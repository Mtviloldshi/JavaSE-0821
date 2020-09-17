package review.test02.ing3;

/**
 * @Author: ambitions
 * @Date: 2020/09/17/13:55
 * @Description:
 *
 *  一个球从100米高空落下，每次返回高度的一半，请问在第十次落地时，总共经过了几米，第十次反弹多高
 *
 */
public class Demo2 {
    public static void main(String[] args) {
        double initTotal = 100;
        double sumMi = 100;
        for (int i = 0; i < 9; i++) {
            initTotal = initTotal/2;//每次反弹高度
            sumMi = sumMi + initTotal * 2;
            if (i == 8){
                sumMi = sumMi * 2;
                System.out.println("第十次弹起高度为：" + initTotal /4);
                System.out.println("总共经过了几米" + sumMi);
            }
        }
    }
}
