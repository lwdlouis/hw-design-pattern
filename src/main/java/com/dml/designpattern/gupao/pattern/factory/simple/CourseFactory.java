package com.dml.designpattern.gupao.pattern.factory.simple;

public class CourseFactory {

    public ICourse getCourseByName(String name) {

        if ("Java".equalsIgnoreCase(name)) {
            return new JavaCourse();
        }
        else if ("Go".equalsIgnoreCase(name)) {
            return new GoCourse();
        }

        return null;
    }
}
