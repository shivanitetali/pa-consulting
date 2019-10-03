package practice;

/**
 * Given a string,return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxx" or
 * "xbadxx" but not "xxbadxx".
 * 
 * hasBad("badxx") true
 * hasBad("xbadxx") true
 * hasBad("xxbadxx") false
 * @author tet19171871
 *
 */
public class Bad
{
	
	public static void main(String[] args)
	{
		Bad bad = new Bad();
		
		boolean outcome = bad.hasBad("badxx");
		System.out.println(outcome);
		
		boolean outcome1 = bad.hasBad("xbadxx");
		System.out.println(outcome1);
		
		boolean outcome2 = bad.hasBad("xxbadxx");
		System.out.println(outcome2);
	}
	
	public boolean hasBad(String str)
	{
		
		boolean result = true;
		
		String subCharacter = str.substring(0, 1);
				
		System.out.println( subCharacter);
		
		if(subCharacter.equals("ba"))
		{
			result = true;
		}
			else
			{
				result = false;
			}
				
						
		return result;
	}
}


