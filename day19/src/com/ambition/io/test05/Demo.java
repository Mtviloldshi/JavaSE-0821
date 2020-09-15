package com.ambition.io.test05;

import org.junit.Test;

import java.io.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/15/11:43
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
    }
    @Test
    public void test() throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("ps.txt"));

        ps.println("sssss");

        ps.close();
    }

}
