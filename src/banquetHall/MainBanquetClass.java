package banquetHall;

import java.util.Scanner;

public class MainBanquetClass {

	public static void main(String[] args) {
		System.out.println("Welcome To Banquet Booking , Please fill in the details to see your Final bill");

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the cost of booking : ");
		double bookingCost = sc.nextDouble();

		System.out.println("Please enter cost of food : ");
		double foodCost = sc.nextDouble();

		System.out.println("Please enter the cost of Beverages : ");
		double beveragesCost = sc.nextDouble();

		System.out.println("Please enter the tip amount : ");
		double tipEntered = sc.nextDouble();

		System.out.println("Please enter number of guests : ");
		double noOfGuests = sc.nextDouble();

		Banquet finalCost = new Banquet();
		System.out.println("Your base cost before taxes is :$ "
				+ finalCost.getBaseCost(bookingCost, foodCost, beveragesCost, tipEntered));

		double afterTax = finalCost.calculatetax(finalCost.totalBaseCost);
		System.out.println("Your total tax is :$ " + afterTax);

		double servCess = finalCost.calculateCess(finalCost.totalBaseCost, finalCost.noOfGuests);
		System.out.println("Your total Service cess is :$ " + servCess);

		double finalbl = finalCost.CalculateTheTotalCost(finalCost.totalBaseCost, finalCost.totalTax,
				finalCost.serviceCess);
		System.out.println("Your tfinal bill is : " + finalbl);
		
	}

}
