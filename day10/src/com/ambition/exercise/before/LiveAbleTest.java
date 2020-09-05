package com.ambition.exercise.before;
/*
    4、在测试类中，分别创建两个实现类的对象，调用对应的方法。通过接口名，调用静态方法
    定义接口：
 */
public class LiveAbleTest {
    public static void main(String[] args) {
        LiveAble liveAble = new Animal();//多态
        Animal animal = new Animal();
        Plant plant = new Plant();
        animal.eat();
        animal.breathe();
        animal.sleep();
        plant.eat();
        plant.breathe();
        plant.sleep();
        LiveAble.drink();
    }
}
