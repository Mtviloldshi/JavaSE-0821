package com.ambition.exercise.after;
/*
   4、声明乌龟类，实现Runner接口和Swimming接口
 */
public class Tortoise implements Swimming,Runner{
    @Override
    public void swim() {
        System.out.println("乌龟会游泳。。。");
    }

    @Override
    public void run() {
        System.out.println("乌龟跑得慢。。。");
    }
}
