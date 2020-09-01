package com.ambition.exercise.after3;

/*
        2、声明一个子类SalaryEmployee正式工，继承父类Employee，增加属性，薪资，工作日天数，
           请假天数 重写方法，public double earning()返回实发工资，
           实发工资 = 薪资 - 薪资/工作日天数 * 请假天数，
 */
public class SalaryEmployee extends Employee {
    private double salary;//薪资
    private int jobDays;//工作天数
    private int leaveDays;//请假天数

    //实发工资 = 薪资 - 薪资/工作日天数 * 请假天数
    public double earning() {
        return salary - salary / jobDays * leaveDays;
    }

    public SalaryEmployee() {
    }
    //new Manager("总经理", 8000, 20, 1, 1000)
    public SalaryEmployee(String name, double salary, int jobDays, int leaveDays) {
        super(name);
        this.salary = salary;
        this.jobDays = jobDays;
        this.leaveDays = leaveDays;
    }

    public void driver(){

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
