package practice;

public class Student
{
	private String name;
	private int age;
	
	//same for all the students
	public static String course = "Engineering";
	
	public static int numberOfStudents;
	//if we take away static,it complains that we are returning the instance
	//public  int numberOfStudents;
	
		public Student(String name, int age)
		{
			//variables
			this.name = name;
			this.age = age;
						
			//variable
			numberOfStudents++;
		}

		//getters and setters
		public String getName() 
		{
			return name;
		}

		public void setName(String name) 
		{
			this.name = name;
		}

		public int getAge()
		{
			return age;
		}

		public void setAge(int age) 
		{
			this.age = age;
		}

		//to use static variables
		public static int getNumberOfStudents() 
		{
			//if static is removed at line 10, then it complains here that its an instance
			return numberOfStudents;
		}

		public static void setNumberOfStudents(int numberOfStudents) 
		{
			Student.numberOfStudents = numberOfStudents;
		}
	
}
