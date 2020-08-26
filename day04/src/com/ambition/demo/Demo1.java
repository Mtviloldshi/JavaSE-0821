package com.ambition.demo;

/*
    continue 跳过本次循环，直接进入下次循环
 */
public class Demo1 {
    public static void main(String[] args) {
        //输出1-10的数 除了3倍数
        for (int i = 0; i < 11; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
