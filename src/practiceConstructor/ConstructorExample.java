package practiceConstructor;

public class ConstructorExample {

	private String accuNumber;
	private double balance = 5000;
	private String password;
	private int pin;

	public ConstructorExample(String accuNumber, int pin) {
		super();

		this.accuNumber = accuNumber;

		this.pin = pin;
	}

	public String getAccuNumber() {
		return accuNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public boolean isvalid(String accuNumber, int pinEntered) {
		if (accuNumber.equals(accuNumber) && (pin == pinEntered)) {
			return true;
		}
		return false;
	}

	public boolean isvalid(String accuNumber, String passwordEmtered) {
		if (accuNumber.equals(accuNumber) && (password.equals(passwordEmtered))) {
			return true;
		}
		return false;
	}

}
