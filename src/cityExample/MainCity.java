package cityExample;

import java.util.Arrays;
import java.util.Scanner;

public class MainCity {

	public static void main(String[] args) {
		// String cityName=new String();

		String[] cityName1 = { "Ottawa", "Halifax", "Qubec", "Toronto", "Winnepeg", "Edmonton", "Regina", "Victoria" };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city name");
		String cityname = sc.next();
		sc.close();
		boolean isCityEnteredCorrect = false;
		for (int i = 0; i < cityName1.length; i++) {

			if (cityname.equals(cityName1[i])) {
				// isCityEnteredCorrect = true;
				System.out.println("this is a capital of province");
		
				//break;
			}
			else if(isCityEnteredCorrect) {
				System.out.println("this is not a capital of province");
			
				//break;
			}

			

		}
//		String first = "Ghost Rider";
//		String[] last = first.split(" ");
//		System.out.println(last[0]);
//		System.out.println(last[1]);
//		char[] charcterArray = first.toCharArray();
//		System.out.println(Arrays.toString(charcterArray));
//		System.out.println();
//		String name = "Van Helsing";
//		name.replace("Van", "Lan");
//
//		System.out.println(name.replace("Van", "Lan"));
//		System.out.println(name.indexOf("n"));
//		String email = "testmail@gmail.com";
//		System.out.println(email.indexOf("@"));
//		System.out.println(email.indexOf("m"));
//		email.substring(8, 17);
//		System.out.println(email.substring(email.indexOf("@") + 1));
//		if (email.contains("@")) {
//			System.out.println("Email is valid");
//		} else {
//			System.out.println("Email is not valid");
//		}
	}

}
