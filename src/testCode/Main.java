package testCode;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
//		B b = (B) new A();
//		b.method3();
//		b.display1();
//		b.display2();

		try (Scanner sc = new Scanner(System.in)) {
			names.add("Emil");
			names.add("Jose");
			names.add("Sachin");
			boolean countinue = true;
			while (countinue) {
				System.out.println("Enter your name:");
				String nameEntered = sc.next();
				B b = new B(names, nameEntered);

				String namee = b.check(nameEntered);
				if (namee == null) {
					System.out.println("Wrong input");
				} else {
					countinue = false;
					System.out.println("Welcome " + nameEntered);
				}
			}
		}
	}

}
