package ridesInPark;

public class Lyvithan {

	double hieght;
	double weight;

	void isPersonEligibleForRideL() {

		if ((hieght >= 5.5) && (weight >= 40))

			System.out.println("You are Eligible for the ride");

		else

			System.out.println("Sorry!! Not Eligible for the ride");

	}
}