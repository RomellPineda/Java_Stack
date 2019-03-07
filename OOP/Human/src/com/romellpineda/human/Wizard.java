package com.romellpineda.human;

public class Wizard extends Human {

	public Wizard() {
		super();
		this.setHealth(50);
		this.setIntelligence(8);
	}
	
	public void heal(Human who) {
		who.setHealth(who.getHealth() + this.getIntelligence());
	}
	
	public void fireball(Human who) {
		who.setHealth(who.getHealth() - (this.getIntelligence() * 3));
	}

}
