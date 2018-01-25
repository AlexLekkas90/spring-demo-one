package com.luv2code.springdemo;

public class GamingCoach implements Coach {
	
	private FortuneService randomFortuneService;

	
	public GamingCoach(FortuneService fortuneService) {
		randomFortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Drink the Mt Dew and eat the Doritos";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getRandomFortune() {
		return randomFortuneService.getFortune();
	}
	
	

}
