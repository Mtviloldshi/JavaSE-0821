package com.ambition.abstracts;
/**
    abstract 关键字 抽象的
        有抽象方法的类，一定是抽象类 abstract 修饰
        不能创建对象
        有构造方法，用于子类构造方法调用
        抽象类中可以有普通方法，不一定有抽象方法
        抽象类的子类必须重写（实现）抽象方法，除非子类也是抽象类
 * @author ambition
 */
public class Demo {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        Animal animal1 = new Cat();
        animal1.eat();
    }
}

abstract class Animal{
    /**
     * 抽象方法 没有方法体
     */
    public abstract void eat();
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }
}