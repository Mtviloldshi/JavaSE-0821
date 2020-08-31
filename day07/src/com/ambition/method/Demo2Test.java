package com.ambition.method;

public class Demo2Test {
    public static void main(String[] args) {
        Demo2Method de = new Demo2Method();
        de.testInstanceMethod();//调用实例方法，必须使用对象
        //Demo2Test.testInstanceMethod();//不可调用

        de.testStaticMethod();//可以调用，不推荐
        Demo2Method.testStaticMethod();//推荐使用这种，类名调用方法
    }
}
