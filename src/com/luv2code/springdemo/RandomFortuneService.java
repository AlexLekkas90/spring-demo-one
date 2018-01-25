package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	private Random r;
	@Override
	public String getFortune() {
		String[] fortunes = {"Bad luck today :(", "Excellent luck today :)", "There's no such thing as luck..."};
		r = new Random();
		return fortunes[r.nextInt(3)];
	}

}
