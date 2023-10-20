package com.demo.javademo.keyword;

public class SignalDemo {

    public static void main(String[] args) {
        //报错
//        if((23!=23) & (100/0==0)){
        if((23!=23) && (100/0==0)){
            System.out.println("运算没有问题。");
        }else{
            System.out.println("没有报错");
        }
    }

}
