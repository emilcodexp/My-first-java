package finalSample;

final public class FinalKeyword extends AnotherClass{

	String color = "red";
	int num1 = 20;
	int num2 = 20;
	int sum=0;

	final public  void value() {
		
		sum = num1 + num2;
		System.err.println(sum);
	}
	public void getPin() {
		System.out.println("getPin");
	}
	

}
