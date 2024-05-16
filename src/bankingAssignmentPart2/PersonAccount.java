package bankingAssignmentPart2;

import java.util.Scanner;

public class PersonAccount {
	Scanner sc = new Scanner(System.in);
	private static String bankAccNumber;
	private static String nameOfAccHolder;
	private static double totalFundsAvailable;
	private static int pin;
	private static String onlineBankingPassword;

	public PersonAccount() {
		super();
	}

	public PersonAccount(String bankAccNumber, String nameOfAccHolder, double totalFundsAvailable) {
		super();
		PersonAccount.bankAccNumber = bankAccNumber;
		PersonAccount.nameOfAccHolder = nameOfAccHolder;
		PersonAccount.totalFundsAvailable = totalFundsAvailable;
	}

	public int getPin() {

		return pin;
	}

	public void setPin(int pin) {
		PersonAccount.pin = pin;
	}

	public String getOnlineBankingPassword() {
		return onlineBankingPassword;
	}

	public void setOnlineBankingPassword(String onlineBankingPassword) {
		PersonAccount.onlineBankingPassword = onlineBankingPassword;
	}

	public String getBankAccNumber() {
		return bankAccNumber;

	}

	public String getNameOfAccHolder() {
		return nameOfAccHolder;
	}

	public double getTotalFundsAvailable() {
		return totalFundsAvailable;
	}

}