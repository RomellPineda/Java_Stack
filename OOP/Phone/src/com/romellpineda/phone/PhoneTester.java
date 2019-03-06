package com.romellpineda.phone;

public class PhoneTester {
	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("S9", 99, "Verizon", "ring ring");
		IPhone ten = new IPhone("X", 100, "AT&T", "zing");

		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		ten.displayInfo();
		System.out.println(ten.ring());
		System.out.println(ten.unlock());
	}

}
