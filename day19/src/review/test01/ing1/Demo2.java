package review.test01.ing1;

/**
 * @Author: ambitions
 * @Date: 2020/09/16/11:38
 * @Description:
 *
 * {5,7,3,9,2}从小到大排序  冒泡排序
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {5,7,3,9,2};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("排序后:[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
