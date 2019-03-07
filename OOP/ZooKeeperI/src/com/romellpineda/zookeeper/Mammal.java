package com.romellpineda.zookeeper;

public class Mammal {
	// attributes
	private int energy = 100;
	private boolean sleeping = false;
	
	// methods
    public void regulateTemperature() {
        System.out.println("self-regulating temperature");
    }
    
    public void startSleeping() {
        sleeping = true;
        System.out.println("ZzZz");
    }
    
    public boolean isSleeping(){
        return sleeping;
    }
    
    public String displayEnergy() {
    	return "Current energy level: " + this.getEnergy();
    }
    
	public int getEnergy() {
		return energy;
	}
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	public void wakeUp() {
		this.sleeping = false;
	}
	
}
