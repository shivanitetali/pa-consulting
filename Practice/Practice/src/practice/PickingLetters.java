package practice;

/**
 * Given a non-empty string and an int N, return the string made starting with char 0,
 * and then every Nth char of the string.
 * So if N is 3, use char 0, 3, 6,... and so on. N is
 * 
 * everyNth("Miracle", 2) is "Mrce"
 * everyNth("abcdefg", 2) is "aceg"
 * everyNth("abcdefg", 2) is "adg"
 *  * 
 * @author tet19171871
 *
 */
public class PickingLetters 
{

	public static void main(String[] args)
	{
		//created instance to call the method
		PickingLetters pickingLetters = new PickingLetters();
		String outcome = pickingLetters.everyNth("Miracle", 2);
		System.out.println(outcome);
		
		String outcome1 = pickingLetters.everyNth("abcdefg", 2);
		System.out.println(outcome1);
		
		String outcome2 = pickingLetters.everyNth("abcdefg", 3);
		System.out.println(outcome2);
		
		if(outcome.equals("Mrce") && outcome1.equals("aceg") && outcome2.contentEquals("adg"))
		{
			System.out.println("Successfull");
		}
		else
		{
			System.out.println("Not Successfull");
		}
	}
		
	

//	//returns information to the main method and returns the result
//	public String everyNth(String word, int pickNumber)
//	{
//		String newString = "";
//		
//		//index++ returns every char in the specified word
//		//for ( int index = 0; index < word.length(); index++)
//		
//		//index = index +2
//		//for ( int index = 0; index < word.length(); index+=2)
//		for ( int index = 0; index < word.length(); index+=pickNumber)
//		{
//			System.out.println(word.charAt(index));
//			
//			//+= is adding the letter on to the index to the string
//			newString += word.charAt(index);
//			System.out.println(newString);
//			
//		}
	
	public String everyNth(String word, int pickNumber)
	{
		String newString = "";
		for(int i = 0; i < word.length(); i = i+pickNumber)
		{
			newString = newString + word.charAt(i);
		}
	
	
	return newString;
	}


}
