package com.romellpineda.human;

public class Samurai extends Human {
	public static int lastSamurai = 0;

	public Samurai() {
		super();
		this.setHealth(200);
		lastSamurai++;
	}

	public void deathBlow(Human who) {
		who.setHealth(0);
		this.setHealth(this.getHealth() / 2 );
	}
	
	public void meditate() {
		this.setHealth(this.getHealth() + (this.getHealth() / 2));
	}
	
	public static String howMany() {
		return "this many samurai: " + lastSamurai;
	}
}
