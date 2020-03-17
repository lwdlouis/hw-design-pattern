package com.dml.designpattern.gupao.pattern.singleton.lazysimple;

public class LazySimpleTest {

    public static void main(String[] args) {

        Thread t1 = new Thread(new ExecutorRunner());
        Thread t2 = new Thread(new ExecutorRunner());

        t1.start();
        t2.start();

        System.out.println("Run end...");
    }
}
