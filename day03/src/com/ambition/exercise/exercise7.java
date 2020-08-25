package com.ambition.exercise;
/*
* 练习：求出1-5之间数据之和
*
* 分析：
* 1.定义求和变量，初始化值是0
* 2.获取1-5之间的数据，用for循环实现
* 3.把每一次获取到的数据，累加起来就可以了
* 4.输出求和变量即可
*/
public class exercise7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 6; i++){
            sum += i;
        }
        System.out.println("1-5之间数据之和= " + sum);
    }
}
