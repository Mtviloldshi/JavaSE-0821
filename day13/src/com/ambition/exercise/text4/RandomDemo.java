package com.ambition.exercise.text4;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/18:26
 * @Description:
 *
 * public Random():创建一个新的随机数生成器。此构造方法将随机数生成器的种子设置为某个值，
 * 该值与此构造方法的所有其他调用所用的值完全不同。(没有真正的随机数，需要种子产生随机
 * 数，同一个种子产生的伪随机数序列相同)
 * public Random(long seed):使用单个 long 种子创建一个新的随机数生成器。该种子是伪随机数生
 * 成器的内部状态的初始值，该生成器可通过方法 next(int) 维护。
 * boolean nextBoolean():返回下一个伪随机数，它是取自此随机数生成器序列的均匀分布的
 * boolean 值。
 * void nextBytes(byte[] bytes):生成随机字节并将其置于用户提供的 byte 数组中。
 * double nextDouble():返回下一个伪随机数，它是取自此随机数生成器序列的、在 0.0 和 1.0 之间
 * 均匀分布的 double 值。
 * float nextFloat():返回下一个伪随机数，它是取自此随机数生成器序列的、在 0.0 和 1.0 之间均匀
 * 分布的 float 值。
 * double nextGaussian():返回下一个伪随机数，它是取自此随机数生成器序列的、呈高斯（“正
 * 态”）分布的 double 值，其平均值是 0.0，标准差是 1.0。
 * int nextInt():返回下一个伪随机数，它是此随机数生成器的序列中均匀分布的 int 值。
 * int nextInt(int n):返回一个伪随机数，它是取自此随机数生成器序列的、在 0（包括）和指定值
 * （不包括）之间均匀分布的 int 值。
 * long nextLong():返回下一个伪随机数，它是取自此随机数生成器序列的均匀分布的 long 值。
 */
public class RandomDemo {
    @Test
    public void test1(){
//  public Random():创建一个新的随机数生成器。此构造方法将随机数生成器的种子设置为某个值，
// * 该值与此构造方法的所有其他调用所用的值完全不同。(没有真正的随机数，需要种子产生随机
// * 数，同一个种子产生的伪随机数序列相同)
        Random random = new Random();
//  boolean nextBoolean():返回下一个伪随机数，它是取自此随机数生成器序列的均匀分布的boolean 值。
        System.out.println(random.nextBoolean());

//        void nextBytes(byte[] bytes):生成随机字节并将其置于用户提供的 byte 数组中
        byte[] bytes = new byte[10];
        random.nextBytes(bytes);
        System.out.println(Arrays.toString(bytes));
    //double nextDouble():返回下一个伪随机数，它是取自此随机数生成器序列的、在 0.0 和 1.0 之间均匀分布的 double 值。
            System.out.println(random.nextDouble() * 2 + 3);//[3-5)

   //* float nextFloat():返回下一个伪随机数，它是取自此随机数生成器序列的、在 0.0 和 1.0 之间均匀分布的 float 值。
        System.out.println(random.nextFloat());

    //* double nextGaussian():返回下一个伪随机数，它是取自此随机数生成器序列的、呈高斯（“正态”）分布的 double 值，其平均值是 0.0，标准差是 1.0。
        for (int i = 0; i < 5; i++) {

            System.out.println(random.nextGaussian());
        }
        System.out.println("----------------");
    //* int nextInt():返回下一个伪随机数，它是此随机数生成器的序列中均匀分布的 int 值。
        System.out.println(random.nextInt());
        // * int nextInt(int n):返回一个伪随机数，它是取自此随机数生成器序列的、在 0（包括）和指定值
            System.out.println(random.nextInt(13)   + 3); //random.nextInt(x) + y   (x+y -y] : 范围
    // * long nextLong():返回下一个伪随机数，它是取自此随机数生成器序列的均匀分布的 long 值。
        System.out.println(random.nextLong());
    }
}
