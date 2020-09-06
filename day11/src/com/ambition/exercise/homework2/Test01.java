package com.ambition.exercise.homework2;

/**
 * @author 86176
 *
 * 测试类
 *
 *
 * 属性与多态无关
 *      成员变量 运行编译都看左边
 */

public class Test01 {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.num);//1
        System.out.println(((B)a).num);//2
        System.out.println(((A)((B)a)).num);//1
        System.out.println("-------------------");
        B b = new B();
        System.out.println(b.num);//2
        System.out.println(((A)b).num);//1
        System.out.println(((B)((A)b)).num);//2
    }
}
class A{
    int num = 1;
}
class B extends A{
    int num = 2;
}
