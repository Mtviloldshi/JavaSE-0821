package com.ambition.demo2;

/**
 * @Author: ambitions
 * @Date: 2020/09/19/11:07
 * @Description:
 *      获取Class对象的四种方式
 */
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.java中任意类型的字节码对象，都可以使用这种方式获取
        Class clazz = User.class;
        Class clazz2 = int.class;
        Class clazz3 = String.class;
        Class clazz4 = Override.class;

        //2.通过对象调用方法getClass()方法
        User user = new User();
        Class clazz5  = user.getClass();

        //3.使用Class类的静态方法forName("包名")
        Class clazz6 = Class.forName("com.ambition.demo2.User");

        //4.通过类加载器
        Class clazz7 = ClassLoader.getSystemClassLoader().loadClass("com.ambition.demo2.User");

        //每个类加载到内存中，只有一个字节码文件
        System.out.println(clazz == clazz5);
        System.out.println(clazz == clazz6);
        System.out.println(clazz == clazz7);
    }
}

class User{

}
