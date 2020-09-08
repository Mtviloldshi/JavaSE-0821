package com.ambition.exercise.ing3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: ambitions
 * @Date: 2020/09/07/20:54
 * @Description:
 *
 * * 声明一个测试类，在main中，创建Employee[]数组，长度为5，显示原来顺序结果
 * * 调用java.util.Arrays数组工具类的排序方法public static void sort(Object[] a, Comparator c)对数
 * * 组的元素进行排序，用匿名内部类的对象给c形参传入按照薪资比较大小的定制比较器对象。并显
 * * 示排序后结果
 * * 调用java.util.Arrays数组工具类的排序方法public static void sort(Object[] a, Comparator c)对数
 * * 组的元素进行排序，用匿名内部类的对象给c形参传入按照编号比较大小的定制比较器对象。并显
 * * 示排序后结果
 */
public class EmployeeTest {
    static Employee[] employees = {new Employee(102, "cyq", 5000), new Employee(105, "qqq", 8000),
            new Employee(104, "cuq", 10000), new Employee(108, "iii", 4000)};

    public static void main(String[] args) {


        System.out.println("原排序：");
//        for (int i = 0; i < employees.length; i++) {
//            System.out.println(employees[i].toString());
//        }
        sortArr(employees);
        //排序 按编号
        Arrays.sort(employees, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Employee employee1 = (Employee) o1;
                Employee employee2 = (Employee) o2;
                return employee1.getNumber() - employee2.getNumber();
            }
        });
        System.out.println("按编号排序：");
        sortArr(employees);
        //按薪资排序
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });
        System.out.println("按薪资排序：");
        sortArr(employees);
    }

    public static void sortArr(Employee[] employeess) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }
}
