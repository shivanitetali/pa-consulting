package practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class MiddleTest
{

	/**
	 * will test if middle char is 'ri' from the word 'string'
	 */
	@Test
	public void testMiddleTwostring() 
	{
		Middle middle = new Middle();		
		String outcome = middle.middleTwo("string");
		assertEquals("ri", outcome);	
	}
	
	/**
	 * will test if middle char is 'od' from the word 'code'
	 */
	@Test
	public void testMiddleTwocode() 
	{
		Middle middle = new Middle();		
		String outcome1 = middle.middleTwo("code");
		assertEquals("od", outcome1);	
	}
	
	/**
	 * will test if middle char is 'ct' from the word 'Practice'
	 */
	@Test
	public void testMiddleTwoPractice() 
	{
		Middle middle = new Middle();		
		String outcome2 = middle.middleTwo("Practice");
		assertEquals("ct", outcome2);	
	}
	
	
}


