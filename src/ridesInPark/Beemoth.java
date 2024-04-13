package ridesInPark;

public class Beemoth {
	double hieght;
	double weight;

	void isPersonEligibleForRideB() {

		if ((hieght >= 4.9) && (weight >= 45))

			System.out.println("You are Eligible for the ride");
		else
			System.out.println("Sorry!! Not Eligible for the ride");

	}
}
