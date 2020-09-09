package com.ambition.demo.test01string;

/**
 * @Author: ambitions
 * @Date: 2020/09/08/9:36
 * @Description: 字符串String
 *
 *      String 是个类，引用数据类型，"ABC"表示一个字符串字母量，可以看作String的实例
 *      特点：
 *          1.字符串不可变，一旦创建，长度和内容都不可变
 *              private final char value[];//私有属性不能直接操作，final修饰数组长度不可变，
 *              String中没有对外提供方法可以操作数组，所以字符串不可变。
 *          2.String类由final修饰，表示不可被继承，也谈不上方法重写，所以类的方法都无法改造
 *          3.字符串常量存在字符串常量池中，内存中只有一份
 */
public class Demo {
    String string = null;
}
