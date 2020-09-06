package com.ambition.singleton;

/**
 * @author 86176
 *  单例模式
 *      懒汉式 在第一次调用方法时创建对象、有安全隐患，
 */
public class Demo2 {
}
class Student2{
    /**
     * 1.初始化一个静态对象
     */
    private static  Student2 student = null;

    /**
     * 2.私有化构造器
     */
    private Student2() {
    }

    /**
     *
     * @return 返回对象
     */
    public static Student2 getInsantance(){
        //如果对象为空
        if (student == null){
            //创建对象
            student = new Student2();
        }
        return student;
    }
}
