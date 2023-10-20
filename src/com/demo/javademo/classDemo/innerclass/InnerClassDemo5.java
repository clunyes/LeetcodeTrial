package com.demo.javademo.classDemo.innerclass;

public class InnerClassDemo5 {
    public static void main(String[] args) {
        Person p = new Person() {
            public void eat() {
                System.out.println("people eat something");
            }
        };
        p.eat();
    }
}
