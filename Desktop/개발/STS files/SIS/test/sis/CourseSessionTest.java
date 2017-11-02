package sis;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import coursesession.CourseSession;
import coursesession.Student;

public class CourseSessionTest {
	   @Test
	    public void enroll() throws Exception {
	        CourseSession session = new CourseSession("ENGL", "101");
	        Student firstStudent = new Student("재성");
	        session.enroll(firstStudent);
	        assertEquals(1, session.getNumberOfStudents());
	        ArrayList<Student> allStudents = session.getAllStudents();
	        assertEquals(1, allStudents.size());
	        assertEquals(firstStudent, allStudents.get(0));

	        Student secondStudent = new Student("주한");
	        session.enroll(secondStudent);
	        assertEquals(2, session.getNumberOfStudents());
	        assertEquals(2, allStudents.size());
	        assertEquals(firstStudent, allStudents.get(0));
	        assertEquals(secondStudent, allStudents.get(1));
	    }
}
