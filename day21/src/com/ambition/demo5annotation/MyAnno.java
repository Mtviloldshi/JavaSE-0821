package com.ambition.demo5annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: ambitions
 * @Date: 2020/09/19/16:03
 * @Description:
 */
@Retention(RetentionPolicy.RUNTIME)//表示此注解在运行期间有效
@Target(ElementType.METHOD)//表示此注解可以使用在方法上
public @interface MyAnno {
    String value();
}
