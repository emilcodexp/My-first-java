package functionsAssignment;

public class PrefixSuffix {

//	Q5) Create two functions: isPrefix(word, prefix-) and isSuffix(word, -suffix).
//	isPrefix should return true if it begins with the prefix argument.
//	isSuffix should return true if it ends with the suffix argument.
//	Otherwise return false.
//	 
//	Examples : isPrefix("automation", "auto-") ➞ true
//	isSuffix("arachnophobia", "-phobia") ➞ true
//	isPrefix("retrospect", "sub-") ➞ false
//	isSuffix("vocation", "-logy") ➞ false

	public boolean isPrefix(String enteredWord, String prefix) {

		if (enteredWord.startsWith(prefix)) {
			return true;
		}

		return false;
	}

	public boolean isSuffix(String enteredWord, String suffix) {
		if (enteredWord.endsWith(suffix)) {
			return true;
		}
		return false;

	}

}
