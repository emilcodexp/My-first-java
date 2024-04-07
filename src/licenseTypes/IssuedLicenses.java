package licenseTypes;

public class IssuedLicenses {
	/*
	 * Ontario license authority checks for two things to issue a license, first is
	 * the age of person and the current level (G1 or G2 or G) . Assume different
	 * values for these two values and write code which will print, whether license
	 * will be used to the person or not and if the license is issued, which type of
	 * license the person will get i.e. whether he will get a G1 or G2 or G.
	 */

	int ageOfPerson;
	int g1;
	int g2;
	int g;

	void isEligibleForG1() {

		if (ageOfPerson >= 16) {
			System.out.println("G1");
		} else {
			System.out.println("Must be 16 years old");
		}
	}

	void isEligibleForG2() {

		if (g1 == 10) {
			System.out.println("Eligible for G2");
		} else {
			System.out.println("Not Eligible");
		}
	}

	void isEligibleForG() {

		if (g1 == 20) {
			System.out.println("Eligible for G");
		} else {
			System.out.println("Not Eligible");
		}
	}
}
