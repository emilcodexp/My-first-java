package bankingAssignmentPart2;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {

		PersonAccount person1 = new PersonAccount("4566679", "Emil", 1000);

		person1.setPin(1234);

		person1.setOnlineBankingPassword("user123");

		Scanner sc = new Scanner(System.in);
		boolean countinue = true;
		while (countinue) {
			System.out.println("Welcome to Banking Operations,");
			System.out.println("===============================");
			System.out.println("[1] ATM");
			System.out.println("[2] Online Banking");
			System.out.println("[3] Balance");
			System.out.println("[4] Reset Pin/Password");
			System.out.println("[5] EXIT");
			int options = sc.nextInt();

			switch (options) {
			case 1:
				BankOperations atm = new ATM(person1.getTotalFundsAvailable());
				if (atm.validatePin(person1.getPin(), person1.getPin())) {
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
				if (online.validatePassword(person1.getOnlineBankingPassword(), person1.getOnlineBankingPassword())) {
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

				BankOperations atm1 = new ATM(person1.getTotalFundsAvailable());
				if (atm1.validatePin(person1.getPin(), person1.getPin())) {
					System.out.println("Current balance is: " + person1.getTotalFundsAvailable());
				} else {
					System.out.println("Invalid pin");
				}

				break;
			case 4:
				System.out.println("Enter |1| for PIN reset or enter |2| for PASSWORD reset");
				int user = sc.nextInt();
				BankOperations atm2 = new ATM(user);
				BankOperations online2 = new OnlineBanking(user);
				if (user == 1) {

					atm2.changePinPassword();
				} else if (user == 2) {
					online2.changePinPassword();

				} else {
					System.out.println("Invalid Operation!!");
				}
				sc.close();
				break;
			case 5:
				countinue = false;
				System.out.println("You successfuly exited the application.Thank you");
				break;
			default:

				System.out.println("Invalid Operation");

				break;
			}
		}
	}

}
