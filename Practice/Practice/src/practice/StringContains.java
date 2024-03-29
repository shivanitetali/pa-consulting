package practice;

import java.util.ArrayList;

public class StringContains 
{

	public static void main(String[] args) 
	{
		StringContains letters = new StringContains();
		letters.containString();
		letters.removeString();
		letters.addString();
		letters.isEmpty();
		
	}
	
	//checks if the string contains the specified letters
	public void containString()
	{
		ArrayList<String> listOfStuff = new ArrayList<String>();
		listOfStuff.add("Good");
		listOfStuff.add("Morning");
		listOfStuff.add("Shivani,");
		listOfStuff.add("It's Friday");
		System.out.println("size of Array: " + listOfStuff.size());
		
		System.out.println(listOfStuff.contains("Good"));
	}
	
	//removes the specified word from the array list
	public void removeString()
	{
		ArrayList<String> listOfStuff = new ArrayList<String>();
		listOfStuff.add("Good");
		listOfStuff.add("Morning");
		listOfStuff.add("Shivani,");
		listOfStuff.add("It's Friday");
		System.out.println("size of Array: " + listOfStuff.size());
		
		//removes the boolean back to the main method,
		listOfStuff.remove("Good");	
		
		//removes and gives the array list size as 3, as Good will be removed
		System.out.println("size of Array: " + listOfStuff.size());
	}
	
	//add the word in the array list
	public void addString()
	{
		ArrayList<String> listOfStuff = new ArrayList<String>();
		listOfStuff.add("Good");
		listOfStuff.add("Morning");
		listOfStuff.add("Shivani,");
		listOfStuff.add("It's Friday");
		System.out.println("size of Array: " + listOfStuff.size());
			
		//add the boolean back to the main method,
		listOfStuff.add("Happy");	
			
		//add and gives the array list size as 5, as Hapy will be added to the array list
		System.out.println("size of Array: " + listOfStuff.size());
	}
	
	//empty array list
	public void isEmpty()
	{
		ArrayList<String> listOfStuff = new ArrayList<String>();
		listOfStuff.add("Good");
		listOfStuff.add("Morning");
		listOfStuff.add("Shivani,");
		listOfStuff.add("It's Friday");
		System.out.println("size of Array: " + listOfStuff.size());
				
		//checks if the array list is empty
		listOfStuff.isEmpty();
			
	}
}
