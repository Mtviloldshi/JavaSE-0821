package com.ambition.digui;
//求n！的阶乘
public class Demo3 {
    public static void main(String[] args) {
        System.out.println(jieCheng(10));
    }

    public static int jieCheng(int n){
        if (n == 1){
            return n;
        }else {
            return n * jieCheng(n - 1);
        }
    }
}
