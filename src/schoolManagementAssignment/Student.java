package schoolManagementAssignment;

public class Student extends Person {

	private String studentID;
	private double percentage;

	public Student(String name, int age, String gender, String studentID, double percentage) {
		super(name, age, gender);
		this.studentID = studentID;
		this.percentage = percentage;

	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Academic Percentage: " + percentage;
	}

	public String getStudentID() {
		return studentID;
	}

	public double getPercentage() {
		return percentage;
	}

	@Override
	public String describeRole() {
		String role = "Student";
		return role;

	}

	public void determineStream() {

		if (percentage >= 85 && percentage <= 100) {
			System.out.println("Allocated Stream: Non-medical");
			System.out.println(this.name + " can enroll in courses like Physics and Mathematics");
		} else if (percentage >= 75 && percentage <= 85) {
			System.out.println("Allocated Stream: Medical");
			System.out.println(this.name + " can enroll in courses like Biology, Chemistry");
		} else if (percentage >= 65 && percentage <= 75) {
			System.out.println("Allocated Stream: Commerce");
			System.out.println(this.name + " can enroll in courses like Economics, Business Studies");
		} else if (percentage < 65 && percentage >= 1) {
			System.out.println("Allocated Stream: Arts");
			System.out.println(this.name + " can enroll in courses like History, Literature");
			
		} else {
			System.out.println("Invalid Enrty.Try again");
		}

	}

	public void rateTeacher(Teacher teacher, double rating) {
		if (rating >= 1 && rating <= 5) {
			teacher.addRating(rating);

			System.out.println("Rating added: " + rating);

		} else {
			System.out.println("Invalid entry. Please enter a number between 1 and 5.");
		}
	}

}
