package com.ambition.demo.demo1;

/**
 * @Author: ambitions
 * @Date: 2020/09/21/9:25
 * @Description:
 *
 * lambda表达式：
 *      本质上是一个匿名内部类对象
 * 社么时候使用lambda表达式：
 *      是（只有一个抽象方法需要重写的）接口的语法糖
 *      这个接口就叫函数式接口（Single Abstract Method）
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("ss");
            }
        }).start();

        //lambda表达式
        new Thread(() -> System.out.println("ss")).start();
    }
}
