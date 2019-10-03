package practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColorsTest {

	/**
	 * will call class 'colour' and method 'seeColor' to test 
	 */
	@Test
	public void testSeeColor() 
	{	
		
		Colors color = new Colors();
		assertEquals(("red"),color.seeColor("redxx"));
	}

}
