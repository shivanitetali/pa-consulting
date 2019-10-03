package practice;

/**
 * Given a string of even length, return a string made of the middle two chars, so the string "string" yields
 * "ri". The string length will be at least2.
 * 
 * middleTwo("string") "ri"
 * middleTwo("code") "od"
 * middleTwo("Practice") "ct"
 * @author tet19171871
 *
 */
public class Middle
{
	/**
	 * will divide the length of the string in half and then half -1 to get the char before half and
	 * then half +1 to get the char after half 
	 * @param str
	 * @return
	 */
	
		public String middleTwo(String str)
		{
				
			int length = str.length() / 2;
			
			String newString = str.substring(length -1, length + 1);
			
			return newString;
			
		}
		

}

