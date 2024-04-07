package calculationNumbers;

public class NumberOperators {

	int a = 25;
	int b = 10;
	int result = 0;

	public void AddTwoNumbers() {
		result = a + b;
		System.out.println("Result of adding two numbers = " + result);
	}

	public void GetQuotientOfNumbers() {
		result = a / b;
		System.out.println("Quotient = " + result);

	}

	public void GetRemainderOfNumbers() {
		result = a % b;
		System.out.println("Remainder = " + result);
	}
}
