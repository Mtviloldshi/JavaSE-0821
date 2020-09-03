package com.ambition.override.extend;
//方法重写：子类中定义与父类中相同的方法：方法名相同 参数列表不同 返回值相同(子类的返回值类型可以是父类返回值类型的子类)，访问权限不能比父类的小
//  一般方法体不同，用于改造并覆盖父类的方法。
public class Dog extends Animal {
//    String name;
//    int age;

    @Override//校验是否是重写
    public void eat(){
        System.out.println("狗吃肉");
    }

    public void lookDoor(){
        System.out.println("看门");
    }
}
