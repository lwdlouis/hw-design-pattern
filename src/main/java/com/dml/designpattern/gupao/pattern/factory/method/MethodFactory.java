package com.dml.designpattern.gupao.pattern.factory.method;


/**
 * 工厂方法
 *
 * 每个产品都有自己对应的工厂，创建的时候不再是通过一个工厂创建
 * 而是先创建对应的工厂，通过这个工厂来创建对应的产品。
 *
 * 如果创建产品需要有什么特殊操作，那么直接在工厂类里面改，
 * 不需要去更改产品类，和应用层。我猜是这个好处吧。
 *
 * 对比简单工厂，虽然应用层都是三行代码，但工厂方法类更多一点。
 * 多的就是工厂有接口，每个产品都有自己的工厂。
 */
public class MethodFactory {

    public static void main(String[] args) {

        ICourseFactory courseFactory = new JavaCourseFactory();
        ICourse javaCourse = courseFactory.createCourse();

        javaCourse.showCourse();
    }
}
