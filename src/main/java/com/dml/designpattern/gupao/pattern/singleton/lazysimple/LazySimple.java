package com.dml.designpattern.gupao.pattern.singleton.lazysimple;


/**
 * 懒汉模式
 *
 * 这是简单的懒汉模式，就是需要用的时候再初始化
 *
 * 优点：节省资源
 * 缺点：线程不安全
 *
 * 思考：单例模式一旦创建了就不会被回收的了，因为有 static 的 instance
 * 引用着，那么懒汉模式的意义在哪呢，只能说在一开始的时候节省一点空间
 * 但是应用运行一段时间之后，该初始化的都初始化了，也不会被回收的，还要用
 * 比较复杂的代码来解决线程安全问题。
 *
 * 问题： Spring 的单例模式是饿汉式还是懒汉式呢？包括 Spring 自己的类和
 * 我们创建又会有不一样的区别吗？
 *
 */
public class LazySimple {

    public static LazySimple instance;

    private LazySimple() {

    }

    public static LazySimple getInstance() {

        if (instance == null) {
            return new LazySimple();
        }

        return instance;
    }
}
