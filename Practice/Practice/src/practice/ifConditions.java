package practice;

public class ifConditions 
{
	// variables
	private int a = 4;
	private int b = 5;
	private boolean result;
	
	public static void main(String[] args)
	{
		//if there is no method here ,then the console will not print anything
		//date type is ifConditions which will print results of all the Conditions
		//variable is ifConditions
		ifConditions ifConditions = new ifConditions();
		ifConditions.printConditions();
		
		//this method is for the forCondition which will print the index 
		//variable is forCondition
		ifConditions.forConditions();
		
		//this method is for the Shivani which will print my name is Shivani
		//variable is Shivani
		ifConditions.Shivani();
		
		//this method is for the decrement which will print from 10-0 
		//variable is decrement
		ifConditions.decrement();
		
		//this method is for the while Conditions which will print from 0-4
		//variable is whileConditions
		ifConditions.whileConditions();
		
		//ifConditions.whileConditions1();
		
		//ifConditions.Strings();
		
		ifConditions.doWhileCondition();

	}
	
	//while statement keeps printing until the condition is true in the while and stops printing when its false and have met the condition
	public void doWhileCondition()
	{
		int index = 0;
		do {
			System.out.println("doWhileCondition: " + index);
			index++;
			}
			//while(index < 5);
			while(index < 0);
	}
	
	//will print 0-4
	public void whileConditions()
	{
		int i = 0;
		while (i < 5)
		{
			System.out.println("whileConditions: " + i);
			i++;
		}
	}
	
	 
//	//commented out : this method will print Strings continously until we stop the console as the condition will always be true
//	public void Strings()
//	{
//		String name = "shivani";
//		String name1 = "shivani";
//		while (name == name1)
//		{
//			System.out.println("Strings are equal");
//		}
//	}
	
//	////commented out :this method will keep printing number until we stop the console 
//		public void whileConditions1()
//		{
//			int i = 0;
//			i++;
//			while (true)
//			{
//				System.out.println("whileConditions1: " + i);
//				i++;
//			}
//		}
	
	//Shivani method
	public void Shivani()
	{
			System.out.println("my name is Shivani");
	}
	
	//forCondition for which will print index from 0-10
	public void forConditions()
	{
		for(int index = 0; index <= 10; index++)
		{
			System.out.println("index: " + index);
		}
	}
	
	//decrement for which will print index from 10-0
		public void decrement()
		{
			for(int index = 10; index >= 0; index--)
			{
				System.out.println("index: " + index);
			}
		}
			
	//will print all the conditions
	public void printConditions()
	{
		if (a == b)
		{
			System.out.println("A equals B");
		}
		else
		{
			System.out.println("A is not equal to B");
		}
		
		if (a < b)
		{
			System.out.println(("A is less than B"));
		}
		else
		{
			System.out.println("A is not less than B");
		}
		
		if (a > b)
		{
			System.out.println(("A is greater than B"));
		}
		else
		{
			System.out.println("A is not greater than B");
		}
		
		if (a <= b)
		{
			System.out.println(("A is less than or equal to  B"));
		}
		else
		{
			System.out.println("A is not less than or equal to B");
		}
		
		if (a >= b)
		{
			System.out.println(("A is greater than or equal to  B"));
		}
		else
		{
			System.out.println("A is not greater than or equal to B");
		}
		
		if (a != b)
		{
			System.out.println(("A is not equal to  B"));
		}
		else
		{
			System.out.println("A is equal to B");
		}
		
		if (a > b || a < b)
		{
			System.out.println(("A is greater than B"));
		}
		else
		{
			System.out.println("A is less than B");
		}
		
		if (3 < a && a < 6)
		{
			System.out.println(("3 is less than A and A is less than 6"));
		}
		else
		{
			System.out.println("3 is not less than A and A is not less than 6");
		}
		
		if (!result)
		{
			System.out.println(("A is greater than or equal to  B"));
		}
		else
		{
			System.out.println("A is not greater than or equal to B");
		}
		
		//another way of writing the if condition
		if (a < b)
		{
			System.out.println(("A is less than B"));
		}
		
		//always need to have an else if condition
		else if (a > b)
		{
			System.out.println(("A is greater than B"));
		}
		
		//another way of writing the if condition 
		//will not work if (!a < b), it has to be in brackets
		//below statement will not execute as the first if is false and the second if is false
		if (!(a < b))
		{
			System.out.println(("A is less than B"));
		}
				
		//always need to have an else if condition
		else if (a > b)
		{
			System.out.println(("A is greater than B"));
		}
		
	}
	
	
	
}
