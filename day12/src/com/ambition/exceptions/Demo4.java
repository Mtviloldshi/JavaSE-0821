package com.ambition.exceptions;

/**
 * @Author: ambitions
 * @Date: 2020/09/07/15:51
 * @Description: finally Or return
 *
 *      1.无论try中是否发生异常，也无论catch是否捕获异常，
 *          也不管try和catch中是否有return语句，都一定会执行
 *      2.当只有在try或者catch中调用退出JVM的相关方法，例如System.exit(0),
 *          此时finally才不会执行,否则finally永远会执行
 */
public class Demo4 {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int  test(){
        int a = 0,b = 0,c = 0;
        try{
            a = 10;
            b = 20;
        }catch (Exception e){
            c = a + b;
            System.out.println("c = " + c);
            return c;
        }
        return c;
    }
}
