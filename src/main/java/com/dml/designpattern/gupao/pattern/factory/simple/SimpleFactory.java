package com.dml.designpattern.gupao.pattern.factory.simple;

/**
 * 简单工厂
 *
 * 大概意思就是创建类的逻辑封装到工厂里面，调用层需要明确创建什么类。
 *
 * 问题：为什么这种是简单工厂，跟工厂方法和抽象工厂有什么区别？
 */
public class SimpleFactory {

    public static void main(String[] args) {

        CourseFactory factory = new CourseFactory();
        ICourse course = factory.getCourseByName("Java");

        course.showCourse();
    }
}
