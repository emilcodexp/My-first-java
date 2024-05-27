package nameGuessGame;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GuessName {

	private List<String> names = new ArrayList<>();

	private int wrongattempts = 0;
	private final int maxAttempts = 5;

	public void listOfNames() {
		try (Scanner sc = new Scanner(Paths.get("/Users/emilsunny111gmail.com/Desktop/NameGuess.txt"))) {

			while (sc.hasNext()) {
				names.add(sc.nextLine().toLowerCase());
			}

		} catch (Exception e) {
			System.out.println("Invalid file entry.");
			e.printStackTrace();
		}

	}

	public List<String> getNames() {

		return names;
	}

	public void guessTheName() {

		Random rand = new Random();

		String randomName = names.get(rand.nextInt(names.size()));

		System.out.println(randomName);

		List<Character> storedGuess = new ArrayList<>();

		System.out.println("");

		while (wrongattempts <= maxAttempts) {

			System.out.print("You are guessing: ");

			if (isNameCorrect(randomName, storedGuess)) {

				System.out.println();
				System.out.println();
				System.out.println("You won!! You've guessed correct name: " + randomName);

				break;
			}

			System.out.println();

			Scanner letterGuess = new Scanner(System.in);

			if (!hasPlayerGuess(letterGuess, storedGuess, randomName)) {

				System.out.println("You have guessed(" + wrongattempts + ") wrong letters: ");

				wrongattempts++;

			}
			if (wrongattempts > 5) {

				System.out.println();

				System.out.println("You lose!! Better luck next time. Correct name is : " + randomName);
			}

		}

	}

	private static boolean hasPlayerGuess(Scanner letterGuess, List<Character> letter, String randomName) {
		
		System.out.println();
		
		System.out.print("Guess a letter: ");

		String userInput = letterGuess.nextLine().toLowerCase();

		letter.add(userInput.charAt(0));

		return randomName.contains(userInput);

	}

	private static boolean isNameCorrect(String randomName, List<Character> letter) {

		int correctCount = 0;

		for (int i = 0; i < randomName.length(); i++) {

			if (letter.contains(randomName.charAt(i))) {

				System.out.print(randomName.charAt(i));

				correctCount++;

			} else {

				System.out.print("-");
			}

		}
		return randomName.length() == correctCount;
	}
}
