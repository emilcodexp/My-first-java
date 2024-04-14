package rideOccupancy;

import java.util.Scanner;

public class RideOccupancyLimits {

	/*
	 * Q1) In Amusement park, a ride can carry max 10 people. Write a code to help
	 * the operator from overfilling the ride i.e more than 10 people should not be
	 * allowed to get on the ride. Also ensure that the people getting on the ride
	 * meets the height criteria , Height of person should be greater than 90 cm but
	 * less than 200 cm.
	 */

	Scanner sc = new Scanner(System.in);
	int min = 90;
	int max = 200;

	public void peopleAllowedInRide() {
		System.out.println("Welcome to the ride, Please enter your height");
		for (int i = 0; i <= 10; i++) {
			System.out.println("Please enter your height");
			int height = sc.nextInt();
			if ((height < min) || (height > max)) {
				System.out.println("Sorry!!Your height is not matched with our allowed height limit");

			} else {

				System.out.println("Your height is " + height + "cm. Enjoy the ride");
			}
			if(i==10) {
				System.out.println("Ride is full");
			}
		}
	}
}
