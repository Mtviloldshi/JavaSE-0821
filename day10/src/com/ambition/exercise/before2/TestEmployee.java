package com.ambition.exercise.before2;

/*
    声明一个测试类TestEmployee类，在main中创建Employee[]数组，长度为5，并且存储5个员工
    对象，现在要求用冒泡排序，实现对这个数组进行排序，遍历结果。
 */
public class TestEmployee {
    public static void main(String[] args) {
        Object[] objects = null;
        Employee[] employees = {new Employee(1001, "张三", 2000.0),
                new Employee(1007, "李四", 8000.0), new Employee(1003, "王五", 2000.0),
                new Employee(1009, "赵六", 4000.0), new Employee(1005, "钱七", 2000.0)};

        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - i - 1; j++) {
                if (employees[j].compareTo(employees[j + 1]) > 0) {
                    Employee employee = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = employee;
                }
            }
        }

        for (int i = 0; i < employees.length; i++) {
            System.out.println("编号：" + employees[i].getNumber() + "\t姓名：" + employees[i].getName() + "\t薪资：" + employees[i].getSalary());
        }
    }
}
