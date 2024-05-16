package bankingAssignmentPart1;

import java.util.Scanner;

public class ATM extends BankOperations {

	Scanner sc = new Scanner(System.in);
	
	public double totalFundsAvailable;

	public ATM(double totalFundsAvailable) {
		this.totalFundsAvailable = totalFundsAvailable;
	}

	public void withdraw() {
		System.out.println("Enter the amount you like to withdraw");
		double withdrwalAmount = sc.nextDouble();
		if (withdrwalAmount > totalFundsAvailable) {
			System.out
					.println("Insufficient fund!!Your balance amount is only :" + totalFundsAvailable);
			System.out.println("Try again!!");
			withdraw();
		} else if (withdrwalAmount < 1) {
			System.out.println("Please enter amount greater than 0");
		} else if (withdrwalAmount < totalFundsAvailable) {
			System.out.println("Current Balance is : " + (totalFundsAvailable - withdrwalAmount));
		} else {
			System.out.println("Invalid pin");
			withdraw();
		}
	}
	
	public void deposit() {
		
			System.out.println("Enter the amount you like to deposit ");

			double depositAmount = sc.nextDouble();
			depositAmount += totalFundsAvailable;
			System.out.println("Current Balance is : " + (depositAmount));

			deposit();
		
		}
	public  void viewBalance() {
		
				System.out.println("Available Balance  : " + totalFundsAvailable);
			}
	
	}
