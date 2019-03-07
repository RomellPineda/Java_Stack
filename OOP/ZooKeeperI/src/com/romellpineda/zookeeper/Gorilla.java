package com.romellpineda.zookeeper;

public class Gorilla extends Mammal {
	
	public Gorilla() {
		super();
	}
	
	public String throwSomething() {
		this.setEnergy(this.getEnergy() - 5);
		return "just threw something";
	}
	
	public void eatBananas() {
		this.setEnergy(this.getEnergy() + 10);
	}
	
	public String climb() {
		this.setEnergy(this.getEnergy() - 10);
		return "climbing!";
	}
	
}
