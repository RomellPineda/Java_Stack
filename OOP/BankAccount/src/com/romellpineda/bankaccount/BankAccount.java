package com.romellpineda.bankaccount;
import java.util.Random;

public class BankAccount {
	private String accountNumber = makeAccount();
	private double checkBalance;
	private double savingsBalance;
	private static int numberOfAccounts;
	private static double totalBalance;
	
	public BankAccount(String accountNumber, double checkBalance, double savingsBalance) {
		super();
		this.accountNumber = accountNumber;
		this.checkBalance = checkBalance;
		this.savingsBalance = savingsBalance;
	}
	
	private String makeAccount() {
		String String = "";
		Random r = new Random();
		String s = java.lang.String.valueOf(r.nextInt(9));
		for (int i = 0; i < 10; i++) {
			String.concat(s);
		}
		return String;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getCheckBalance() {
		return checkBalance;
	}

	public void setCheckBalance(double checkBalance) {
		this.checkBalance = checkBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public static void setNumberOfAccounts(int numberOfAccounts) {
		BankAccount.numberOfAccounts = numberOfAccounts;
	}

	public static double getTotalBalance() {
		return totalBalance;
	}

	public static void setTotalBalance(double totalBalance) {
		BankAccount.totalBalance = totalBalance;
	}

}
