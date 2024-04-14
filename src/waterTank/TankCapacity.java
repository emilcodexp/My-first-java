package waterTank;

import java.util.Scanner;

public class TankCapacity {
	/*
	 * Q2) There is a water tank of capacity 100 litres. Water is filled into it
	 * using bucket which have capacity of 10 litres. Write a program which fills
	 * the tank to its capacity using these buckets. Also include a mechanism in
	 * your program to stop the tank from over flowing.
	 */

	int bucketCapacity = 10;
	int tankCapacity = 100;
	Scanner sc = new Scanner(System.in);

	public void isTankFull() {
		System.out.println("Water tank is empty !!! Please add water");

		for (int i = 0; i <= 10; i++) {

			int waterLevel = sc.nextInt();

			if (waterLevel == 10) {
				System.out.println(  " Please add more water");
			} else {
				System.out.println("bucket limit should be 10 litres");
			}
			if (i==10) {
				System.out.println("Water tank is full, Do not add more water!!");
			}
		}
	}

}
