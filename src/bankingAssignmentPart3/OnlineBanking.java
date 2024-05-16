package bankingAssignmentPart3;

import java.util.Scanner;

public class OnlineBanking extends BankingRules {

	private int maxAttempt = 3;
	private int attempts = 0;
	public double totalFundsAvailable;
	final int transactionLimit = 3;

	public OnlineBanking(double totalFundsAvailable) {
		this.totalFundsAvailable = totalFundsAvailable;
	}

	@Override
	public int dailyWithdrawalLimit() {

		return 3000;
	}

	@Override
	public void noOfTransactions() {

	}

	Scanner sc = new Scanner(System.in);

	public void changePinPassword(String onlineBankingPassword) {

		System.out.println("Please enter new Password");
		String newPassword = sc.next();

		if (newPassword.equals(onlineBankingPassword)) {
			System.out.println("Entered password is same as old password , please choose different one.");
			changePinPassword(onlineBankingPassword);

		} else if (newPassword.length() < 8) {
			System.out.println("Your password should have minimum 8 characters. Try again");
			changePinPassword(onlineBankingPassword);

		} else if (newPassword.contains("&") || newPassword.contains("$") || newPassword.contains("@")) {
			System.out.println("Do not use these ('&','$',' @') special characters in your password. Try again");
			changePinPassword(onlineBankingPassword);

		} else {
			System.out.println("Congratulations!! New password has been updated");
		}

	}

	public boolean validatePassword(String onlineBankingPassword, String PasswordEntered) {

		boolean isValidated = false;

		while (!isValidated) {
			System.out.println("Please enter your Password :");
			PasswordEntered = sc.next();

			if (onlineBankingPassword.equals(PasswordEntered)) {
				isValidated = true;

			} else {

				attempts++;
				System.out.println("Invalid password. Try again!!");

				if (attempts < maxAttempt) {
					System.out.println("Do you like to reset pin: 'Y' (yes) OR 'N'(no)");
					String option = sc.next();

					if (option.equalsIgnoreCase("y")) {
						changePinPassword(onlineBankingPassword);

					} else {
						System.out.println("Account locked. Too many incorrect attempts.");
					}
				}
			}
		}

		return isValidated;

	}

	public void countinueExit() {
		System.out.println("Do you like to countinue/ Exit the Application? Yes / No >>");
		String userInput = sc.next();

		if (userInput.equalsIgnoreCase("Yes")) {
			withdraw();
		} else {
			System.out.println("You are exiting the Application...");
		}

	}

	public void withdraw() {
		int totalWithdrawal = 0;
		int transactionCount = 0;

		for (int i = 0; i < transactionLimit; i++) {
			if (transactionCount == transactionLimit) {
				System.out.println("Your daily transaction limit is reached");
			} else {
				System.out.println("Enter the amount you like to withdraw");

				double withdrwalAmount = sc.nextDouble();
				if (withdrwalAmount > dailyWithdrawalLimit() || totalWithdrawal > dailyWithdrawalLimit()) {
					System.out.println("Your daily limit is $3000 cannot withdraw more than that. ");
					withdraw();
				}

				else if (withdrwalAmount > totalFundsAvailable) {
					System.out.println(
							"Insufficient balance please deposit.Your current balance is : " + totalFundsAvailable);
					withdraw();

				} else if (withdrwalAmount < 1) {
					System.out.println("Please enter amount greater than 0");
					withdraw();
				} else if (withdrwalAmount < totalFundsAvailable) {

					System.out.println("Current Balance is : " + (totalFundsAvailable -= withdrwalAmount));
					countinueExit();
					transactionCount++;

				}
			}
		}
		System.out.println("Your daily transaction limit is reached");
	}

	public void deposit() {

		System.out.println("Enter the amount you like to deposit ");

		double amount = sc.nextDouble();

		System.out.println("Current Balance is : " + (totalFundsAvailable += amount));

		deposit();
	}

	public void viewBalance() {
		System.out.println("Available Balance  : " + totalFundsAvailable);
	}
}
