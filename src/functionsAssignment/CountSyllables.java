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
		
	String word = "beau-ti-ful";
    char syllable = '-';
	    int count = countOccurrences(word, syllable);

	  
		System.out.println("Number of syllables is " + count );
	}

		 public static int countOccurrences(String word, char syllable) {
		        int count = 0;
		        for (int i = 0; i < word.length(); i++) {
		            if (word.charAt(i) == syllable) {
		                count++;
		            }
	        }
		        return count+1;
		    }
		
	}


