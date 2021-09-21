package com.luv2code.springdemo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.luv2code.springdemo")

public class SportConfig {
	// Define a bean for sad fortune service
	@Bean 
	public FortuneService sadFortuneService() {
		return new SadFortuneService();	
	}
	
	
	// Define a bean for our swim coach AND inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
}
