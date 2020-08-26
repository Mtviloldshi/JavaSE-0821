package com.ambition.exercise;

/*
    不输出7
 */
public class exercise4 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 7 == 0 || i % 10 == 7 || (i > 69 && i < 80)) {
                continue;
            }
            System.out.println(i);
        }
    }
}
