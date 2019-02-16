package com.tryking.java8;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tryking
 */
public class MethodReference {
    public static void main(String[] args) {
        // 方法引用通过方法的名字来指向一个方法。
        // 方法引用通过方法的名字来指向一个方法。
        // 方法引用使用一对冒号 ::

        List names = new ArrayList();

        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");

        names.forEach(System.out::println);

    }
}
