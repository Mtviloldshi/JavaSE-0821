package com.ambition.demo.linkedlist;

import java.util.LinkedList;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/10:22
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("10");
        linkedList.add("11");
        linkedList.add("12");
        linkedList.remove("11");
    }
}
