package practice;

/**
 * return true if the given string contains between 1 and 3 'e' chars.
 * 
 * stringE("Hello") true
 * stringE("Heelle") true
 * stringE("Heelele") false
 * @author tet19171871
 *
 */
public class LastDay1
{
	public boolean stringE(String str)
	{
		boolean result = false;
		int count = 0;
		
		for(int index = 0; index < str.length(); index++)
		{
			char e = str.charAt(index);
			//System.out.println(index);
			
			if(e == 'e')
			{
				count++;
			}
			
			if(count > 0 && count < 4)
			{
				result = true;
			}
			else
			{
				result = false;
			}
			
		}
		System.out.println(str);
		System.out.println(count);
		System.out.println(result);
		//only one return in a method
		return result;
		
	}
	
}