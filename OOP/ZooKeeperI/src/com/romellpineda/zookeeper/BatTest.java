package com.romellpineda.zookeeper;

public class BatTest {

	public static void main(String[] args) {
		Bat reggie = new Bat();
		System.out.println(reggie.getEnergy());
		System.out.println(reggie.fly());
		System.out.println(reggie.attackGotham());
		reggie.eatFruit();
		System.out.println(reggie.attackGotham());
		System.out.println(reggie.attackGotham());
		reggie.eatFruit();
		System.out.println(reggie.fly());
		System.out.println(reggie.getEnergy());
	}

}
