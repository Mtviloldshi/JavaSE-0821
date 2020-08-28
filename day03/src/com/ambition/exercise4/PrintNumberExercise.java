package com.ambition.exercise4;

/*
    第8题：3、5、7的倍数不打印
        8   、打印1-100之间数，其中3、5、7的倍数不打印
 */
public class PrintNumberExercise {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
                if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
                    continue;
                }
            System.out.println(i);
        }
    }
}
