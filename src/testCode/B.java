package testCode;

import java.util.ArrayList;

public class B extends A {

	ArrayList<String> names = new ArrayList<>();
	String name;

	public B(ArrayList<String> names, String name) {
		super();
		this.names = names;
		this.name = name;
	}

	@Override
	public void display1() {
		System.out.println("this method is of class b");

	}

	public void method3() {
		System.out.println("this is method 3");
	}

	public String check(String enteredName) {
		for (String name : names) {
			if (enteredName.equals(name)) {
				return name;
			}

		}

		return null;

	}

}
