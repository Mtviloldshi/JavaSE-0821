package com.ambition.exercise.ing;

/**
 * @Author: ambitions
 * @Date: 2020/09/07/18:59
 * @Description:
 *
 * 3、声明TestMarry类，在main中，创建Husband和Wife对象后直接打印妻子和丈夫对象，查看异
 * 常情况，看如何解决
 */
public class TestMarry {
    public static void main(String[] args) {
        Husband husband = new Husband("丈夫");
        Wife wife = new Wife("妻子");
        if (husband.getWife() == null){
            throw new RuntimeException("妻子对象未创建！");
        }else {
            System.out.println(husband);
            System.out.println(wife);
        }

    }
}
