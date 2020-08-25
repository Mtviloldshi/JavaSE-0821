package com.ambition.demo;

import java.util.Scanner;
//nextLine()
public class Demo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个字符：");
//        String str = scan.next();//接收字符串，如果遇到空白字符，就会结束。
        //接收一行字符串，遇到回车结束
        String str = scan.nextLine();
        System.out.println(str);
    }
}
