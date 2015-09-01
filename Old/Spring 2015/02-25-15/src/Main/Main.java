package Main;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class Main {
	
	/*
	 * We talked about how jUnits work and how to use them, as well as talked about If statements
	 * 
	 * jUnits are test cases that are programmed and can be ran whenever you need to test your code
	 * 
	 * the usual test is the assertEquals() which takes in a left hand side and a right hand side and compares them
	 * the left hand side is what the value should be
	 * the right hand side is what the value actually comes out as
	 * 
	 * you can also add a error message to help yourself remember what is actually happening within the test
	 * 
	 * assertEquals(What the value should be, what the Value actually comes out to be);
	 * assertEquals("Message" , ..... );
	 * 
	 * We looked at all the key words for jUnits
	 * @Before This method is executed before each @Test. It is used to prepare the test environment.
	 * @Test this is the place where your test go.
	 * @Ignore will ignore the next test case, useful when your tests are given to you and you need to test only certain parts while you develop your code.
	 * 
	 * finally we talked about if statements and how they are laid out
	 * 
	 * if ()
	 * else if ()
	 * ....
	 * else if ()
	 * else 
	 * 
	 * Only one if statement can be stopped on, thus if the if statement stops on the if the else if's and the else never happen.
	 */
	
	public boolean abool = false;

	@Before // This method is executed before each @Test. It is used to prepare the test environment.
	public void Setup() {
		abool = true;
	}	
	
	// assertEquals(What the value should be, what the Value actually comes out to be);
	// assertEquals("Message" , ..... );
	
	@Ignore // will ignore the next test case 
	@Test
	public void TestMutiplicationNegative(){
		assertEquals("-10 * -10", 100, timesItsSelf(-10)); // method bugged
	}
	
	@Test 
	public void TestMultiplicationPositive() {
		assertEquals("10 * 10", 100, timesItsSelf(10));
	}
	
	@Test
	public void BooleanTest() {
		assertTrue("False?", abool); // variation of the assertEquals for more info go to http://junit.org/javadoc/latest/index.html
	}
	
	@Test
	public void RandomMethodTestEven() {
		assertEquals("Number supposed to be Even", 12, RandomMethod(48));
	}
	
	@Test
	public void RandomMethodTestOdd() {
		assertEquals("Number supposed to be Odd", 14, RandomMethod(13));
	}
	
	
	/* Under is some Methods to test on */
	
	// returns a number times its self
	public int timesItsSelf(int number) {
		if (number < 0) {
			return -1 * number * number; // -1? coding bug? Found with test cases
		}
		
		else {
			return number * number;
		}
	}
	
	// Take in a number and return the number / 4 if its even if not return number + 1
	public int RandomMethod(int number) {
		
		if ((number % 2) == 0) {
			number = number / 4;
		}
		
		else {
			number += 1;	
		}
		
		return number;
		
	}
	
	
	
	
	
}
