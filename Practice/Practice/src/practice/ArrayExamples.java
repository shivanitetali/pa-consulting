package practice;

import java.util.ArrayList;

public class ArrayExamples
{

	public static void main(String[] args) 
	{
		ArrayExamples arrayExamples = new ArrayExamples();
		arrayExamples.addStringToArrayList();

	}

	public void addStringToArrayList()
	{
		ArrayList<String> listOfStuff = new ArrayList<String>();
		listOfStuff.add("Good");
		listOfStuff.add("Morning");
		listOfStuff.add("Shivani,");
		listOfStuff.add("It's Friday");
		
		//will print size as 2 as it has good and morning
		System.out.println("size of Array: " + listOfStuff.size());
		
		//will print the 2 values in the array individually
		for ( int index = 0; index < listOfStuff.size(); index++)
		{
			String indexValue = listOfStuff.get(index);			
			System.out.println("value of string: " + indexValue);
		}
	}
	
}

	