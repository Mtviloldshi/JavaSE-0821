package com.ambition.exercise.before;
/*
    1、声明一个LiveAble接口
    包含两个抽象方法：
    void eat();
    void breathe();
    包含默认方法 default void sleep()，实现为打印“静止不动”
    包含静态方法 static void drink()，实现为“喝水”

 */
public interface LiveAble {
    void eat();
    void breathe();
    default void sleep(){
        System.out.println("静止不动。。。");
    }
    static void drink(){
        System.out.println("喝水。。。");
    }

}
