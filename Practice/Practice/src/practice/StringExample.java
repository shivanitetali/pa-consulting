package practice;

public class StringExample 
{
	public static void main(String[] args)
	{
		//below are the instance
		StringExample examples = new StringExample();
		examples.firstCharacter();
		examples.startCharacter();
		examples.endsCharacter();
		examples.subCharacter();
		examples.containString();
		examples.indexString();
		examples.splitString();
		examples.containString();
		examples.upperString();
		examples.lowerString();
	}
	
	public void firstCharacter()
	{
		String name = "shivani";
		char letter = name.charAt(2);
		//below will throw index out of range exception
		//char letter = name.charAt(8);
		
		System.out.println(letter);
	}

	//finds if the name starts with the specified character and prints the if condition	
	public void startCharacter()
	{
		String name = "shivani";
		//will not print, as the String starts with sh and not sr
		boolean startWith = name.startsWith("sr");
		if(startWith)
		{
			System.out.println("it starts with the character");
		}
	}
				
	//finds if the name ends with the specified character and prints the if condition	
	public void endsCharacter()
	{
			String name = "shivani";
			//will print ni as the string ends with ni
			boolean endsWith = name.endsWith("ni");
			if(endsWith)
			{
				System.out.println("it ends with the character");
			}
		
	}
	
	//finds out the character at the index 2 and 4
	public void subCharacter()
	{
		String name = "shivani";
		String subCharacter = name.substring(2, 4);
		System.out.println( subCharacter);
	}
	
	//if the name contains the characters specified it will print it contains
	public void containString()
	{
		String name = "shivani";
		boolean contains  = name.contains("iv");
		if(contains)
		{
			System.out.println("it contains");
		}
		
	}
	
	// gives the index number at the start of the specified character
	public void indexString()
	{
		String name = "shivani";
		int index = name.indexOf("an");
		System.out.println("Index of " + index);
	}
	
	//gives the number of words after each space
	public void splitString()
	{
		String sentence = "I am studying";
		String[] strings = sentence.split(" ");
		//System.out.println("Length is " + strings.length);
		
		//prints the memory address of the strings
		System.out.println("Length is " + strings);
		
		//to access each object in a specified array
		for(int index = 0; index < strings.length; index++)
		{
			System.out.println(strings[index]);
			
			//it won't do this as there are only 3 words and so will throw index out of bound array
			//System.out.println(strings[4]);
		}
		
	}
	
	// setting the string to upper case
		public void upperString()
		{
			String sentence = "i am shivani";
			sentence = sentence.toUpperCase();
			System.out.println("upper case sentence: " + sentence);
		}
		
	// setting the string to lower case
		public void lowerString()
		{
			String sentence = "i am shivani";
			sentence = sentence.toLowerCase();
			System.out.println("lower case sentence: " + sentence);
		}
}
