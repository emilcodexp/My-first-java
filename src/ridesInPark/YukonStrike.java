package ridesInPark;

public class YukonStrike {
	double hieght;
	double weight;

	void isPersonEligibleForRideY() {

		if ((hieght >= 5.0) && (weight >= 55))
			System.out.println("You are Eligible for the ride");

		else

			System.out.println("Sorry!! Not Eligible for the ride");

	}
}