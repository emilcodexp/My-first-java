package ridesInPark;

public class MainRideClass {

	public static void main(String[] args) {
		Lyvithan lr = new Lyvithan();
		lr.hieght = 5.5;// ELIGIBLE VALUES SHOULD BE >=5.5 & 40
		lr.weight = 40;
		System.out.println("LYVITHAN RIDE");
		lr.isPersonEligibleForRideL();

		Beemoth bb = new Beemoth();
		bb.hieght = 4;// ELIGIBLE VALUES SHOULD BE >=4.9 & 45
		bb.weight = 50;
		System.out.println("BEEMOTH RIDE");
		bb.isPersonEligibleForRideB();

		YukonStrike ys = new YukonStrike();
		ys.hieght = 5;// ELIGIBLE VALUES SHOULD BE >=5.0 & 55
		ys.weight = 55;
		System.out.println("YUKON STRIKER");
		ys.isPersonEligibleForRideY();

	}

}
