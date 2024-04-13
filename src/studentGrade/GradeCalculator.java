package studentGrade;

public class GradeCalculator {

int score;

void isStudentPassed() {
	if (score>=60) {
		System.out.println("Passed");
	}else {
		System.out.println("Failed");
	}
}
}
