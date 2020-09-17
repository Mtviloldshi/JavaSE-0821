package review.test02.ing1;

/**
 * @Author: ambitions
 * @Date: 2020/09/17/9:49
 * @Description:
 * 找出数组中的一个值 使其左侧的值加起来等于右侧的值  返回角标 加这个值内容
 * 例如int[] arr = {1,2,5,3,2,4,2};  第四个数 3 左右两边相加相等
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,2,4,2};
//        int[] arr = {1, 2, 3, 4, 2, 4, 6};
        int count = 0;
        int mid = arr.length / 2;//定义中间值，求左右两边和
        for (; ; ) {
            int leftSum = 0;//初始化左边和
            int rightSum = 0;//初始化右边和
            for (int i = 0; i < mid -1 ; i++) {//左边的数 从角标零相加到角标mid
                leftSum += arr[i];
            }
            for (int i = mid; i < arr.length; i++) {//右边的数 从角标mid相加到数组长度-1
                rightSum += arr[i];
            }

            if (leftSum == rightSum) {//判断左右两边的值是否相等
                System.out.println("结果为第" + mid + "个值");
                System.out.println("值为" + arr[mid - 1]);
                break;//相等的话跳出循环
            } else if (leftSum > rightSum) {//如果左边的数大于右边的数
                mid--;//中间值往左边靠
            } else {
                mid++;//如果左边的值小于右边的值，中间值往右靠
            }
            count++;//记录循环次数
            if (count == arr.length / 2 + 1) {//如果循环次数等于数组长度/2 + 1 说明不存在这个数 跳出循环
                System.out.println("未找到");
                break;
            }
        }
    }
}
