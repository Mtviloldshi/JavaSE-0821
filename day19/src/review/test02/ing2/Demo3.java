package review.test02.ing2;

import java.util.Arrays;

/**
 * @Author: ambitions
 * @Date: 2020/09/17/12:55
 * @Description:
 *
 *      使用二分法查找指定数据
 *          二分法查找：有序数组
 *              从中间开始查找，查找的数大于中间值，左边边数据作废，查找的数小于中间值，右边作废，依次循环
 */
public class Demo3 {
    public static void main(String[] args) {
        int[] arr = {1,5,7,3,5,9,3,4,6,7,2};
        getNumber(arr,2);
    }
    public static void getNumber(int[] arr,int number){
        //排序数组
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length;
        int mid = 0;
        for (;;){
            mid = (left + right)/2;
            if (number == arr[mid]){
                System.out.println("数据：" + arr[mid]);
                break;
            }else if (number > arr[mid]){
                left = mid;
            }else{
                right = mid;
            }
            if (left == right){
                System.out.println("数组中没有此数！");
                break;
            }
        }
    }
}
