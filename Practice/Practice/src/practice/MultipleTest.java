package practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultipleTest 
{

	@Test
	public void testMultiplesOfFive()
	{
		Multiple multiple = new Multiple();
		int i = multiple.multiplesOfFive();
		assertEquals(multiple, i);
	}

}
