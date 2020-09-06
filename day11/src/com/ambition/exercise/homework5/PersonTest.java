package com.ambition.exercise.homework5;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Man();
        Person p2 = new Woman();
        meeting(p1);
        if (p1 instanceof  Man){
            Man man = (Man) p1;
            man.smoke();
        }
        meeting(p2);
        if (p2 instanceof  Woman){
            Woman woman = (Woman) p2;
            ((Woman) p2).makeup();
        }
    }
    public static void meeting(Person ps){
        ps.eat();
        ps.toilet();
    }
}

class Person{
    public void eat(){
        System.out.println("吃饭");
    }
    public void toilet(){
        System.out.println("上洗手间");
    }
}

class Man extends Person{
    @Override
    public void eat(){
        System.out.println("吃饭");
    }
    @Override
    public void toilet(){
        System.out.println("上洗手间");
    }

    public void smoke(){
        System.out.println("抽烟");
    }

}
class Woman extends Person{
    @Override
    public void eat(){
        System.out.println("吃饭");
    }
    @Override
    public void toilet(){
        System.out.println("上洗手间");
    }

    public void makeup(){
        System.out.println("化妆");
    }
}
