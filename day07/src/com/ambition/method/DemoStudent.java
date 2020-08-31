package com.ambition.method;

public class DemoStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.study();
        System.out.println(student.add(10));//调用方法时传入的数据，是实际参数
        System.out.println("---------------");
        student.show();//不推荐
        Student.show();//推荐使用类名直接调用
    }
}
