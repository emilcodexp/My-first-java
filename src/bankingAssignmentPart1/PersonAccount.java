package bankingAssignmentPart1;

import java.util.Scanner;

public final class PersonAccount {
	Scanner sc=new Scanner(System.in);
	
	private  static String bankAccNumber;
	private  static String nameOfAccHolder;
	private  static double totalFundsAvailable;
	private  static int pin = 1234;
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

	public static void setPin(int pin) {
		PersonAccount.pin = pin;
	}

	public String getOnlineBankingPassword() {
		return onlineBankingPassword;
	}

	public static void setOnlineBankingPassword(String onlineBankingPassword) {
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

	public boolean validatePassword(String PasswordEntered) {
		System.out.println("Please enter your Password :");
		PasswordEntered= sc.next();
		if (PersonAccount.onlineBankingPassword.equals(PasswordEntered)) {
			return true;
		}else {
			System.out.println("Invalid password. Try again!!");
		
		return false;
	}
	}


	public boolean validatePin(int pinEntered) {
		
		System.out.println("Please enter your pin number :");
		 pinEntered =sc.nextInt();
		if (PersonAccount.pin == pinEntered) {
			return true;
		}
		else {
			
		System.out.println("Invalid Pin. Try again!!");
		return false;
	}
	}

	
}
