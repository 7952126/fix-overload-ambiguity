package com.github.hcsp.objectbasic;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // 请修复这里的编译错误，令实际调用的方法是print(HashMap)
        /**
         * Object
         *     -- Number
         *          -- Integer
         *     -- AbstractMap
         *          -- HashMp
         *
         *                          print(null) 匹配了多个构造器， 需要强转类型
         * */
        print((HashMap)null);
    }

    public static void print(int i) {
        System.out.println("I'm int!");
    }

    public static void print(Integer i) {
        System.out.println("I'm Integer!");
    }

    public static void print(Number i) {
        System.out.println("I'm Number!");
    }

    public static void print(Object i) {
        System.out.println("I'm Object!");
    }

    public static void print(HashMap i) {
        System.out.println("I'm HashMap!");
    }
}
