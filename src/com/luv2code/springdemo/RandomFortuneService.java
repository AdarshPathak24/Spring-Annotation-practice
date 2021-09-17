package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// Create an array of String
	private String[] data = {
		"Beware of girls",
		"Don't fall in love easily",
		"Love the true once only"
	};
	
	// create a random number genator
	private Random myRandom = new Random(); 
	
	@Override
	public String getFortune() {
		
		// Pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		return theFortune;
	}

}
 