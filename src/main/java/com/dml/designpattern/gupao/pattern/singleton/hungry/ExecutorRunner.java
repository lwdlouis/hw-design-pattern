package com.dml.designpattern.gupao.pattern.singleton.hungry;

public class ExecutorRunner implements Runnable {


    @Override
    public void run() {
        Hungry instance = Hungry.getInstance();

        System.out.println(instance.getClass() + "" + instance);
    }
}
