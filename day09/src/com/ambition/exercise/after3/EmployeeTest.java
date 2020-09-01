package com.ambition.exercise.after3;

/*
    5、你现在是财务，需要查看每个人的实发工资，并查看工资总额。 声明一个员工数组，存储各种
    员工，并遍历显示他们的姓名和实发工资，并计算所有员工的工资总额
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new SalaryEmployee();

        Employee[] employees = {new SalaryEmployee("正式员工", 5000, 27, 3),
                new HourEmployee("小时工", 14, 12), new Manager("总经理", 8000, 20, 1, 10)};

        double salarys = 0;//总工资
        for (int i = 0; i < employees.length; i++) {
            salarys += employees[i].earning();
            System.out.println(employees[i].getName() + "\t实发工资:" + employees[i].earning());
        }

        System.out.println("工资总额：" + salarys);
    }
}
