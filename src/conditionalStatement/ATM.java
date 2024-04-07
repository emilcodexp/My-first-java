package conditionalStatement;

public class ATM {

	double balance;
	int amountEntered;
	double overdraft;
	int enteredPin;
	int validPin;
	boolean isPinValid;

	// if balance>amount entered customer can withdraw money

	void isBalanceEnoughAndvalidationOfPin() {
		isPinValid = enteredPin == validPin;
		if (isPinValid) {
			System.out.println("Pin is correct");
		}
		if ((balance > amountEntered) || (overdraft > amountEntered)) {
			System.out.println("customer can withdraw money");
		} else {
			System.out.println("Insufficient Balance");
		}
	}

}
