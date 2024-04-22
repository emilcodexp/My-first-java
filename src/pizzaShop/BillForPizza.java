package pizzaShop;

import java.util.Scanner;
/*
 * Write a program to prepare the bill for a pizza shop.Assume an order and work out the final bill.
  Take the Cheese Pizza prices as: Small Pizza: $15, Medium Pizza: $20, Large Pizza: $25
For additional pepperoni topping: Pepperoni for Small Pizza: +$2, Pepperoni for Medium or 
Large Pizza: +$3
Extra cheese for any size pizza: + $1
For eg: If the Pizza is medium, pepperoni with extra cheese the program should
 calculate the final bill as 20+3+1 = $24 and print as “Your final bill is $24”
 */

public class BillForPizza {
	int priceOfPepS = 2;
	int priceOfPepL = 3;
	int priceOfSPizza = 15;
	int priceOfMPizza = 20;
	int priceOfLPizza = 25;
	int cheesePrice = 1;

	Scanner sc = new Scanner(System.in);
	

	void finalBillForPizza() {

		System.out.println("Enter the pizza you want");

		String pizzaType = sc.next();

		switch (pizzaType) {
		case "smallpizza":
			System.out.println("Prize is $15");
			System.out.println("Do you need extra topping");
			String extra = sc.next();

			if (extra.equals("yes")) {
				System.out.println("Your final price is : $" + (priceOfSPizza + priceOfPepS + cheesePrice));
			} else {
				System.out.println("your final price is : $" + priceOfSPizza);
			}

			break;
		case "mediumpizza":
			System.out.println("Prize is $20");
			System.out.println("Do you need extra topping");
			String extra1 = sc.next();
			if (extra1.equals("yes")) {
				System.out.println("Your final price is : $" + (priceOfMPizza + priceOfPepL + cheesePrice));
			} else {
				System.out.println("your final price is : $" + priceOfMPizza);
			}

			break;
		case "largepizza":
			System.out.println("Prize is $25");
			System.out.println("Do you need extra topping");
			String extra2 = sc.next();
			if (extra2.equals("yes")) {
				System.out.println("Your final price is : $" + (priceOfLPizza + priceOfPepL + cheesePrice));
			} else {
				System.out.println("your final price is : $" + priceOfLPizza);
			}

			break;
		default:
			System.out.println("Invalid Item please enter the pizza type");
			break;
		}
	}

}
