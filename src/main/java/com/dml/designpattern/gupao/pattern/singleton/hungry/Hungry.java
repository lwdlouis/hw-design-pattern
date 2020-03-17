package com.dml.designpattern.gupao.pattern.singleton.hungry;


/**
 * 饿汉模式
 *
 * 饿汉模式就是在一开始就创建好
 *
 * 优点：简单，性能好（没有锁，启动就初始化了）
 * 缺点：资源浪费，如果有很多单例，但是不是每一个使用的频率都一样，有些
 * 使用的多点，有些使用的少一点，但是却全部都初始化出来了。
 *
 *
 */
public class Hungry {

    /**
     * 直接在属性初始化和在 static 代码块初始化是一样的
     */
//    public static Hungry instance = new Hungry();

    public static Hungry instance;

    static {
        instance = new Hungry();
    }

    private Hungry() {

    }

    public static Hungry getInstance() {
        return instance;
    }

}
