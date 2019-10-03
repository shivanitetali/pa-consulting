package practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class PickingLettersTest
{

	@Test
	public void testEveryNth()
	{
		PickingLetters pickingLetters = new PickingLetters();
		String outcome = pickingLetters.everyNth("Miracle", 2);
		assertEquals("Mrce", outcome);
	}
	
	@Test
	public void testEveryNth1()
	{
		PickingLetters pickingLetters = new PickingLetters();
		String outcome1 = pickingLetters.everyNth("abcdefg", 2);
		assertEquals("aceg", outcome1);
	}
	
	@Test
	public void testEveryNth2()
	{
		PickingLetters pickingLetters = new PickingLetters();
		String outcome2 = pickingLetters.everyNth("abcdefg", 3);
		assertEquals("adg", outcome2);
	}

}
