package practice;

public class MethodExamples
{

	public static void main(String[] args)
	{
		MethodExamples methodExamples = new MethodExamples();
		//gives me access to all the methods we will be calling in an instance
		//left side is the instance and calling a method on the right side
		boolean outcome = methodExamples.returnSomething();
		
		System.out.println(("the outcome was : " + outcome));

	}
	
	//cannot put void and say return, as void doesn't return anything
	//public void returnSomething()
	//so need to put boolean as return
	public boolean returnSomething()
	{
		//local variable passing the information to the main method,the value in the boolean is passed to the boolean in the main method and prints the result on the console
		boolean result = true;
		//return information goes back to main method and prints from the main
		return result;
	}

}

