package loginAccount;

import java.util.Scanner;

public class UserLoginClass {
	/*
	 * ) Write a program which takes username and password from user via console and
	 * compares it with a user name and password saved in your class. Saved user id
	 * and password are as below
	 * 
	 * UserId pivotAdmin password Admin123
	 * 
	 * If the username and password entered by user matches with the one saved in
	 * your class, then print “You are logged in to the application“ other wise
	 * print “Incorrect User id or password.Try again”. Also a user gets 3 chances
	 * enter the correct user name and password. If the user enters incorrect user
	 * name or password more than 3 times then print “ Account locked”
	 * 
	 */

	Scanner sc = new Scanner(System.in);

	String[] usercredentials = { "User", "pivotAdmin", "Admin123" };

	public void userInput() {
		System.out.println("Enter your Username:");
		String user = sc.next();

		System.out.println("Enter your Password:");
		String pass = sc.next();

		if (user.equals(usercredentials[1]) && pass.equals(usercredentials[2])) {

			System.out.println("You are logged into the application");

		} else
			for (int i = 0; i < 3; i++)

			{
				System.out.println("Incorrect User Id or Password. Plz Try again!!");
			}

		System.out.println("Account locked");
	}
}
