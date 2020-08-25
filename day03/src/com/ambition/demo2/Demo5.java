package com.ambition.demo2;
/*
    while循环
        初始化数据①
        while(条件表达式②){
            执行语句③
            迭代语句④
        }
 */
public class Demo5 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10){
            System.out.println("hello world!");
            i++;
        }
        //1-100偶数和
        int j = 0;
        int sum = 0;
        while (j < 101){
            sum += j;
            j += 2;
        }
        System.out.println(sum);
    }
}
