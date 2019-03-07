package com.romellpineda.zookeeper;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla dk = new Gorilla();
		Gorilla buck = new Gorilla();
		
		dk.startSleeping();
		System.out.println(buck.climb());
		System.out.println(buck.climb());
		System.out.println(buck.throwSomething());
		
		System.out.println("__dk__");
		System.out.println(dk.displayEnergy());
		System.out.println(dk.isSleeping());
		
		System.out.println("__buck__");
		System.out.println(buck.displayEnergy());
		buck.eatBananas();
		System.out.println(buck.displayEnergy());
	}

}
