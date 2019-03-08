package com.romellpineda.calculator;

public class Calculator {
	private double rslt;
	private double numberOne;
	private double numberTwo;
	private String operation;
	
	public Calculator() {
		this.rslt = 0;
		this.numberOne = 0;
		this.numberTwo = 0;
		this.operation = "";
		
	}
	
	public void setOperandOne(double num) {
		this.numberOne = num;
	}
	
	public void setOperandTwo(double num) {
		this.numberTwo = num;
	}
	
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public void performOperation() {
		if (this.operation.equals("+") == true) {
			this.rslt = this.numberOne + this.numberTwo;
		} else if (this.operation.equals("-") == true) {
			this.rslt = this.numberOne - this.numberTwo;
		} else if (this.operation.equals("*") == true) {
			this.rslt = this.numberOne * this.numberTwo;
		} else if (this.operation.equals("/") == true) {
			this.rslt = this.numberOne / this.numberTwo;
		} else {
			System.out.println("Operation not supported");
		}
		this.numberOne = 0;
		this.numberTwo = 0;
		this.operation = "";
	}
	
	public double getRslt() {
		return this.rslt;
	}
}
