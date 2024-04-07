package licenseTypes;

public class MainLicenseIssueClass {

	public static void main(String[] args) {
		IssuedLicenses cl = new IssuedLicenses();
		cl.ageOfPerson = 16;
		cl.g1 = 10;
		cl.g = 20;
		cl.isEligibleForG1();
		cl.isEligibleForG2();
		cl.isEligibleForG();

	}

}
