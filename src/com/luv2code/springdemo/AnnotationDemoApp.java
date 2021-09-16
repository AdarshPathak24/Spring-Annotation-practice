package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring configuration file
        ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from the container
        
        Coach theCoach = context.getBean("tennisCoach", Coach.class);  // using default bean id, it is same as class name but first letter small
		
		// call a method on the bean
        
        System.out.println(theCoach.getDailyWorkout());
		
		// close the context
        context.close();
	}

}
