package com.demo.javademo.concurrent.threadlocal;

public class ThreadLocalDemo {
    public static void main(String[] args) {
        // 声明 ThreadLocal对象
       ThreadLocal<Boolean> mThreadLocal = new ThreadLocal<>();

        // 在主线程、子线程1、子线程2中去设置访问它的值
        mThreadLocal.set(true);

        System.out.println("Main " + mThreadLocal.get());

        new Thread("Thread#1"){
            @Override
            public void run() {
                mThreadLocal.set(false);
                System.out.println("Thread#1 " + mThreadLocal.get());
            }
        }.start();

        new Thread("Thread#2"){
            @Override
            public void run() {
                System.out.println("Thread#2 " + mThreadLocal.get());
            }
        }.start();

        System.out.println("Main2：" + mThreadLocal.get());

    }
}
