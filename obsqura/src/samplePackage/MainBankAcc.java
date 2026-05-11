package samplePackage;

public class MainBankAcc {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.withdraw(50);
		System.out.println("Balance after withdrawal: " + b.getBalance());
		b.getBalance();
		
		b.deposit(300);
		System.out.println("Balance after deposit: " + b.getBalance());

	}
}
