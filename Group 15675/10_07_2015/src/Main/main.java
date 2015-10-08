package Main;

import static org.junit.Assert.*;

import org.junit.Test;

public class main {

	@Test
	public void TestingPow1() {
		
		assertEquals(10, pow(10, 1)); // 10^1 = 10
		
	}
	
	@Test
	public void TestingPow0() {
		
		assertEquals(1, pow(100, 0)); // 100^0 = 1
		
	}
	
	@Test
	public void TestingPow2() {
		
		assertEquals(100, pow(10, 2)); // 10^2 = 100
		
	}
	
	@Test
	public void TestingPow2_10() {
		
		assertEquals(1024, pow(2, 10)); // 2^10 = 1024
		
	}
	
	
	public static int pow (int i, int j) {
		
		int result = 1;
		
		System.out.println(j + " | " + result); // first print
		
		// while ( conditional ) { body } // while the condition is true do the body
		
		while(j > 0) {
			
			result = result * i; // 1 * i or i * i ..... * i
			
			j--; // j = j - 1;
			
			System.out.println(j + " | " + result);
			
		}
		
		System.out.println(); // nice spacing
		
		return result;
		
	}

}
