package studyTutorial;

public class MainClass11 {

	public static void main(String[] args) {

		// Name of student

		SampleStudy sampleStudy = new SampleStudy();
		sampleStudy.name();

// marks scored in each subjects
		int markOfSubject1 = sampleStudy.subject1;
		System.out.println("Subject 1 : " + markOfSubject1);

		int markOfSubject2 = sampleStudy.subject2;
		System.out.println("Subject 2 : " + markOfSubject2);

		int markOfSubject3 = sampleStudy.subject3;
		System.out.println("Subject 3 : " + markOfSubject3);
		

//total values of subject
		System.out.print("Total Marks Scored :");
		sampleStudy.totalmarks();

	}

}
