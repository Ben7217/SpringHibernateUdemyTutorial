package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {


        // load the spring config file

        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve beans from spring container

        Coach theCoach = context.getBean("theCoach", Coach.class);
        Coach alphaCoach = context.getBean("theCoach", Coach.class);

        //check if they are the same bean
        boolean result = (theCoach == alphaCoach);

        //display results
        System.out.println("\nPointing to the same object?" + result);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");

    }
}
