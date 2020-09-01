package com.ambition.exercise.after4;

/*
   3. 声明一个子类HourEmployee小时工，继承父类Employee 有属性，工作小时数，每小时多少钱 重
    写方法，public double earning()返回实发工资， 实发工资 = 每小时多少钱 * 小时数 重写方法，public
    String getInfo()：显示姓名和实发工资，时薪，工作小时数 增加方法，public void leave()：打印查看
    使用工具是否损坏，需要赔偿
 */
public class HourEmployee extends Employee {
    private int jobHours;//工作小时数
    private double hoursMoney;//每小时多少钱

    public String getInfo() {
        return super.getInfo() + "\t时薪:" + hoursMoney + "\t工作小时数:" + jobHours;
    }

    public HourEmployee(int number, String name, MyDate myDate, int jobHours, double hoursMoney) {
        super(number, name, myDate);
        this.jobHours = jobHours;
        this.hoursMoney = hoursMoney;
    }

    //打印查看使用工具是否损坏，需要赔偿
    public void leave(){
        System.out.println("无损坏物件！");
    }

    //实发工资 = 每小时多少钱 * 小时数
    public double earning() {
        return hoursMoney * jobHours;
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
