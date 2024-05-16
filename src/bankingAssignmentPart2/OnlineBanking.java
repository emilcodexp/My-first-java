package bankingAssignmentPart2;

import java.util.Scanner;

public class OnlineBanking extends BankOperations {
	public double totalFundsAvailable;

	public OnlineBanking(double totalFundsAvailable) {
		this.totalFundsAvailable = totalFundsAvailable;
	}

	Scanner sc = new Scanner(System.in);

	@Override
	public void changePinPassword() {
		String onlineBankingPassword = null;
		System.out.println("Please enter new Password");
		String newPassword = sc.next();

		if (newPassword.equals(onlineBankingPassword)) {
			System.out.println("Entered password is same as old password , please choose different one.");
			changePinPassword();
		} else if (newPassword.length() < 8) {
			System.out.println("Your password should have minimum 8 characters. Try again");
			changePinPassword();
		} else if (newPassword.contains("&") || newPassword.contains("$") || newPassword.contains("@")) {
			System.out.println("Do not use these ('&','$',' @') special characters in your password. Try again");
			changePinPassword();
		} else {
			System.out.println("Congratulations!! New password has been updated");
		}

	}
	public boolean validatePassword(String onlineBankingPassword, String PasswordEntered) {
		System.out.println("Please enter your Password :");
		PasswordEntered = sc.next();
		if (onlineBankingPassword.equals(PasswordEntered)) {
			withdraw();
			return true;
		} else {
			System.out.println("Invalid password. Try again!!");

			return false;
		}
	}

	
	public void withdraw() {
		
			System.out.println("Enter the amount you like to withdraw");

			double amount = sc.nextDouble();
			if (amount > totalFundsAvailable) {
				System.out.println(
						"Insufficient balance please deposit.Your current balance is : " + totalFundsAvailable);
				withdraw();
			} else if (amount < 1) {
				System.out.println("Please select amount greater than 0");
			} else if (amount < totalFundsAvailable) {

				System.out.println("Current Balance is : " + (totalFundsAvailable - amount));

			}
		
	}

	public void deposit() {
		System.out.println("Welcome, please enter your Password");
		
			System.out.println("Enter the amount you like to deposit ");

			double amount = sc.nextDouble();

			// double deposit = sc.nextDouble() + person.getTotalFundsAvailable();
			System.out.println("Current Balance is : " + (totalFundsAvailable + amount));
		
	}
	

}
