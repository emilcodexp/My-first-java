package bankingAssignmentPart3;

import java.util.Scanner;

public class MainBank {

	public static void main(String[] args) {

		PersonAccount person1 = new PersonAccount("343423", "Emil Sunny", 5000);

		PersonAccount.setPin(1234);
		PersonAccount.setOnlineBankingPassword("user123");

		Scanner sc = new Scanner(System.in);

		boolean countinueOperation = true;
		while (countinueOperation) {
			System.out.println("Welcome to Banking Operations,");
			System.out.println("*****************************");
			System.out.println("[1] ATM");
			System.out.println("[2] Online Banking");
			System.out.println("[3] Balance");
			System.out.println("[4] EXIT ");
			int options = sc.nextInt();

			switch (options) {
			case 1:
				ATM atm = new ATM(person1.getTotalFundsAvailable());
				if (atm.validatePin(person1.getPin(), person1.getPin())) {
					System.out.println("For Deposit enter 'D' and for withdrawal enter 'W' .");
					String userInput1 = sc.next();
					if (userInput1.equalsIgnoreCase("w")) {
						atm.withdraw();
					} else if (userInput1.equalsIgnoreCase("d")) {
						atm.deposit();

					}
				}
				break;
			case 2:
				OnlineBanking online = new OnlineBanking(person1.getTotalFundsAvailable());
				if (online.validatePassword(person1.getOnlineBankingPassword(), person1.getOnlineBankingPassword())) {
					System.out.println("For Deposit enter 'D' and for withdrawal enter 'W' .");
					String userInput2 = sc.next();
					if (userInput2.equalsIgnoreCase("w")) {
						online.withdraw();
					} else if (userInput2.equalsIgnoreCase("d")) {
						online.deposit();

					}
				}

				break;

			case 3:
				ATM atm1 = new ATM(person1.getTotalFundsAvailable());
				System.out.println("Enter pin to view balance :");
				int pinEntered = sc.nextInt();
				if ((atm1.validatePin(pinEntered, person1.getPin()))) {
					System.out.println("Current balance is: " + person1.getTotalFundsAvailable());
				} else {
					System.out.println("Invalid pin");
				}

				break;
			case 4:
				System.out.println("You are exiting the application....");
				countinueOperation = false;
				sc.close();
				break;
			default:
				System.out.println("Invalid Operation");

				break;
			}

		}

	}

}
