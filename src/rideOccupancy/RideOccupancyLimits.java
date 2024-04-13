package rideOccupancy;

public class RideOccupancyLimits {

	int[] heightOfPeople = { 90, 80, 100, 200, 250, 60, 100, 60, 40, 190 };

	public void amuzementPark() {

		for (int x = 0; x <= 10; x++) {

			if (x == 10) {
				System.out.println("Maximum Occupancy Reached");
			}
		}
		for (int a = 0; a < heightOfPeople.length; a++) {
			if (heightOfPeople[a] < 90) {
				System.out.println("Minimum Height needs to be 90 cm");
			} else if (heightOfPeople[a] > 200) {
				System.out.println("Maximum Height allowed is 200 cm");
			}

		}
	}
}
