package practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCatTest 
{

	@Test
	public void testConcatenate() 
	{
		//calling the method concatenate from class StringCat
		String result = StringCat.concatenate("string100", "string200");
		
		assertEquals("string100string200",result);
		
	}

}
