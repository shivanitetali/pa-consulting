package practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class LastDay1Test
{

	@Test
	public void testStringE()
	{
		LastDay1 LastDay1 = new LastDay1();	
		boolean outcome = LastDay1.stringE("Hello");
		
		assertEquals(true, outcome);
	}
	
	@Test
	public void testStringEHeelle()
	{
		LastDay1 LastDay1 = new LastDay1();	
		boolean outcome1 = LastDay1.stringE("Heelle");
		
		assertEquals(true, outcome1);
	}
	
	@Test
	public void testStringEHeelele()
	{
		LastDay1 LastDay1 = new LastDay1();	
		boolean outcome2 = LastDay1.stringE("Heelele");
		
		assertEquals(false, outcome2);
	}

}
