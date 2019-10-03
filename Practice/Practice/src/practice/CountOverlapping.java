package practice;

/**
 * Count the number of "xx" in the given string. XX is 2
 * countXX("abcxx") is 5
 * countXX("xxx") is 3
 * countXX("xxxx") is 4
 * @author tet19171871
 *
 */

public class CountOverlapping
{
	String s;
	
	public static void main(String[] args)
	{
		CountOverlapping countoverlapping = new CountOverlapping();
		int outcome = countoverlapping.countXX("abcxx");
		System.out.println(outcome);
		
		int outcome1 = countoverlapping.countXX("xxx");
		System.out.println(outcome1);
		
		int outcome2 = countoverlapping.countXX("xxxx");
		System.out.println(outcome2);
		
		if(outcome == 5 && outcome1 == 3 && outcome2 == 4)
		{
			System.out.println("it worked");
		}
		
	}

	public int countXX(String word)
	{
		return word.length();
		
	}
	
}
