package exercise.io;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ambitions
 * @Date: 2020/09/15/13:31
 * @Description:
 *
 * 1. 将存有多个自定义对象的集合序列化操作，保存到list.txt 文件中。
 * 2. 反序列化list.txt ，并遍历集合，打印对象信息。
 *      1. 把若干学生对象 ，保存到集合中。
 *      2. 把集合序列化。
 *      3. 反序列化读取时，只需要读取一次，转换为集合类型。
 *      4. 遍历集合，可以打印所有的学生信息
 */
public class Exercise2 {
    //序列化
    @Test
    public void test() throws IOException {
        List<Student> list = new ArrayList<>();
        list.add(new Student("aaa",12));
        list.add(new Student("bbb",14));
        list.add(new Student("ccc",18));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("list.txt"));

        oos.writeObject(list);

        oos.close();
    }

    //反序列化
    @Test
    public void test2() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("list.txt"));
        List<Student> list = (List<Student>)ois.readObject();

        for (Student student : list) {
            System.out.println(student.getName() + " --- " + student.getAge());
        }

        ois.close();
    }
}

class Student implements Serializable{//序列化
    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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
}
