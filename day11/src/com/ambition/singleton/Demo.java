package com.ambition.singleton;
/**
 * @author 86176
 *  单例模式
 *      饿汉式 随着类的加载而加载
 */
public class Demo {
    public static void main(String[] args) {
    }
}
class Student{
    /**
     * 初始化静态对象
     */
    private static  Student student = new Student();

    /**
     * 私有化构造器
     */
    private Student() {
    }

    /**
     * 返回对象
     * @return
     */
    public static Student getInstance(){
        return student;
    }
}
