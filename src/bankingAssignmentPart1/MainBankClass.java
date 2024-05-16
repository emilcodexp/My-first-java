package bankingAssignmentPart1;

import java.util.Scanner;

public class MainBankClass {

	public static void main(String[] args) {
		PersonAccount person1 = new PersonAccount("4566679", "Emil", 1000);

		PersonAccount.setPin(1234);
		PersonAccount.setOnlineBankingPassword("user123");

		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println(
				"Welcome Banking Operations, Please Enter 1 for ATM or 2 for Online Banking to continue or 3 to view balance");
		int options = sc.nextInt();

		switch (options) {
		case 1:
			BankOperations atm = new ATM(person1.getTotalFundsAvailable());

			if (person1.validatePin(person1.getPin())) {

				System.out.println("For Deposit enter 'd' and for withdrawal enter 'w' .");
				String userInput1 = sc.next();

				if (userInput1.equals("w")) {

					atm.withdraw();
				} else if (userInput1.equals("d")) {
					atm.deposit();

				}
			}
			break;
		case 2:
			BankOperations online = new OnlineBanking(person1.getTotalFundsAvailable());

			if (person1.validatePassword(person1.getOnlineBankingPassword())) {
				System.out.println("For Deposit enter 'd' and for withdrawal enter 'w' .");
				String userInput2 = sc.next();
				if (userInput2.equals("w")) {
					online.withdraw();
				} else if (userInput2.equals("d")) {
					online.deposit();

				}
			}
			break;
		case 3:
			System.out.println("Enter pin to view balance :");
			int pinEntered = sc.nextInt();
			if (person1.validatePin(pinEntered)) {
				System.out.println("Current balance is: " + person1.getTotalFundsAvailable());
			} else {
				System.out.println("Invalid pin");
			}

			break;
		default:
			System.out.println("Invalid Operation");

			break;
		}
		sc.close();
	}
}
