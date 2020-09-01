package com.ambition.constructor;
/*
    属性赋值顺序：
        1.默认赋值 String name
        2.显示赋值 String name = "tom";
        3.构造器赋值 new xx("jack");
        4.通过对象.属性名或对象.方法赋值 xx.name = "rose"; xx.setName();
 */
public class DemoTeacher {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        System.out.println(t1.toString());
    }
}
