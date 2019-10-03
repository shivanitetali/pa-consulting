package practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class LengthTest
{

	@Test
	public void testMiddleThree()
	{
		Length length = new Length();		
		String outcome = length.middleThree("Candy");
		assertEquals("and", outcome);	
	}
	
	@Test
	public void testMiddleThreeand()
	{
		Length length = new Length();		
		String outcome = length.middleThree("and");
		assertEquals("and", outcome);	
	}
	
	@Test
	public void testMiddleThreeandsolving()
	{
		Length length = new Length();		
		String outcome = length.middleThree("solving");
		assertEquals("lvi", outcome);	
	}


}
