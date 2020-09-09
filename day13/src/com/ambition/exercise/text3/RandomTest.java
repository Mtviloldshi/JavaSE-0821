package com.ambition.exercise.text3;

import com.sun.corba.se.spi.orb.ParserImplBase;
import org.junit.Test;

import java.util.Random;

/**
 * @Author: ambitions
 * @Date: 2020/09/08/21:15
 * @Description:
 */
public class RandomTest {
    public static void main(String[] args) {
        //抽取[3-15]的随机数
        int[] arr = new int[13];
        for (int i = 3,j = 0; i < 16; i++,j++) {
            arr[j] = i;
        }
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int j = arr[random.nextInt(arr.length)];
            System.out.println(j);
        }

    }

    @Test
    public void test1(){
        //方式二
        for (int i = 0; i < 10; i++) {
            int number = (int) (Math.random() * (16 - 3) + 3);
            System.out.println(number);
        }
    }
}
