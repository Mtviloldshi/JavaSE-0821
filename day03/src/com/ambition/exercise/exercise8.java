package com.ambition.exercise;
/*
    q求出1-100之间的偶数和
 */
public class exercise8 {
    public static void main(String[] args) {
        int sum=0;
//        for (int i = 1; i < 101 ; i++){
//            if (i%2 == 0){
//                sum += i;
//            }
//        }

        for (int i = 1; i < 101 ; i += 2){
                sum += i;
        }
        System.out.println("1-100之间的偶数和 = " + sum);
    }
}
