package discountCalc;

public class ProductDiscounts {

	/*
	 * Write a program that calculates discount applied on a product. Criteria are
	 * as below 50% discount is applied on all products. If any of the following
	 * promo codes are applied then add the additional discount and calculate the
	 * final discounted value// Promo Code// Discount //Promo5 -5% Promo10 -10%
	 * Promo20 -20%
	 */

	int priceOfProduct;
	double discountOnProduct;
	double promo5;
	double promo10;
	double promo20;
	double discountRecieved;

	void totalDiscountWithPromo5() {

		discountRecieved = priceOfProduct * promo5;
		System.out.println("Final discounted value after 5 % dicount = " + discountRecieved);
	}

	void totalDiscountWithPromo10() {

		discountRecieved = priceOfProduct * promo10;
		System.out.println("Final discounted value after 10 % dicount = " + discountRecieved);
	}

	void totalDiscountWithPromo20() {

		discountRecieved = priceOfProduct * promo20;
		System.out.println("Final discounted value after 20 % dicount = " + discountRecieved);
	}
}