package com.ambition.exercise;
/*
    二分法查找数据
        使用二分法前提：必须是已经排序好的数组

 */
public class FlexagonSelectExercise2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,11,14,16,89};
        //定义要查找的数据
        int number = 89;
        //初始化查找角标
        int index = -1;

        int left = 0;
        int right = arr.length - 1;
        int mid;

        while (left <= right){
            mid = (left + right)/2;
            if (number == arr[mid]){
                index = mid;
                break;
            }else if (number > arr[mid]){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }

        if (index == -1){
            System.out.println("未找到" + number);
        }else {
            System.out.println("已找到" + number + "\t角标为:" + index);
        }
    }
}
