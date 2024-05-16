package functionsAssignment;

import java.util.Scanner;

public class MainPrefixSuffix {

	public static void main(String[] args) {
		PrefixSuffix result = new PrefixSuffix();

		Scanner sc = new Scanner(System.in);
		System.out.println("Prefix Or Suffix");
		String word = sc.next();

		if (word.equals("prefix")) {
			System.out.println("Enter the word : ");
			String wordPrefix = sc.next();
			System.out.println("Enter the Prefix : ");
			String prefix = sc.next();
			System.out.println(result.isPrefix(wordPrefix, prefix));
		}

		else if (word.equals("suffix")) {
			System.out.println("Enter the word : ");
			String wordSuffix = sc.next();
			System.out.println("Enter the Suffix : ");
			String Suffix = sc.next();
			System.out.println(result.isSuffix(wordSuffix, Suffix));
		} else {
			System.out.println("invalid statement");
		}
		sc.close();
	}
}
