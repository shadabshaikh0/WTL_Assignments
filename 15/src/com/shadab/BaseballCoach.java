package com.shadab;

public class BaseballCoach implements Coach {
	
	public String workout;
	public FortuneService fortuneService;
	public BaseballCoach(){}

	public BaseballCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
		
	public void setWorkout(String workout) {
		this.workout = workout;
	}

	public String getDailyWorkout() {
		return workout;
	}

	public String getDailyFortune(){
		return fortuneService.getDailyFortune();
	}

}
