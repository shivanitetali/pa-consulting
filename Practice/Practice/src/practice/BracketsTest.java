package practice;

import static org.junit.Assert.*;
/**
 * will test if the conditions given will pass
 */

import org.junit.Test;

public class BracketsTest
{

	/**
	 * will test if the string contains "[()]"
	 */
	@Test
	public void testInputBalanced()
	{
		String result = Brackets.balancedBrackets("[()]");
		
		assertEquals("Balanced",result);
		
	}
	
	/**
	 * will test if the string contains "{()}"
	 */
	@Test
	public void testInputBalanced1()
	{
		String result = Brackets.balancedBrackets("{()}");
		
		assertEquals("Balanced",result);
		
	}
	
	/**
	 * will test if the string contains "[]{}()"
	 */
	@Test
	public void testInputBalanced2()
	{
		String result = Brackets.balancedBrackets("[]{}()");
		
		assertEquals("Balanced",result);
		
	}
	
	/**
	 * will test if the string contains "[)[)"
	 */
	@Test
	public void testInputBalanced3()
	{
		String result = Brackets.balancedBrackets("[)[)");
		
		assertEquals("Not Balanced",result);
		
	}
	
	/**
	 * will test if the string contains "()]()"
	 */
	@Test
	public void testInputBalanced4()
	{
		String result = Brackets.balancedBrackets("()]()");
		
		assertEquals("Not Balanced",result);
		
	}

}
