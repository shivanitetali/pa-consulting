package practice;

/**
 * The parameter weekday is true if it is a weekday, 
 * and the parameter vacation is true
 * if we are on vacation.
 * We sleep in if it is not a weekday or
 * we're on vacation.
 * Return true if we sleep in.
 * 
 * sleepIn(false, false) is true
 * sleepIn(true, false) is false
 * sleepIn(false, true) is true
 * 
 * Given a non-empty string and an int n,
 * return a new string where the char at 
 */
public class Vacation
{
 
	public static void main(String[] args)
	{
		//instance 
		Vacation vacation = new Vacation();
		//pass the value of the method signature in the methods here
		boolean sleepIn = vacation.sleepIn(false, false);
		System.out.println(sleepIn);
		
		boolean sleepIn1 = vacation.sleepIn(true, false);
		System.out.println(sleepIn1);
		
		boolean sleepIn2 = vacation.sleepIn(false,true);
		System.out.println(sleepIn2);
		
	}
	
		//pass the method signature to the value you want to be printed boolean to see if sleepIn or not
		public boolean sleepIn(boolean weekday, boolean vacation)
		{
			System.out.println("Weekday: " + weekday);
			System.out.println("Vacation: " + vacation);
		
			boolean result = true;
			
			if (!weekday || vacation)
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
