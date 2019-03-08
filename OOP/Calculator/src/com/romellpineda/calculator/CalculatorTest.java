package com.romellpineda.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.setOperandOne(10.2);
		c.setOperandTwo(5.7);
		c.setOperation("+");
		c.performOperation();
		System.out.println(c.getRslt());
	}

}
