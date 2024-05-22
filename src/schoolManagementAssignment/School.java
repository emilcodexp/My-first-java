package schoolManagementAssignment;

import java.util.ArrayList;

public class School {

	public static final String schoolName = "Springfield High School";
	private String name;
	ArrayList<Student> studentLists = new ArrayList<Student>();
	ArrayList<Teacher> teachersLists = new ArrayList<Teacher>();

	public void addStudents(Student student) {
		studentLists.add(student);
	}

	public void addTeacher(Teacher teacher) {
		teachersLists.add(teacher);
	}

	public String getName() {
		return name;
	}

	public Student checkStudentName(String studName) {

		for (Student stud : studentLists) {
			if (stud.getName().equals(studName)) {
				return stud;
			}
		}
		return null;

	}

	public Teacher checkTeacherName(String teacherName) {

		for (Teacher teacher : teachersLists) {
			if (teacher.getName().equals(teacherName)) {
				return teacher;
			}
		}
		return null;

	}

}
