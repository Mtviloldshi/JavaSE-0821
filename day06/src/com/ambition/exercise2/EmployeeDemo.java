package com.ambition.exercise2;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
//        MyDate myDate1 = new MyDate();
//        MyDate myDate2 = new MyDate();

        emp1.name = "Tom";
        emp2.name = "Mack";
        emp1.myDate = new MyDate();
        emp1.myDate.year = 2000;
        emp1.myDate.month = 12;
        emp1.myDate.day = 31;


        emp2.myDate = new MyDate();
        emp2.myDate.year = 2001;
        emp2.myDate.month = 2;
        emp2.myDate.day = 13;

        System.out.println("姓名：" + emp1.name + "\t生日：" + emp1.myDate.year + "-" + emp1.myDate.month + "-" + emp1.myDate.day);
        System.out.println("姓名：" + emp2.name + "\t生日：" + emp2.myDate.year + "-" + emp2.myDate.month + "-" + emp2.myDate.day);
    }
}
