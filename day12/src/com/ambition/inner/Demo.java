package com.ambition.inner;

/**
 * @author 86176
 *
 *  内部类：定义在类内部的类
 *      静态内部类：有static修饰 定义在类的成员位置
 *          可以使用四种权限修饰符
 *          可以声明属性，方法等
 *          不能直接访问外部类非静态属性和方法
 *          Outer.Inner inner = new Outer.Innre();
 *
 *      非静态内部类：没有static修饰 真正意义上的内部类
 *          可以直接访问外部类的内部成员（包括私有的）
 *          不能定义静态成员
 *          可以定义静态常量
 *         Outer.Inner inner =  new Outer().new Inner();
 */
public class Demo {
}
