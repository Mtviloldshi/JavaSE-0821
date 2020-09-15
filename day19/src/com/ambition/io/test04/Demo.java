package com.ambition.io.test04;

import org.junit.Test;

import java.io.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/15/11:18
 * @Description:
 *
 *      对象流：
 *          可以把Java的对象写入文件中，也可以读取文件中的对象到内存中
 *          ObjectOutputStream
 *          ObjectInputStream
 *
 *     序列化：把Java对象存储到文件总中或在网络中传输，需要类实现序列化接口Serializable接口
 *     反序列化：把文件中存储的对象还原为内存中的Java对象过程
 *
 */
public class Demo {
    @Test
    public void test() throws IOException {
        Student stu = new Student("ss", 11);

        //处理流，对象输出流，将Java对象序列化输出到系统文件
        ObjectOutputStream obs = new ObjectOutputStream(new FileOutputStream("obj1.txt"));

        obs.writeObject(stu);

        obs.close();
    }

    @Test
    public void test2() throws IOException, ClassNotFoundException {
        //对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj1.txt"));

        Student stu = (Student) ois.readObject();

        System.out.println(stu.getName());

        ois.close();
    }

}
class Student implements Serializable{//序列化
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
