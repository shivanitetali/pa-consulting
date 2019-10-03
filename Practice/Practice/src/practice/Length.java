package practice;

/**
 * Given a string of odd length,
 * return the string length 3
 * from its middle,so "Candy" yields "and"
 * The string length will be at least 3.
 * 
 * middleThree("Candy") "and"
 * middleThree("and") "and"
 * middleThree("solving") "lvi"
 * 
 * @author tet19171871
 *
 */
public class Length
{

	public String middleThree(String str)
	{
		//the length is odd 
		int length =  str.length() / 2;
		//System.out.println(length);
		
		String newString = str.substring(length -1, length + 2);
		//System.out.println(length);
		
		//System.out.println(newString);
		return newString;
	}
}

