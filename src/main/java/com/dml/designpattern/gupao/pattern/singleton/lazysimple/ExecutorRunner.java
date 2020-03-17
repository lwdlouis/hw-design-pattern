package com.dml.designpattern.gupao.pattern.singleton.lazysimple;


public class ExecutorRunner implements Runnable {


    @Override
    public void run() {
        LazySimple instance = LazySimple.getInstance();

        System.out.println(instance.getClass() + "" + instance);
    }
}
