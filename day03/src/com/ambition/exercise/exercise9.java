package com.ambition.exercise;
/*
* 练习：趣味折纸
*
* 题目：
* 世界最高山峰是珠穆朗玛峰，它的高度是8844.43米，假如我有一张足够大的纸，它的厚度
是0.1毫米。
* 请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
*/
public class exercise9 {
    public static void main(String[] args) {
        double  zhi = 0.1; //定义纸的初始高度
        double zmlm = 8844430;//定义珠穆朗玛峰的初始高度
        int count = 0; //定义折纸初始次数
        while (zhi < zmlm){
            zhi *= 2; //指数幂增加
            count++; //次数增加
        }
        System.out.println("折" + count + "次可以折成珠穆朗玛峰的高度");
    }
}
