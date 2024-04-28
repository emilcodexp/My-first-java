package functionsAssignment;

import java.util.Scanner;

//Q1) Create a function that counts the number of syllables a word has. Each syllable is separated with a dash
//Examples
//numberSyllables("buf-fet") ➞ 2
//numberSyllables("beau-ti-ful") ➞ 3
//numberSyllables("mon-u-men-tal") ➞ 4
//numberSyllables("on-o-mat-o-poe-ia") ➞ 6
public class CountSyllables {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word : ");
		String word = sc.next();

		char[] vowells = { 'a', 'e', 'i', 'o', 'u' };
		char[] charArray = word.toCharArray();

		int syllable = 0;
		for (int i = 0; i < charArray.length; i++) {
			if ((word.charAt(i) == vowells[0]) || (word.charAt(i) == vowells[1]) || (word.charAt(i) == vowells[2])
					|| (word.charAt(i) == vowells[3]) || (word.charAt(i) == vowells[4]))

			{
				syllable++;
			}

		}
		System.out.println("Total number of syllables in the word " + word + " is: " + syllable);
	}

}
