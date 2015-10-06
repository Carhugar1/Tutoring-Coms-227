package Main;

import static org.junit.Assert.*;

import org.junit.Test;

public class main {

	// assertEquals( Expected Value, Actual Value);
	// assertEquals( " Message ", Expected Value, Actual Value);
	
	@Test
	public void Testing1() {
		assertEquals(100, 10 * 10);
	}
	
	@Test
	public void Testing2() {
		
		String s = "10 * 100";
		
		int i = 10;
		int j = 100;
		
		assertEquals(s, 1000, i * j); 
		
	}
	
	@Test
	public void Testing3() {
		
		String s = "Branden";
		
		assertTrue(s.equals("Branden"));
		
	}
	
	/*----------------------*/
	
	private boolean logic(boolean a, boolean b) {

		/*

		if ( a && b) {
			return false;
		}
		
		else if ( a && !b) {
			return true;
		}
		
		else if ( !a && b) {
			return true;
		}
		
		else {
			return true;
		}
		
		*/
		
		return !(a && b); // why does this work?
		
		//return a && b ? false : true; // another way to program it
		
	}
	
	@Test
	public void TestingLogicTT() {
		
		assertFalse("T, T = F", logic(true, true));
		
	}

	@Test
	public void TestingLogicTF() {
		
		assertTrue("T, F = T", logic(true, false));
		
	}
	
	@Test
	public void TestingLogicFT() {
		
		assertTrue("F, T = T", logic(false, true));
		
	}
	
	@Test
	public void TestingLogicFF() {
		
		assertTrue("F, F = T", logic(false, false));
		
	}

}
