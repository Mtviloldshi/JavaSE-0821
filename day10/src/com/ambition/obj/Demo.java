package com.ambition.obj;
/*
    根父类Object 方法

    hashCode() 返回一个对象的哈希代码值。
    public final 类<?> getClass() 返回该 Object运行时类
    finalize()  当垃圾收集确定没有对对象的引用时，由对象上的垃圾收集器调用。
    equals(Object obj) 指示是否有其他对象“等于”这一个。
    toString() 返回对象的字符串表示形式。
 */
public class Demo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.hashCode());
        System.out.println(new Object().getClass());
    }
}

class Student{

}
