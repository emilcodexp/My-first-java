package functionsAssignment;

import java.util.Scanner;

public class RemoveFirstLastCharcter {

	public static void main(String[] args) {

//Q3. Create a function that removes the first and last characters from a string.
//Example : removeFirstLast("hello") ➞ "ell"
//removeFirstLast("a") ➞ "a"

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = sc.next();
		word.substring(word.length());
		System.out.println(word.substring(1, word.length() - 1));
		sc.close();

	}

}
