package com.ambition.exercise.polymorphic;


class Person{
    public void toilet(){
        System.out.println("fuck toilet。。。");
    }
}

class Woman extends Person{
    @Override
    public void toilet() {
        System.out.println("dun fuck toilet。。。");
    }
}

class Man extends Person{
    @Override
    public void toilet() {
        System.out.println("zhan fuck toilet。。。");
    }
}

public class Demo {
    public static void main(String[] args) {
        goToToilet(new Woman());
        goToToilet(new Man());
    }

    public static void  goToToilet(Person person){
        person.toilet();
    }
}
