package com.ambition.exercise3;

import java.util.Scanner;

/*
    第5题：解方程
        5、求ax2+bx+c=0方程的根。a,b,c分别为函数的参数，
        如果a≠0，那么：
        （1）当b2-4ac>0，则有两个解； img
        （2）当b2-4ac=0，则有一个解； img
        （3）当b2-4ac<0，则无解；
        如果a=0,b≠0，那么， img
 */
public class IfElseExercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入方程：ax的平方 + bx + c = 0的三个参数：");
        System.out.println("a:");
        double a = scan.nextDouble();
        System.out.println("b:");
        double b = scan.nextDouble();
        System.out.println("c:");
        double c = scan.nextDouble();
        //根据不同的参数，求方程的根/解
        if (a != 0) {
            double d = b * b - 4 * a * c;
            if (d > 0) {
                double x1 = (-b + Math.sqrt(d))/(2*a);
                double x2 = (-b - Math.sqrt(d))/(2*a);
                System.out.println("一元二次方程有两个根：" + x1 + "," + x2);
            }else if (d == 0){
                double x = -b/(2*a);
                System.out.println("一元二次方程有1个根：" + x);
            }else {//d < 0
                System.out.println("一元二次方程在实数范围内无解");
            }
        }else {//a = 0
            if (b != 0){
                double x = -c/b;
                System.out.println("一元一次方程的根：" + x);
            }else {
                System.out.println("输入有误，a,b,c不能构成一个方程");
            }
        }
    }
}
