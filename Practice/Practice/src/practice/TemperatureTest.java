package practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemperatureTest 
{

	@Test
	public void testIcyHot() 
	{
		Temperature temperature = new Temperature();
		boolean outcome = temperature.icyHot(120, -1); 
		assertEquals(true, outcome);
		
	}

	@Test
	public void testIcyHot1() 
	{
		Temperature temperature = new Temperature();
		boolean outcome1 = temperature.icyHot(-1, 120);
		assertEquals(true, outcome1);
		
	}
	
	@Test
	public void testIcyHo2() 
	{
		Temperature temperature = new Temperature();
		boolean outcome2 = temperature.icyHot(2, 120);
		assertEquals(false, outcome2);
		
	}
}
