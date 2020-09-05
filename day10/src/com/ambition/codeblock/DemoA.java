package com.ambition.codeblock;
/*
   1.实例变量：每次new 对象都会执行一次
       默认赋值
     （显示赋值 代码块赋值）： 按照代码的先后顺序执行
       构造器

   2.类变量(静态变量)：随着类的加载而加载 只加载一次
        默认赋值
        （显示赋值
        代码块） 代码书写先后顺序
 */
public class DemoA {
}

class B {
    static  int x = 10;

    //静态代码块，类加载过程中执行，只执行一次
    static {
        x = 20;
    }
}

class A {
    int aa = 10;

    public A() {
    }

    public A(int aa) {
        this.aa = aa;
    }

    //构造代码块
    {
        aa = 20;
    }
}
