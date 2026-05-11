package samplePackage;

public class BankAccount {

	private double balance = 100000;

	public void deposit(double amount) {

		balance = balance + amount;
		System.out.println("Deposited: " + amount);
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawn: " + amount);

		}
	}

	public double getBalance() {
		return balance;

	}

}
