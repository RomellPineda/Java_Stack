package com.romellpineda.human;

public class HumanTest {

	public static void main(String[] args) {
		Human subzero = new Human();
		Human scorpion = new Human();
		
		System.out.println(subzero.getHealth());
		System.out.println(subzero.getIntelligence());
		System.out.println(scorpion.getHealth());
		System.out.println(subzero.getIntelligence());

		subzero.attack(scorpion);
		System.out.println(subzero.getHealth());
		System.out.println(scorpion.getHealth());
	}

}
