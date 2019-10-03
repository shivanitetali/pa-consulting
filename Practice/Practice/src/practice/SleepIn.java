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
public class SleepIn 
{
	
	//variables
	private Boolean weekday = true;
	private Boolean vacation = true;
	
	public static void main(String[] args)
	
	{
		SleepIn SleepIn = new SleepIn();
		SleepIn.SleepIn();
	}
		
		public void SleepIn()
		{
			//The parameter weekday is true if it is a weekday,and the vacation is false 
			if (weekday == true || vacation == false )
			{
				System.out.println( "It is a Weekday");
			}
		
			else
			{
			System.out.println("We are not on a Vacation");
			}
			
			//The parameter weekday is false,and the vacation is true
			if (weekday == false && vacation == true )
			{
				System.out.println( " It is a not a Weekday");
			}
		
			else
			{
			System.out.println("We are on a Vacation");
			}
			
		}
		
}


