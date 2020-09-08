package com.ambition.annotation;

import java.lang.annotation.*;

/**
 * @author 86176
 * 自定义注解 @interface
 *
 * 元注解：用在注解上的注解
 *      @Target(参数) 表示此注解可以使用在类中的位置
 *          ElementType.METHOD 用在方法上
 *          ElementType.FIELD 用在属性上
 *          ElementType.TYPE 用在类上
 *
 *      @Retention(参数) 表示此注解在何时有效
 *          RetentionPolicy.RUNTIME //运行期有效
 *          RetentionPolicy.CLASS //字节码期有效
 *          RetentionPolicy.SOURCE // 源码中有效
 *
 *      @Documented //表示说明文档中会体现出此注解信息
 */

@Target(ElementType.METHOD)//表示可使用在何地方
@Documented //表示说明文档中会体现出此注解信息
@Retention(RetentionPolicy.RUNTIME)//此注解在何时有效
public @interface MyAnnotation {
}
