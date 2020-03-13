package com.dml.designpattern.gupao.principle.openclose;


import lombok.Data;

@Data
public class JavaCourse implements ICourse {

    private String name = "Java课";
    private Double price = 888.88;


    @Override
    public void showCourse() {
        System.out.println("课程：" + this.getName() + ", " + "售价：" + this.getPrice());
    }
}
