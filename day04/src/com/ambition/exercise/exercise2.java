package com.ambition.exercise;

/*
    100以内素数
 */
public class exercise2 {
    public static void main(String[] args) {
        //外层循环100个数，从2开始
        for (int i = 2; i < 101; i++) {
            boolean flag = true;//定义标识
            //内层 循环取模从2到本身
            //优化，Math.sqrt(x),去平方根，能取到平方根值的必然不是素数，例如4 9 16...,提高程序效率
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {//依次取模，循环取模从起始值2到本身
                    //如果取模为零,说明不是素数，跳出循环，并把false赋值给flag
                    flag = false;
                    break;//跳出当前for循环
                }
            }
            //取模不为0的数字 必定是true
            if (flag) {//如果为true
                System.out.println("素数：" + i);//输出素数
            }
        }
    }
}
