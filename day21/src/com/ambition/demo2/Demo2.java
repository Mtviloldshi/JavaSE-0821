package com.ambition.demo2;


import java.lang.reflect.Constructor;

/**
 * @Author: ambitions
 * @Date: 2020/09/19/11:17
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) throws Exception {
        String str = "com.ambition.demo2.Student";
        //获取到字节码文件对象
        Class aClass = Class.forName(str);//降低耦合度 所以使用这种方式
        //获取类的信息
        //获取所有构造器（不包括私有的）
        Constructor[] cs = aClass.getConstructors();
        System.out.println(cs.length);

        //获取所有构造器 包括私有的
        Constructor[] declaredConstructors = aClass.getDeclaredConstructors();

        //获取单个构造器，参数为Class类型
        Constructor c1 = aClass.getConstructor();
        Constructor c2 = aClass.getConstructor(String.class);
        Constructor c3 = aClass.getConstructor(String.class,int.class);

        Object o = c1.newInstance();
        Object o2 = c2.newInstance("tom");
        Object o3 = c3.newInstance("tom", 18);
        Student stu = (Student)o;
        Student stu1 = (Student)o2;
        Student stu2 = (Student)o3;

        System.out.println(stu.toString());
        System.out.println(stu1.toString());
        System.out.println(stu2.toString());

        //创建对象的通用方式，要求有空参构造
        Object o1 = aClass.newInstance();
        System.out.println(o1.toString());

        //获取私有构造器
        Constructor c4 = aClass.getConstructor(String.class,int.class,char.class);
        c4.setAccessible(true);
        Object o4 = c4.newInstance("tom", 12, 'f');
        System.out.println(o4.toString());

        //获取属性
        String name = aClass.getName();

    }
}

class Student{
    public String name;
    private int age;
    public char gender;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    private Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void show(){
        System.out.println("show 方法。。。。");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
