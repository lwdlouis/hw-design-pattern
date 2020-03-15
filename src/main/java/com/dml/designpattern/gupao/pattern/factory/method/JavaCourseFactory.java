package com.dml.designpattern.gupao.pattern.factory.method;

public class JavaCourseFactory implements ICourseFactory {

    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }
}
