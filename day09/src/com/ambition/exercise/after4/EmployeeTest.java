package com.ambition.exercise.after4;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Scanner;

/*
    5、声明一个员工数组，存储各种员工， 你现在是人事，从键盘输入当前的月份，需要查看每个人的详
    细信息。 如果他是正式工（包括SalaryEmployee和Manager），并且是本月生日的，祝福生日快乐，
    通知领取生日礼物。如果是HourEmployee显示小时工，就进行完工检查，即调用leave方法
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //初始化对象
        Employee[] employees = {new SalaryEmployee(1, "cyy", new MyDate(1999, 2, 12), 5000, 27, 3),
                new HourEmployee(0, "xyy", new MyDate(1998, 10, 12), 14, 12),
                new Manager(2, "nyy", new MyDate(1980, 12, 12), 8000, 20, 1, 10, 1000)};

        System.out.println("请输入月份：");
        //输入月份
        int month;
        while (true) {
            month = scan.nextInt();
            if (month > 1 && month < 13) {
                break;
            } else {
                System.out.println("输入错误，请重新输入！");
            }
        }

        for (int i = 0; i < employees.length; i++) {
            //打印员工信息
            System.out.println(employees[i].getInfo());
            //判断是否是正式员工或者是总经理
            if (employees[i].getNumber() == 1 || employees[i].getNumber() == 2) {
                //是否是输入的月份生日
                if (employees[i].getMyDate().getMonth() == month) {
                    //打印
                    System.out.println(employees[i].getName() + "生日快乐！速来领取生日礼物");
                }
            } else if (employees[i].getNumber() == 0) {
                //如果是小时工
                //强转类型，打印方法
                HourEmployee hourEmployee = (HourEmployee) employees[i];
                hourEmployee.leave();
            }
        }
    }
}
