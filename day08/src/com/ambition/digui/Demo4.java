package com.ambition.digui;

//斐波那契数列
public class Demo4 {
    public static void main(String[] args) {
        System.out.println(getNum(2));
    }

    public static int getNum(int n) {
        if (n <= 1) {
            return 1;
        } else {
            //get(3) get(1) return 1
            return getNum(n - 2) + getNum(n - 1);//yi 3 + 4 = 7 er 1 + 2 =3
        }
        // 1 2 3 4 5// 5 4 3 2 1
        //
    }
}
