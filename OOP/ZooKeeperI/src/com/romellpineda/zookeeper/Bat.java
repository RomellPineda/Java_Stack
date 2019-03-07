package com.romellpineda.zookeeper;

public class Bat extends Mammal {

	public Bat() {
		super();
		this.setEnergy(300);
	}
	
	public String fly() {
		this.setEnergy(this.getEnergy() - 50);
		return "the sound of a bat taking off";
	}
	
	public void eatFruit() {
		this.setEnergy(this.getEnergy() + 25);
	}
	
	public String attackGotham() {
		this.setEnergy(this.getEnergy() - 100);
		return "KAPOW! WHAM! BONK!";
	}

}
