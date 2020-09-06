package com.ambition.interfaces;

/**
 * @author 86176
 *
 *      接口
 *          接口引用指向对象实例
 *          是一种规范
 */
public class Demo {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        Animal animal1 = new Cat();
        animal1.eat();

        Danceable danceable = new Dog();
        danceable.dance();
    }
}

abstract class Animal {
    /**
     * 抽象方法 没有方法体
     */
    public abstract void eat();
}

class Cat extends Animal implements Danceable{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void dance() {
        System.out.println("猫跳舞");
    }
}

class Dog extends Animal implements Danceable{
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    @Override
    public void dance() {
        System.out.println("狗跳舞");
    }
}

interface Danceable{
    /**
     *
     */
    void dance();
}
