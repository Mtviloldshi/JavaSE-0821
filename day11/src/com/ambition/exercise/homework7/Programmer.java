package com.ambition.exercise.homework7;

/**
 * @author 86176
 *
 *  程序员类属性：编程语言，默认都是"java"
 */
public class Programmer extends Employee{
    /**
     * 编程语言
     */
    private  String programmingLanguage = "java";

    public Programmer(String position, int number, String name, int age, double salary) {
        super(position, number, name, age, salary);
    }

    public Programmer() {
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return  super.toString() + "\t" +  programmingLanguage ;
    }
}
