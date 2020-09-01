package com.ambition.exercise.after3;

/*
    3、声明一个子类HourEmployee小时工，继承父类Employee 有属性，工作小时数，每小时多少钱
    重写方法，public double earning()返回实发工资， 实发工资 = 每小时多少钱 * 小时数
 */
public class HourEmployee extends Employee {
    private int jobHours;//工作小时数
    private double hoursMoney;//每小时多少钱

    //实发工资 = 每小时多少钱 * 小时数
    public double earning() {
        return hoursMoney * jobHours;
    }

    public HourEmployee(String name, int jobHours, double hoursMoney) {
        super(name);
        this.jobHours = jobHours;
        this.hoursMoney = hoursMoney;
    }

    public HourEmployee() {
    }

    public int getJobHours() {
        return jobHours;
    }

    public void setJobHours(int jobHours) {
        this.jobHours = jobHours;
    }

    public double getHoursMoney() {
        return hoursMoney;
    }

    public void setHoursMoney(double hoursMoney) {
        this.hoursMoney = hoursMoney;
    }
}
