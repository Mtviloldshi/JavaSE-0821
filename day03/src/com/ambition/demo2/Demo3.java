package com.ambition.demo2;
/*
    for 循环
        执行顺序：①-④
        for(初始化语句①;循环条件语句②;迭代语句④){
            循环体语句③
        }

        //死循环
        for(;;){
        }
 */
public class Demo3 {
    public static void main(String[] args) {
        //输出十遍hello
        for (int i = 0;i < 10; i++){
            System.out.println("hello");
        }
    }
}
