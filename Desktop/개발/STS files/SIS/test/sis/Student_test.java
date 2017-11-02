package sis;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import coursesession.Student;

public class Student_test {
	 @Test
	    public void create() {
	        final String firstStudentName = "재성";
	        Student student = new Student(firstStudentName);
	        Assert.assertEquals(firstStudentName, student.getName());

	        final String secondStudentName = "주한";
	        Student secondStudent = new Student(secondStudentName);
	        Assert.assertEquals(secondStudentName, secondStudent.getName());

	        Assert.assertEquals(firstStudentName, student.getName());
	    }
}