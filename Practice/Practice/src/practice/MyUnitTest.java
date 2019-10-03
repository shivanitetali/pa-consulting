package practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyUnitTest 
{

	//below is the positive test case
	@Test
	public static void testConcatenate()
	{
		MyUnit myUnit = new MyUnit();
		String result = myUnit.concatenate("one", "two");
		assertEquals("onetwo", result);
	}

	//below is the positive test case
	@Test
	public static void testConcatenate1()
	{
		MyUnit myUnit = new MyUnit();
		String result = myUnit.concatenate("three", "four");
		assertEquals("threefour", result);
	}
	
	//below is the negative test case
	@Test
	public static void testConcatenate2()
	{
		MyUnit myUnit = new MyUnit();
		String result = myUnit.concatenate("three", "four");
		assertNotEquals("threefour", result);
	}
}
