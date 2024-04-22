package studentDetail;

public class StudentGradeClass {

	String studentName;
	int rollNo;
	int age;
	char grade1;
	char grade2;
	char grade3;
public StudentGradeClass(String name,int studentAge,char g1, char g2, char g3) {
	studentName=name;
	age=studentAge;
	grade1=g1;
	grade2=g2;
	grade3=g3;
	
}

	public String getStudentName() {
		return studentName;
	}

	public int getRollNumber() {
		return rollNo;
	}

	public int getAgeOfStudent() {
		return age;
	}

	public char getGrade1() {
		return grade1;
	}

	public char getGrade2() {
		return grade2;
	}

	public char getGrade3() {
		return grade3;
	}
	public boolean verfiyStudent(String enteredName, int enteredRollNumber) {
		if(studentName.equals(enteredName)) {
			if(rollNo==enteredRollNumber) {
				return true;
			}
		}
		return false;
	}

	public StudentGradeClass getStudentDetails(String enteredName, int enteredRollNumber,
			StudentGradeClass[] namesOfStudents) {
		
		for (int i = 0; i < namesOfStudents.length; i++) {
			if (namesOfStudents[i].getStudentName().equals(enteredName)) {
				if (namesOfStudents[i].rollNo == enteredRollNumber) {
					return namesOfStudents[i];
				}
			}
		}
		return null;
	}
	public void displayStudentDetails () {
		System.out.println("Student Name :"+ getStudentName());
		System.out.println("Student number :"+ getRollNumber());
		System.out.println("Student age :"+ getAgeOfStudent());
		System.out.println("Grade from subject 1 :"+ getGrade1());
		System.out.println("Grade from subject 2 :"+ getGrade2());
		System.out.println("Grade from subject 3 :"+ getGrade3());
	}

}
