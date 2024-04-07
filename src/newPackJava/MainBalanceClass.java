package newPackJava;

public class MainBalanceClass {

	public static void main(String[] args) {

		RentalAgency ag = new RentalAgency();

		String nameOfCompany = ag.name;
		System.out.println(nameOfCompany);

		System.out.print("Total Income Earned = ");
		ag.income();

		RentalExpenses re = new RentalExpenses();

		System.out.print("Total Expenses = ");
		re.sumOfDebt();

	}
}
