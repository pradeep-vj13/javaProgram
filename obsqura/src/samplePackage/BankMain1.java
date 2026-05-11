package samplePackage;

public class BankMain1 {

	public static void main(String[] args) {
		BankSystem bs = new BankSystem();
		bs.withdrawMoney();
		Bank ba = new Bank();
		ba.withdrawMoney();
		Atm at = new Atm();
		at.withdrawMoney();

	}

}
