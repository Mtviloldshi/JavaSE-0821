package com.ambition.exercise;

/*
    二分法查找数据
        二分法必须是在数据是有循序的时候使用
 */
public class FlexagonSelectData {
    public static void main(String[] args) {
        //初始化数组
        int[] arr = {10, 2, 5, 70, 8, 91, 15, 18, 19, 56};
        //定义要查找的数
        int number = 19;
        //初始化角标
        int index = -1;
        //排序数组
        for (int i = 0; i < arr.length - 1; i++) {
            //对比次数随着比较轮数的增加而减少
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //使用二分法查找
        int left = 0;//定义左边界
        int right = arr.length - 1;//定义右边界
        int mid ;//定义中间值= (left + right) / 2;
        //如果左边界小于等于右边界
        while (left <= right) {
            //优化
            mid = (left + right) / 2;
            //如果找到了，把mid赋值给index角标
            if (arr[mid] == number) {
                index = mid;
                break;
            } else if (number > arr[mid]) {//如果这个数大于中间数mid
                left = mid + 1;//就将左边界移动到中间+1的位置
            } else if (number < arr[mid]) {//如果这个数小于中间数mid
                right = mid - 1;//就将右边界移动到中间-1的位置
            }
            //如果没找到，初始化mid的值
//            mid = (left + right) / 2;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        if (index != -1){
            System.out.println(index + "");
        }else {
            System.out.println("未找到" + number);
        }
    }
}
