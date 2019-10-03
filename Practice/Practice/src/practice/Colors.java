package practice;

/**
 * Given a string, if the string begins with "red" or "blue" return that colour string, otherwise return the empty string.
 * seeColor("redxx") "red"
 * seeColor("xxred") ""
 * seeColor("blueTimes") "blue"
 * 
 * @author tet19171871
 *
 */
public class Colors 
{
	public String seeColor(String color)
	{
	
		//variable declared in the method
		//String colour = "";
		
		if(color.startsWith("red"))
		{
			color = "red";
		}
		else if(color.startsWith("blue"))
		{
			color = "blue";
		}

		else 
		{
			color = "";
		}
		
		System.out.println(color);
		return color;
	}
	
}
