package com.shadab;

public class CricketCoach implements Coach {

	public String workout;
	public FortuneService fortuneService;
	
	public CricketCoach() {}
	
	public CricketCoach(FortuneService fortuneService) {
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
