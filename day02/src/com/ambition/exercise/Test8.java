package com.ambition.exercise;

//第八题
public class Test8 {

    public static void main(String[] args) {
        int x = 3, y = 4, z = 1;
        int max = x > y ? x : y;
        max = max > z ? max : z;
        System.out.println(x + "," + y + "," + z + "中的最大值是： " + max);
    }

}
