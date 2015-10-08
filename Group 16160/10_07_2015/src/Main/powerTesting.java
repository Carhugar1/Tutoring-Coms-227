package Main;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class powerTesting {
	
	int i;
	
	@Before
	public void before() {
		
		i = 10;
		
	}
	
	@Test
	public void testingPow2() {
		
		i = i * i; // 100
			
		assertEquals(i, pow(10,2));
			
	}
	
	@Test
	public void testingPow1() {
			
		assertEquals(i, pow(10,1));
			
	}
	
	
	
	private static int pow(int i, int j) {
		
		int result = 1;
		
		while (j >= 1) {
			
			result = result * i;
			
			j = j - 1;
			
		}
		
		return result;
		
	}

}
