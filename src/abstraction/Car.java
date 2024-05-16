package abstraction;

public abstract class Car extends Vehicles {

	public Car(String name, String model, double price) {
		super(name, model, price);
		
	}

		public void displaySpecification() {
			System.out.println("Front Wheel Drive "+name);
			System.out.println("Four Wheel Drive");
			System.out.println("Automatic/Manual");
		
	
	}

	
	
}
