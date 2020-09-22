package com.ambition.demo.demo2;

/**
 * @Author: ambitions
 * @Date: 2020/09/21/9:55
 * @Description:
 *      函数式接口
 *          只有一个方法需要重写的接口
 */
public class Demo {
    public static void main(String[] args) {
        invokeCalc(10, 5, new Calculator() {
            @Override
            public int clac(int a, int b) {
                return a + b;
            }
        });
        System.out.println("----------------");
        invokeCalc(1,5,(a ,b) -> (a - b));
        invokeCalc(1,5,(a ,b) -> (a * b));
        invokeCalc(1,5,(a ,b) -> (a / b));
    }

    //使用计算器计算数据
    public static void invokeCalc(int a,int b,Calculator calculator){
        System.out.println(calculator.clac(a, b));
    }
}

//自定义函数式接口 计算器
@FunctionalInterface//如果一个接口中只有一个抽象方法
interface Calculator{
    int clac(int a,int b);
}
