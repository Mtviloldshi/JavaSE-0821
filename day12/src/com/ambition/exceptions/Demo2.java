package com.ambition.exceptions;

import org.junit.Test;

/**
 * @Author: ambitions
 * @Date: 2020/09/07/15:17
 * @Description: 异常的处理机制
 *
 *      方式一：
 *          try{
 *              可能发生异常的代码
 *          }catch(要捕获的异常对象  异常类型 对象名){
 *              针对异常的处理
 *          }
 */
public class Demo2 {

    @Test
    public void getNum(){
        try {
            int a = 1/0;
        }catch (Exception e){
            System.out.println("发生了算术异常");
            e.printStackTrace();//打印异常的堆栈信息
        }finally {

        }
        System.out.println(11);
    }
}
