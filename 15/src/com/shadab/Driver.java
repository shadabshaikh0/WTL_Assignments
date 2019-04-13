package com.shadab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		FortuneService fortuneService = (FortuneService)context.getBean("fortune");
		//fortuneService.setFortune("Lucky Day");
		
		CricketCoach cricketCoach = (CricketCoach)context.getBean("cricketcoach");
		BaseballCoach baseballCoach = (BaseballCoach)context.getBean("baseballcoach");
		
		cricketCoach.setWorkout("Pratice");
		baseballCoach.setWorkout("Run");
		
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());

		System.out.println(baseballCoach.getDailyWorkout());
		System.out.println(baseballCoach.getDailyFortune());
		
	}
}
