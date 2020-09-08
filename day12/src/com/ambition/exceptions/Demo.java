package com.ambition.exceptions;

import org.junit.Test;

/**
 * @author am
 * 异常：程序运行过程中出现的非正常情况，如果不处理，会导致jvm终止。
 *      程序中如何描述异常？
 *          Java把各种异常定义成了不同类来进行描述。NullPointerException
 *      程序出现了异常的话，我们如何得知？
 *          Java会创建出异常对象，并抛出来
 *      发生了异常，如何处理？
 * <p>
 *
 *  异常体系：
 *      Throwable根类
 *          Error：验证错误，我们一般无法处理，只能终止程序。栈溢出，内存溢出，程序逻辑可能有问题导致非常消耗资源。
 *          Exception：一般性问题，可以做到预防并处理，可以保证程序发生异常时，还能继续运行。
 *              受检异常：也叫编译期异常 不处理不通过编译，无法运行
 *              非受检异常：也叫运行时异常 可以通过编译，运行时报错
 *          除了RuntimeException 其他同级类都是编译异常
 *
 *  异常抛出机制：
 *      A：虚拟机自动抛出异常，打印异常信息，jvm终止
 *      B：主动抛出异常：thorw new 异常对象。
 */
public class Demo {


    @Test
    public void testError() {//java.lang.StackOverflowError 栈溢出
        int i = 1;
        testError();
    }

    @Test
    public void testError2() {//java.lang.OutOfMemoryError: Java heap space //堆溢出
        int[] arr = new int[1024 * 1024 * 1024];
    }

    @Test
    public void testThrow1() {//java.lang.OutOfMemoryError: Java heap space //堆溢出
        //主动抛出异常
        throw new RuntimeException("。。。");
    }
}
