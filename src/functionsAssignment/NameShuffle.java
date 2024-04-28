package functionsAssignment;

public class NameShuffle {

	public static void main(String[] args) {
		
//		Q4) Create a method that accepts a string (of a person's first and last name) and 
//		returns a string with the first and last name swapped.
//				Examples
//				nameShuffle("Donald Trump") ➞ "Trump Donald"
//				nameShuffle("Seymour Butts") ➞ "Butts Seymour"
		
		String nameShuffle="Trump Donald";
		String[] charArray=nameShuffle.split(" ");
		System.out.println(charArray[1]+" "+charArray[0]);

	}

}
