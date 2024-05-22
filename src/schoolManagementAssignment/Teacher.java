package schoolManagementAssignment;

import java.util.ArrayList;

public class Teacher extends Person {

	private String employID;
	private double salary;

	private ArrayList<String> coursesTaught = new ArrayList<String>();
	private ArrayList<Double> ratings = new ArrayList<Double>();
	private String name;

	public Teacher(String name, int age, String gender, String employID, double salary, ArrayList<String> coursesTaught,
			ArrayList<Double> ratings) {
		super(name, age, gender);
		this.name = name;
		this.employID = employID;
		this.salary = salary;
		this.coursesTaught = coursesTaught;
		this.ratings = new ArrayList<Double>();
	}

	@Override

	public String toString() {
		return "Name: " + name + ", employID: " + employID + ", salary: " + salary + ", Academic coursesTaught: "
				+ coursesTaught + ", ratings :" + ratings;
	}

	public String getName() {
		return name;
	}

	public String getEmployID() {
		return employID;
	}

	public double getSalary() {
		return salary;
	}

	public ArrayList<String> getCoursesTaught() {
		return coursesTaught;
	}

	@Override
	public String describeRole() {
		String role = "Teacher";
		return role;

	}

	public void addRating(double rating) {
		ratings.add(rating);
	}

	public double calculateAverageRating() {

		double sum = 0;
		for (double rating : ratings) {

			sum += rating;
		}

		return (double) sum / ratings.size();

	}

}
