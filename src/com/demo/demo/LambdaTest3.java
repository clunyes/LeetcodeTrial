package com.demo.demo;

import java.util.Comparator;

public class LambdaTest3 {

    public static void main(String[] args) {
//        int num = 1;
//        Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
//        s.convert(2);
//        num = 5;
//报错信息：Local variable num defined in an enclosing scope must be final or effectively

//        String first = "";
//
////编译会出错
//        Comparator<String> comparator = (first, second) -> Integer.compare(first.length(), second.length());
    }

    public interface Converter<T1, T2> {
        void convert(int i);
    }
}
