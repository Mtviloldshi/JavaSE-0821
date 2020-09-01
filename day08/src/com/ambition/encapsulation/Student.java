package com.ambition.encapsulation;
/*
    权限修饰符
 */
public class Student {
    String name;//缺省权限修饰符
    private int age;//只能在本类中访问

    public String show(){
        return "姓名：" + name + "\t年龄：" + age;
    }

    public void setAge(int ages){
        if (ages < 0 ){
            System.out.println("不合法");
        }else {
            age = ages;
        }
    }
}
