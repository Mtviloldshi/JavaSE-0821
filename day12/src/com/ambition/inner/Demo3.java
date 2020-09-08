package com.ambition.inner;

/**
 * @author am
 * 匿名内部类: 不起名字的类
     * 定义：
     * new 类名或者接口名{
     * 重写的方法
     * }
     * 使用场景：
     * 如果接口的子类只使用一次的话，不用再去实现接口，可以使用匿名内部类
 */
public class Demo3 {
    public static void main(String[] args) {
        //创建一个匿名内部类的对象
        new InterA() {
            @Override
            public void show() {
                System.out.println("a");
            }
        }.show();

        InterA a = new InterA() {
            @Override
            public void show() {
                System.out.println("a");
            }
        };
        a.show();
    }
}

interface InterA {
    void show();
}

class ClassA {
    int a = 10;

    public void test() {
        System.out.println("test");
    }
}
