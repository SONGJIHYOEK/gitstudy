package sis;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import coursesession.Student;

public class Student_test {
	 @Test
	    public void create() {
	        final String firstStudentName = "�缺";
	        Student student = new Student(firstStudentName);
	        Assert.assertEquals(firstStudentName, student.getName());

	        final String secondStudentName = "����";
	        Student secondStudent = new Student(secondStudentName);
	        Assert.assertEquals(secondStudentName, secondStudent.getName());

	        Assert.assertEquals(firstStudentName, student.getName());
	    }
}