package bankingAssignmentPart1;

import java.util.Scanner;

public class OnlineBanking extends BankOperations {
	Scanner sc = new Scanner(System.in);
	
public double totalFundsAvailable;

	
	public OnlineBanking(double totalFundsAvailable) {
		this.totalFundsAvailable = totalFundsAvailable;
	}
	
	public void withdraw() {
		
		
			System.out.println("Enter the amount you like to withdraw");

			double amount = sc.nextDouble();
			if (amount > totalFundsAvailable) {
				System.out.println("Insufficient balance please deposit.Your current balance is : "
						+ totalFundsAvailable);
				withdraw();
			} else if (amount < 1) {
				System.out.println("Please select amount greater than 0");
			} else if (amount < totalFundsAvailable) {

				System.out.println("Current Balance is : " + (totalFundsAvailable - amount));

			}
	
	}
	
	
	public void deposit() {
		
			System.out.println("Enter the amount you like to deposit ");

			double amount = sc.nextDouble();

			
			System.out.println("Current Balance is : " + (totalFundsAvailable + amount));
		
			deposit();
		}
	

	public void viewBalance() {
		
		System.out.println("Available Balance  : " + totalFundsAvailable);
	}
	
}
