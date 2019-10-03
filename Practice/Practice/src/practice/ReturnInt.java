package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReturnInt 
{

	public static void main(String[] args) 
	{
		ReturnInt returnInt = new ReturnInt();
		int  outcome = returnInt.returnInt();
		System.out.println("the outcome was : " + outcome);
				
		String outcome1 = returnInt.returnString();		
		System.out.println("returnString outcome was : " + outcome1);
		
		int outcome2 = returnInt.returnMultipleInt(7,9);
		System.out.println("returnMultipleInt outcome was: " + outcome2);
		
		//to get the information of the array list we need to do a for loop to print each object in the array list
		ArrayList<String> outcome3 = returnInt.returnArrayList();
		for(int i = 0; i < outcome3.size(); i++)
		{
			outcome3.get(i);
			System.out.println("returnArrayList outcome was: " + outcome3);
		}
		
	}
	//method called returnInt that returns 41
	public int returnInt()
	{
		int i = 42;
		
		return i;
	}

	//method called returnString that returns "Hello World!"
	public String returnString()
	{
		String s = "Hello World!";
		
		return s;
	}
	
	//method called returnMultipleInt that takes 2parameters and returns answer of the ints multiplied
	public int returnMultipleInt(int i, int x)
	{
		return i * x;
					
	}
	
	//method called returnArrayList that returns an array list that contains 2 strings "hello" and "world"
	public ArrayList<String> returnArrayList()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		
		return list;
		
		//cannot put anything under return as the code will break after return
		//list.add("here");
					
	}
	
		
}
