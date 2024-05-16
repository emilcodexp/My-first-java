package herarchySample;

public class Main {

	public static void main(String[] args) {

		// creating an Object of TwoWheeler class
		TwoWheeler bike = new TwoWheeler();
		// creating an Object of FourWheeler class
		FourWheeler car = new FourWheeler();

		// getting the base price of the vehicle
		bike.showPrice();
		// modifying the base price of the bike
		// by referring to the base price of the vehicle.
		bike.finalPrice();

		// getting the base price of vehicle
		car.showPrice();
		// modifying the car's base price by referring to the vehicle's base price.
		car.finalPrice();
	}

}
