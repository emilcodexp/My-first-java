package studyTutorial;

public class SampleStudy {

	String name = "Emil Sunny";

	int studId = 23;

	int subject1 = 90;
	int subject2 = 80;
	int subject3 = 85;

	int total = 0;



	void name() {
		System.out.println("Student name : " + name);
	}
//total marks 

	void totalmarks() {
		total = subject1 + subject2 + subject3;
		System.out.println(total);
	}

}
