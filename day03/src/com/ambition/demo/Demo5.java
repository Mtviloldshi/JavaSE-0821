package com.ambition.demo;

import java.util.Scanner;

//接收其他类型数据
public class Demo5 {
    public static void main(String[] args) {
        //创建扫描器
        Scanner scan = new Scanner(System.in);
        //提示信息
        System.out.println("输入整数：");
        //接收
        int a = scan.nextInt();//输入字母后，java.util.In// putMismatchException
        //接收字符串
        String str = scan.next();
        //接收byte
        byte by = scan.nextByte();
        //接收short
        short st = scan.nextShort();
        //接收long
        long lo = scan.nextLong();
        //接收float
        float fl = scan.nextFloat();
        //double
        double d = scan.nextDouble();
        //boolean
        boolean boo = scan.nextBoolean();
        //字符串转字符
        char c = str.charAt(0);

    }
}
