package functionsAssignment;

public class returnCity {

	public static void main(String[] args) {
//		
//		Q2) Write a function to return the city from each of these vacation spots.
//				As shown in example below you have to extract Munich, Portland..etc. 
//				Hint: City will always be present in last square brackets in the statement..
//				Examples 
//				grabCity("[Last Day!] Beer Festival [Munich]") ➞ "Munich"
//				grabCity("Cheese Factory Tour [Portland]") ➞ "Portland"
//				grabCity("[50% Off!][Group Tours Included] 5-Day Trip to Onsen [Kyoto]") ➞ "Kyoto"

		String grabCity1 = "[Last Day!] Beer Festival [Munich]";
		String grabCity2 = "Cheese Factory Tour [Portland]";
		String grabCity3 = "[50% Off!][Group Tours Included] 5-Day Trip to Onsen [Kyoto]";

		System.out.println(grabCity1.substring(grabCity1.indexOf("M") -1));
		System.out.println(grabCity2.substring(grabCity2.indexOf("P") - 1));
		System.out.println(grabCity3.substring(grabCity3.indexOf("K") - 1));
	}

}
