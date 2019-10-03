package practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingTest 
{

	/**
	 * this test will call the method 'concatenate' from class 'Greeting',concatenate Hello and Bob, and return Hello Bob!
	 */
	@Test
	public void testConcatenateHelloBob()
	{
		//calling the method concatenate from class StringCat
		String result = Greeting.concatenate("Bob");
				
		assertEquals("Hello Bob!",result);
	}
	
	/**
	 * this test will call the method 'concatenate' from class 'Greeting',concatenate Hello and Alice, and return Hello Alice!
	 */
	@Test
	public void testConcatenateHelloAlice()
	{
		//calling the method concatenate from class StringCat
		String result = Greeting.concatenate("Alice");
				
		assertEquals("Hello Alice!",result);
	}
	
	/**
	 * this test will call the method 'concatenate' from class 'Greeting',concatenate Hello and X, and return Hello X!
	 */
	@Test
	public void testConcatenateHelloX()
	{
		//calling the method concatenate from class StringCat
		String result = Greeting.concatenate("X");
				
		assertEquals("Hello X!",result);
	}

}
