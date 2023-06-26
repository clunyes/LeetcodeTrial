package com.demo.demo.classDemo.innerclass;

public class InnerClassDemo6 {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            public void eat() {
                System.out.println("animal eat something");
            }
        };
        animal.eat();
    }
}
