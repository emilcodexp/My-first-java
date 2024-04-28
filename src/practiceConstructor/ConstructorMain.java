package practiceConstructor;

import java.util.Scanner;

public class ConstructorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ConstructorExample acc = new ConstructorExample("5660", 1234);
		// acc.setUserName("user");
		acc.setPassword("123user");
		acc.setPin(1234);
		System.out.println("Enter which operation you want");
		String user = sc.next();
		boolean isUserValidate = false;
		switch (user) {
		case "atm":
			isUserValidate = acc.isvalid("5660", 1234);

			break;
		case "online":
			isUserValidate = acc.isvalid("5660", "123user");

			break;

//		default:
//			System.out.println("invalid credentials");
//			break;
		}
//		for(boolean isValidInput=false;!isValidInput) {
//		if (isUserValidate) {
//			System.out.println("your balance is : " + acc.getBalance());
//		} else {
//			System.out.println("invalid details");
//			sc.next();
//		}
//
//	}
	}
}
