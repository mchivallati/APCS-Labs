package net.franklinps.chivallati.Tests;

/**
 * Created by CompSci-04 on 12/3/2014.
 */
//A Student object represents a student's data such as "Kelly, 17, 1.9"
//Your task is to encapsulate this file - make attributes/fields private
//and write public methods getStudentName, getAge, and getGPA to access
//those attributes.  Also write a toString() method that
//would print the data as above:  "Kelly, 17, 1.9"


public class Student
{
	private static String studentName;
	private static int studentAge;
	private static double studentGPA;


	public Student ( String name, int age, double gpa )
	{
		studentName = name;
		studentAge = age;
		studentGPA = gpa;
	}

	public static void main ( String[] args )
	{

		Student jane = new Student ( "Jane", 15, 4.1 );
		jane.toString ();

		System.out.println ( "Name: " + getStudentName () );
		System.out.println ( "Age: " + getStudentAge () );
		System.out.println ( "GPA: " + getStudentGPA () );


	}

	public static String getStudentName ()
	{

		return studentName;

	}

	public static int getStudentAge ()
	{

		return studentAge;

	}

	public static double getStudentGPA ()
	{

		return studentGPA;

	}

}