package newPackJava;

public class RentalAgency {

	String name = "ABC Ltd.";

	int house1 = 2000;
	int house2 = 2500;
	int house3 = 3000;

	int totalincome;

	void income() {
		totalincome = house1 + house2 + house3;
		System.out.println(totalincome);

	}
}
