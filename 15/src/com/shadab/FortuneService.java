package com.shadab;

public class FortuneService implements Fortune{

	public String fortune;

	public void setFortune(String fortune) {
		this.fortune = fortune;
	}

	public String getDailyFortune() {
		return fortune;
	}
	
}
