package com.demo.javademo.finalstaticDemo;

public class StaticA {
    private int x;        // 实例变量
    public static int y;  // 静态变量

    /**
     * 存在继承的情况下，初始化顺序为：
     *
     * 父类（静态变量、静态语句块）
     * 子类（静态变量、静态语句块）
     * 父类（实例变量、普通语句块）
     * 父类（构造函数）
     * 子类（实例变量、普通语句块）
     * 子类（构造函数）
     */
}
