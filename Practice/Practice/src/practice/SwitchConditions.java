package practice;

public class SwitchConditions 
{
	//switch conditions prints the day defined in the variable int day , if 5, will print whats in case 5
	public static void main (String[] args)
	{
		SwitchConditions switchConditions = new SwitchConditions();
		
		switchConditions.StatementSwitch();
				
		int day = 0;
		switch (day)
		{
			case 1:
				System.out.println("Monday");
	    	    break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
			//always prints whatever is in the default even if the condition is not met	
			default:
				System.out.println("looking forward to the weekend always");
		}

	}
	
	public void StatementSwitch()
	{
		String day = "Monday";
		switch (day)
		{
		case "Monday":
			System.out.println("Monday");
    	    break;
		case "Tuesday":
			System.out.println("Tuesday");
			break;
		case "Wednesday":
			System.out.println("Wednesday");
			break;
		case "Thursday":
			System.out.println("Thursday");
			break;
		case "Friday":
			System.out.println("Friday");
			break;
		case "Saturday":
			System.out.println("Saturday");
			break;
		case "Sunday":
			System.out.println("Sunday");
		//always prints whatever is in the default even if the condition is not met	
		default:
			System.out.println("looking forward to the weekend alwayzzzz");
    	 
		}
		
	}
	
}
