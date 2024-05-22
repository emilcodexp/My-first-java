package schoolManagementAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		School school = new School();

		Scanner sc = new Scanner(System.in);

		ArrayList<String> coursesTaught = new ArrayList<String>();
		coursesTaught.add("Biology, Chemistry");
		ArrayList<String> coursesTaught1 = new ArrayList<String>();
		coursesTaught1.add("Physics, Mathematics");

//teacher's list
		school.addTeacher(new Teacher("Alice", 45, "Female", "1102", 20000, coursesTaught, null));
		school.addTeacher(new Teacher("Listin", 40, "Male", "1002", 25000, coursesTaught1, null));

// Student lists
		school.addStudents(new Student("Koby", 20, "Male", "100", 80));
		school.addStudents(new Student("Lissy", 21, "Female", "102", 60));

		System.out.println("|<><><><><><><><<><><><><<><><<>><<><><><><><><><><><><>><><><><><><><><><><><>|");
		System.out.println(" Welcome to Springfield High School Stream Allocation and Teacher Rating System!");
		System.out.println();

		System.out.println("Please enter Student name :");
		String name = sc.next();

		Student studentName = school.checkStudentName(name);
		if (studentName != null) {

			System.out.println("Please enter Student age :");
			int age = sc.nextInt();
			System.out.println("Please enter Student Gender :");
			String gender = sc.next();
			System.out.println("Please enter Student academic percentage :");
			double percentage = sc.nextDouble();

			Student student = new Student(name, age, gender, gender, percentage);

			System.out.println("-- Stream Allocation Result --");
			System.out.println();
			System.out.println(
					"Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Academic Percentage: " + percentage);
			student.determineStream();

		} else {
			System.out.println("Entered name not found in the list.Try again");
		}

		System.out.println();
		System.out.println("Please enter the teacher's name you wish to rate ");

		String nameEntered = sc.next();
		Teacher teacherName = school.checkTeacherName(nameEntered);
		if (teacherName != null) {
			System.out.println("Please enter your rating for " + nameEntered + "(1-5): ");
			Double rating1 = sc.nextDouble();

			Student stud = new Student(null, 0, null, null, rating1);
			stud.rateTeacher(teacherName, rating1);

			System.out.println();
			System.out.println("-- Updated Teacher Rating --");
			System.out.println("Teacher: " + nameEntered);

			double avgRating = teacherName.calculateAverageRating();
			System.out.println("New Average Rating: " + avgRating);
			sc.close();
		} else {
			System.out.println("Entered name not found in the list.Try again");
		}
	}

}
