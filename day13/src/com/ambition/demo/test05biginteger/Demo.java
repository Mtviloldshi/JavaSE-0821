package com.ambition.demo.test05biginteger;

/**
 * @Author: ambitions
 * @Date: 2020/09/08/16:29
 * @Description:
 *
 * BigInteger : 精确表示超大整数
 *
 *
 *  多态创建对象，对象无法直接访问子类非重写父类方法。
 *  子类不是必须重写父类方法
 */
public class Demo {
    String i = "123";
    public static void main(String[] args) {
        A a = new B();
//        a.methodB(); 无法直接访问子类特有方法
    }

}

class A{
    public void method(){
        System.out.println(1);
    }
}
class B extends A{
    public void methodB(){
        System.out.println(1);
    }
}
