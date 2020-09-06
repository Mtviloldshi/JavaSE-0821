package com.ambition.exercise.homework4;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("员工类型\t编号\t姓名\t年龄\t薪资\t语言\t奖金\t股票\n");
        for (int i = 0; i < employee.EMPLOYEES.length; i++) {
            String str = null;

            switch (Integer.parseInt(employee.EMPLOYEES[i][0])) {
                case 10:
                    System.out.print("普通员工");
                    break;
                case 11:
                    System.out.print("程序员");
                    break;
                case 12:
                    System.out.print("设计师");
                    break;
                case 13:
                    System.out.print("架构师");
                    break;
            }
            for (int j = 1; j < employee.EMPLOYEES[i].length; j++) {
                System.out.print("\t" + employee.EMPLOYEES[i][j] );
            }
            System.out.println();
        }
    }
}

class Employee {
    final int EMPLOYEE = 10;//表示普通员工
    final int PROGRAMMER = 11;//表示程序员
    final int DESIGNER = 12;//表示设计师
    final int ARCHITECT = 13;//表示架构师

    String[][] EMPLOYEES = {
            {"10", "1", "段誉", "22", "3000"},
            {"13", "2", "令狐冲", "32", "18000", "15000", "2000"},
            {"11", "3", "任我行", "23", "7000"},
            {"11", "4", "张三丰", "24", "7300"},
            {"12", "5", "周芷若", "28", "10000", "5000"},
            {"11", "6", "赵敏", "22", "6800"},
            {"12", "7", "张无忌", "29", "10800", "5200"},
            {"13", "8", "韦小宝", "30", "19800", "15000", "2500"},
            {"12", "9", "杨过", "26", "9800", "5500"},
            {"11", "10", "小龙女", "21", "6600"},
            {"11", "11", "郭靖", "25", "7100"},
            {"12", "12", "黄蓉", "27", "9600", "4800"}
    };
}
