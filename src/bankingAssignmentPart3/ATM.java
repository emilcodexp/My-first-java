package bankingAssignmentPart3;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM extends BankingRules {

	private int maxAttempt = 3;
	private int attempts = 0;
	public double totalFundsAvailable;
	final int transactionLimit = 3;

	public ATM(double totalFundsAvailable) {
		this.totalFundsAvailable = totalFundsAvailable;
	}

	@Override
	public int dailyWithdrawalLimit() {
		return 3000;

	}

	ArrayList<Double> transactions = new ArrayList<>();

	@Override
	public void noOfTransactions() {

		System.out.println("You have reached maximum number of transaction allowed for today.");
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

	public void changePinPassword(int pin) {

		System.out.println("Please enter your new pin");
		int newPin = sc.nextInt();

		if (newPin == pin) {
			System.out.println("Entered pin is same as old pin , please choose different one");
			changePinPassword(pin);
		} else if (newPin < 1000) {
			System.out.println("pin must be in 4 digits");
			changePinPassword(pin);
		} else {
			System.out.println("Congratultions your pin has been successfully updated ");

		}

	}

	Scanner sc = new Scanner(System.in);

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

					double amountWithdrawn = totalFundsAvailable -= withdrwalAmount;
					transactionCount++;

					transactions.add(amountWithdrawn);

					System.out.println("Current Balance is : " + amountWithdrawn);
					countinueExit();
				}
			}
		}
		System.out.println("Your daily transaction limit is reached");
	}

	public boolean validatePin(int pinEntered, int pin) {

		boolean isValidated = false;
		while (!isValidated) {
			System.out.println("Please enter your pin number :");
			pinEntered = sc.nextInt();

			if (pin == pinEntered) {
				isValidated = true;

			}

			else {

				attempts++;

				System.out.println("Invalid pin.Try again!!");
				if (attempts < maxAttempt) {
					System.out.println("Do you like to reset pin: 'Y' (yes) OR 'N'(no)");
					String option = sc.next();
					if (option.equalsIgnoreCase("y")) {
						changePinPassword(pin);
					}
				}

				else {
					System.out.println("Account locked. Too many incorrect attempts.");

				}

			}
		}
		return isValidated;
	}

	public void deposit() {

		System.out.println("Enter the amount you like to deposit ");

		double amount = sc.nextDouble();

		System.out.println("Current Balance is : " + (totalFundsAvailable += amount));

		deposit();
	}
}
