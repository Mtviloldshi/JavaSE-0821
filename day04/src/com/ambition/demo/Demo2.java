package com.ambition.demo;

/*
    for循环嵌套 输出直角三角形 正倒三角
 */
public class Demo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5;j > i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
