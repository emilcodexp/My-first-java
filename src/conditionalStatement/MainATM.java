package conditionalStatement;

public class MainATM {

	public static void main(String[] args) {

		ATM atm = new ATM();
		atm.balance = 2589.9;
		atm.amountEntered = 3000;
		atm.overdraft = 2000;

		atm.isBalanceEnoughAndvalidationOfPin();
	}

}
