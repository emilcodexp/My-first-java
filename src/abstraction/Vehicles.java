package abstraction;

public abstract class Vehicles {
	protected String name;
	protected String model;
	protected double price;

	public Vehicles(String name, String model, double price) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
	}

	public void displaySpecification() {
		System.out.println("Four Wheel Drive");

	}

	public abstract void method();

}
