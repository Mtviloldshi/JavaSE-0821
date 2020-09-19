package com.ambition.demo;

/**
 * @Author: ambitions
 * @Date: 2020/09/19/9:55
 * @Description:
 *
 * 类的加载过程：
 *      加载-连接（验证-准备-解析）- 初始化
 *
 *      类的加载并不一定在使用类时才加载，jvm根据判断如果可能会使用某个类，那么它就会预先加载
 *      初始化阶段通常是主动使用类时才会进行初始化
 */
public class Demo {
    static int a = 10;//在准备截断赋值为0，在初始化截断赋值为10
    static final int b = 20;//准备阶段赋值为20

    static {//初始化阶段执行
        a = 30;
    }

    public static void main(String[] args) {

    }
}
