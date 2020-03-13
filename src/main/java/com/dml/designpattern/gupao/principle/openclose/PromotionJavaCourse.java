package com.dml.designpattern.gupao.principle.openclose;

public class PromotionJavaCourse extends JavaCourse {

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
