package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLIfeCycleDemoApp {

    public static void main(String[] args) {


        // load the spring config file

        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // retrieve beans from spring container

        Coach theCoach = context.getBean("theCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        //close the context
        context.close();

    }
}
