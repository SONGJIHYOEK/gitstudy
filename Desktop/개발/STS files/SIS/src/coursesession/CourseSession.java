package coursesession;

import java.util.ArrayList;

public class CourseSession {

	ArrayList<Student> Enroll = new ArrayList<>();
	ArrayList<Student> Subject= new ArrayList<>();
	ArrayList<Student> department= new ArrayList<>();
	public CourseSession(String string, String string2) {		
	}

	public Object getDepartment() {
		return null;
	}

	public Object getNumber() {
		return null;
	}

	public int getNumberOfStudents() {
		return Enroll.size();
	}

	public void enroll(Student Student) {
	Enroll.add(Student);
	}

	public ArrayList<Student> getAllStudents() {
		return Enroll;
	}
}
