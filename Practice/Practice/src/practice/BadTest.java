package practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class BadTest
{

	@Test
	public void testHasBadbadxx()
	{
		Bad bad = new Bad();
		
		boolean outcome = bad.hasBad("badxx");
		
		assertEquals(true, outcome);
	}
	
	@Test
	public void testHasBadxbadxx()
	{
		Bad bad = new Bad();
		
		boolean outcome = bad.hasBad("xbadxx");
		
		assertEquals(true, outcome);
	}
	
	@Test
	public void testHasBadxxbadxx()
	{
		Bad bad = new Bad();
		
		boolean outcome = bad.hasBad("xxbadxx");
		
		assertEquals(true, outcome);
	}

}
