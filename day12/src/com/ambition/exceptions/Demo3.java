package com.ambition.exceptions;

import org.junit.Test;

import java.util.Scanner;

/**
 * @Author: ambitions
 * @Date: 2020/09/07/15:36
 * @Description: finally 关键字
 *
 *
 *      finally: 无论中间有没有异常 都会执行的代码块
 *                  通常用于释放资源
 *
 */
public class Demo3 {

    @Test
    public void login(){
        Scanner scan = new Scanner(System.in);
        System.out.println("输入：");
        String s = scan.next();
        System.out.println(s);
        try {
            int a = 1/0;
        }catch (Exception e){
            System.out.println("发生了算术异常");
            e.printStackTrace();//打印异常的堆栈信息
        }finally {
            scan.close();
        }
//        System.out.println(11);
    }
}
