package bankingAssignmentPart2;

import java.util.Scanner;

public class ATM extends BankOperations {
	public double totalFundsAvailable;

	public ATM(double totalFundsAvailable) {
		this.totalFundsAvailable = totalFundsAvailable;
	}

	Scanner sc = new Scanner(System.in);

	public boolean validatePin(int pinEntered, int pin) {

		System.out.println("Please enter your pin number :");
		pinEntered = sc.nextInt();
		if (pin == pinEntered) {
			return true;
		} else {

			System.out.println("Invalid Pin. Try again!!");
			return false;
		}
	}

	public void withdraw() {

		System.out.println("Enter the amount you like to withdraw");

		double withdrwalAmount = sc.nextDouble();
		if (withdrwalAmount > totalFundsAvailable) {
			System.out.println("Insufficient fund!!Your balance amount is only :" + totalFundsAvailable);
			System.out.println("Try again!!");
			withdraw();
		} else if (withdrwalAmount < 1) {
			System.out.println("Please enter amount greater than 0");
		} else if (withdrwalAmount < totalFundsAvailable) {
			System.out.println("Current Balance is : " + (totalFundsAvailable - withdrwalAmount));
		}
	}

	public void deposit() {

		System.out.println("Enter the amount you like to deposit ");

		double depositAmount = sc.nextDouble();
		depositAmount += totalFundsAvailable;
		System.out.println("Current Balance is : " + (depositAmount));

		deposit();
	}

	@Override
	public void changePinPassword() {
		int pin = 0;
		System.out.println("Please enter new pin");
		int newPin = sc.nextInt();
		if (newPin == pin) {
			System.out.println("Entered pin is same as old pin , please choose different one");
			changePinPassword();
		} else if (newPin < 1000) {
			System.out.println("pin must be in 4 digits");
			changePinPassword();
		} else {
			System.out.println("Congratultions your pin has been successfully updated ");

		}

	}

}
