package discountCalc;



public class MainDiscountsClass {

	public static void main(String[] args) {

		ProductDiscounts pd = new ProductDiscounts();
		pd.priceOfProduct = 500;
		pd.discountOnProduct = 0.50;
		pd.promo5 = 0.55;
		pd.promo10 = 0.60;
		pd.promo20 = 0.70;
		pd.totalDiscountWithPromo5();
		pd.totalDiscountWithPromo10();
		pd.totalDiscountWithPromo20();
	}

}

