package practice;

/**
 * static is part of the memory for the class not the object,even if the object is deleted the static remains
 * @author tet19171871
 *
 */
public class StudentEnrollment
{
	public static void main(String[] args) 
	{
		//instance to create 3 students 3 objects with 3 different information
		Student student1 = new Student("mary", 20);
		Student student2 = new Student("john", 22);
		Student student3 = new Student("harry", 23);
		
		//we can use the class Student and the variable name numberOfStudents, 
		//this is how a static is accessed,'Student.numberOfStudents' gives me access to the static method
		//in static you can call the method or you can call the variable,below statement calls the variable
		System.out.println(Student.numberOfStudents);
		
		//in static you can call the method or you can call the variable,below statement calls the method 
		System.out.println(Student.getNumberOfStudents());

	}

}

