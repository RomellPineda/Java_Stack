package com.romellpineda.human;

public class Ninja extends Human {

	public Ninja() {
		super();
		this.setStealth(10);
	}
	
	public void steal(Human who) {
		who.setHealth(who.getHealth() - this.getStealth());
		this.setStealth(this.getStealth() + this.getStealth());
	}

	public void runAway() {
		this.setHealth(this.getHealth() - 10);
	}
	
}
