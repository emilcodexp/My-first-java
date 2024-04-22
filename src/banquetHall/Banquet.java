package banquetHall;

public class Banquet {

	/*
	 * -> Banquet Hall Question Write a program to get complete bill at a Banquet
	 * hall by creating a class named Banquet. The class Banquet takes base cost for
	 * booking banquet hall, cost of food, beverages, taxes on food, taxes on
	 * beverage and tip as an attribute.
	 * 
	 * There should be 4 methods,
	 * 
	 * • First method calculateBaseCost() should calculate base cost on the basis of
	 * base booking cost, cost of food,tip and beverage. This method should accept 3
	 * arguments(base cost, food cost, beverage cost and tip) and return the value
	 * of total base cost.
	 * 
	 * • Second method calculatetax() should calculate tax on base cost and returns
	 * the value of tax. You can keep tax percentage as per your wish. This method
	 * takes return value of the method calculateBaseCost() as its input parameter
	 * and on the basis of input parameter, it calculates tax on base cost.
	 * 
	 * • Third Method calculateCess() tax should calculate the Cess as per below
	 * condition Depending upon the number of guests, another tax which is known as
	 * service cess is calculated as follow: 1: Less than or equal to 40 guests,
	 * cess is 4% of the total bill before taxes 2: More than 40 and up to 80
	 * guests, cess is 8% of the total bill before taxes. 3: For more than 80 and
	 * less than 150 guests, cess is 10% of the total bill before taxes. 4: For more
	 * than 150 guests, cess will be 12.5% of the total bill before taxes. 1. This
	 * method will take 2 parameters, first is number of guests and second parameter
	 * is the return value of the method calculateBaseCost() as its input parameter.
	 * On the basis of 2 input it calculate Cess tax.
	 * 
	 * • Last method CalculateTheTotalCost() will calculate the total cost of
	 * booking banquet hall and it takes 3 input as parameter. All 3 parameters are
	 * the return value of following methods 2. calculateBaseCost() 3.
	 * calculatetax() 4. calculateCess() Finally, print the total cost in
	 * CalculateTheTotalCost() method. Note: Keep the main method class as separate
	 * and 'Banquet' class separate, use object of Banquet class to access its
	 * methods and attributes. Take all inputs through scanner Only.
	 */
	int noOfGuests;
	double bookingCost;
	double foodCost;
	double beverageCost;

	double tip;
	double totalTax;
	double serviceCess;
	double totalBaseCost;
	double totalCost;

	public double getBaseCost(double bookingCost, double foodCost, double beverageCost, double tip) {
		this.totalBaseCost = bookingCost + foodCost + beverageCost + tip;
		return totalBaseCost;
	}

	public double calculatetax(double totalBaseCost) {
		this.totalTax = totalBaseCost * .05;
		return totalTax;
	}

	public double calculateCess(double totalBaseCost, int noOfGuests) {
		if (noOfGuests <= 40) {
			this.serviceCess = totalBaseCost * .04;

		}

		else if (noOfGuests > 40 || noOfGuests <= 80) {
			this.serviceCess = totalBaseCost * .08;

		}

		else if (noOfGuests > 40 || noOfGuests <= 80) {
			this.serviceCess = totalBaseCost * .08;

		} else if (noOfGuests > 80 || noOfGuests <= 150) {
			this.serviceCess = totalBaseCost * .10;

		} else if (noOfGuests > 150) {
			this.serviceCess = totalBaseCost * .125;

		}
		return serviceCess;
	}

	public double CalculateTheTotalCost(double totalBaseCost, double totalTax, double serviceCess) {

		this.totalCost = totalBaseCost + totalTax + serviceCess;
		return totalCost;
	}

}
