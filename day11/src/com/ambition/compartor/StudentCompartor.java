package com.ambition.compartor;

import java.util.Comparator;

/**
 * @author 86176
 *
 * 实现comparator 来进行对类对象的排序
 *      测试类省略
 */
public class StudentCompartor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        int i = s1.getScore() - s2.getScore();
        i = i == 0? s1.getAge() - s2.getAge() : i;
        return i;
    }
}
