package com.dml.designpattern.gupao.principle.openclose;

public class OpenClosePrinciple {

    public static void main(String[] args) {

        /**
         * 1. 首先有一堂 java 课，功能是显示课程名称和售价
         */
//        ICourse course = new JavaCourse();
//        course.showCourse();


        /**
         * 2. 现在要打折了，怎么在不修改原来类的基础上实现呢？
         */
        ICourse course = new PromotionJavaCourse();
        course.showCourse();

        /**
         * 感觉不是很对啊，哈哈，这样真的是开闭原则？
         */

    }
}
