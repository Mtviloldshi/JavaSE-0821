package com.ambition.exercise.homework2;

/**
 * @author 86176
 *  实例初始化方法，属性与多态无关
 *
 * 子类加载构造器过程中 发现父类没有加载 优先加载父类，
 * 调用方法时，子类有重写，优先调用子类重写方法，如果没有，执行父类方法
 */
public class Test02 {
    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f.x);//
    }
}
class Father{
    int x = 10; ///333 x = 10;
    public Father(){
        this.prints();// 444
        x = 20; //0.6 已加载 //8888输出 x = 20
    }
    public void prints(){
        System.out.println("Father.x = " + x);
    }
}
class Son extends Father{
    int x = 30;//1111  默认初始化 x = 0  6666 x = 30
    public Son(){
        super();//22222
        this.prints();// 77777
        x = 40;//加载完毕，
    }
    @Override
    public void prints(){
        System.out.println("Son.x = " + x);//555 子类重写 执行子类方法x = 0 7777 x = 30
    }
}