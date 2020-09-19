package com.ambition.demo4;

import java.lang.reflect.Field;

/**
 * @Author: ambitions
 * @Date: 2020/09/19/15:04
 * @Description:
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        String className = "com.ambition.demo4.User";
        String fieldName = "name";
        String fieldValue = "tom";

        User user = (User) getObject(className, fieldName, fieldValue);
        System.out.println(user.getName());
    }

    /**
     * 根据类名创建对象
     * @param className
     * @return
     * @throws Exception
     */
    public static Object getObject(String className,String fieldName,
                                   String fieldValue) throws Exception {
        Class<?> clazz = Class.forName(className);
        Object obj = clazz.newInstance();
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(obj,fieldValue);
        return obj;
    }
}
