package com.ambition.exercise.after4;

import com.sun.org.apache.regexp.internal.RE;

/*
        2、声明一个子类SalaryEmployee正式工，继承父类Employee 增加属性，薪资，工作日天数，请假天
        数 重写方法，public double earning()返回实发工资， 实发工资 = 薪资 - 薪资/工作日天数 * 请假天
        数， 重写方法，public String getInfo()：显示姓名和实发工资，月薪，工作日天数，请假天数
 */
public class SalaryEmployee extends Employee {
    private double salary;//薪资
    private int jobDays;//工作天数
    private int leaveDays;//请假天数

    public String getInfo(){
        return super.getInfo() + "\t工作天数:" + jobDays + "\t请假天数:" + leaveDays;
    }

    //实发工资 = 薪资 - 薪资/工作日天数 * 请假天数
    public double earning() {
        return salary - salary / jobDays * leaveDays;
    }

    public SalaryEmployee() {
    }

    public SalaryEmployee(int number, String name, MyDate myDate, double salary, int jobDays, int leaveDays) {
        super(number, name, myDate);
        this.salary = salary;
        this.jobDays = jobDays;
        this.leaveDays = leaveDays;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getJobDays() {
        return jobDays;
    }

    public void setJobDays(int jobDays) {
        this.jobDays = jobDays;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }
}
