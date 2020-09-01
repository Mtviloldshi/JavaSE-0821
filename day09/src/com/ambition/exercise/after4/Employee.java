package com.ambition.exercise.after4;

/*
    1、声明一个父类Employee员工类型， 有属性，姓名（String），出生日期（MyDate类型，也是自定
    义的含年，月，日属性日期类型） 有方法，public abstract double earning() public String getInfo()：
    显示姓名和实发工资
 */
public class Employee {
    private int number;//0 代表小时工 1 代表正式员工 2 代表总经理
    private String name;
    private MyDate myDate;

    public Employee() {
    }

    public Employee(int number, String name, MyDate myDate) {
        this.number = number;
        this.name = name;
        this.myDate = myDate;
    }

    public MyDate getMyDate() {
        return myDate;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setMyDate(MyDate myDate) {
        this.myDate = myDate;
    }

    public double earning() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        String str;
        if (number == 0){
            str = "小时工";
        }else if (number == 1){
            str = "正式员工";
        }else if (number == 2){
            str = "总经理";
        }else {
            str = "不知名员工";
        }
        return str + "\t姓名:" + name + "\t实发工资：" + earning();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", myDate=" + myDate +
                '}';
    }
}
