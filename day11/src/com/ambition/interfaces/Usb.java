package com.ambition.interfaces;

import java.util.Arrays;

/**@author 86176
 *
 *  关键字 ：interface
 *  接口的成员：
 *      静态常量
 *      抽象方法
 *      省略方法/拓展方法：拓展功能，兼容旧版本
 *      静态方法(JDK1.8增加) ： 通常定义工具类中的方法，服务接口的实现类
 *      私有方法(JDK1.9)：提取本类中的拓展方法和静态方法中通用的功能代码块
 */
public interface Usb {
    /**
     * 默认自带 public static final
     */
    int A = 10;

    /**
     * 抽象方法，默认自带，public abstract
     */
    void service();

    /**
     * 默认方法 默认自带public
     */
    default void test(){
        System.out.println("default");
    }

    /**
     * 测试
     */
    static void testStatic(){

    }
}
class  UsbImpl implements Usb{

    @Override
    public void service() {

    }
}

 class Test{
    public Test(){
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        s2.a = 20;
        Test.Inner s3 = new Test.Inner();
        System.out.println(s3.a);
    }
    class Inner{
        public int a = 5;
    }
    public static void main(String[] args) {
        Test t = new Test();
        Inner r = t.new Inner();
        System.out.println(r.a);
    }
}
