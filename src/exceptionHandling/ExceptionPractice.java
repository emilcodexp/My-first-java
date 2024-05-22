package exceptionHandling;

import java.io.IOException;

public class ExceptionPractice {
	public static void name() throws IOException {
		String s = "emil";
		System.out.println(s.length());

	}

	public static void printThis(String name) throws Exception {
		if (name == null) {
			throw new Exception("this is not accepted");
		} else {
			System.out.println(name);
		}

	}

	public static void main(String[] args) {
		try {
			name();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("print this");
		}

		try {
			printThis(null);
		} catch (Exception e) {
			System.out.println("invalid");
		}

	}

}
