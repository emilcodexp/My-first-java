package newPackJava;

public class RentalExpenses {

	String name = "Rental Expenses";
	int maintenanace = 1000;
	int electricity = 800;
	int expenses;

	void sumOfDebt() {
		expenses = maintenanace + electricity;
		System.out.println(expenses);
	}

}
