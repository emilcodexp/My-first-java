package studentDetail;



public class MainGradeClass {

	public static void main(String[] args) {
StudentGradeClass grade=new StudentGradeClass("Alex",25,'A','B','C');
		
System.out.println(grade.getStudentName());

		StudentGradeClass sam = new StudentGradeClass("Sam",26,'B','D','A');
		System.out.println(sam.getAgeOfStudent());

		StudentGradeClass drake = new StudentGradeClass("Drake Denso",25,'A','B','C');
		System.out.println(drake.getStudentDetails(null, 0, null));

	

	
			

	
		}
	
	}


