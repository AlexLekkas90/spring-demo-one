package com.luv2code.springdemo;

public interface Coach {

	
	public String getDailyWorkout();
	
	public String getDailyFortune();
	
	public default String getRandomFortune() {
		return "Not implemented";
	}
}
