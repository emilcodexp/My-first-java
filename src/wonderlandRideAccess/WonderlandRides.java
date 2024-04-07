package wonderlandRideAccess;

public class WonderlandRides {
	int age;
	double hieght;
	String name;

	boolean isAccessGranted;

	void entryForWaterCanyon() {
		isAccessGranted = ((age >= 13) && (hieght >= 4.5));
		if (isAccessGranted)
			System.out.println("Water Canyon : Access Granted ");
		else {
			System.out.println("Water Canyon : Not permitted");
		}
	}

	void enteryForRedBaraon() {
		isAccessGranted = ((age >= 15) && (hieght >= 5.5));
		if (isAccessGranted)
			System.out.println("Red Baron : Access Granted");
		else {
			System.out.println("Red Baron : Not permitted");
		}
	}

	void enteryForswingTime() {
		isAccessGranted = ((age >= 18) && (hieght >= 3.5));
		if (isAccessGranted)
			System.out.println("Swing Time : Access Granted");
		else {
			System.out.println("Swing Time : Not permitted");
		}
	}
}
