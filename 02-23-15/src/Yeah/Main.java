package Yeah;

import java.util.Scanner;

public class Main {
	
	/*
	 * We talked about how helper methods work and why they are useful.
	 * 
	 * Helper Methods take duplicated functionality out of the main and move it
	 * to another method that can be called whenever that functionality is needed.
	 * 
	 * In this code we took out the asking and retrieving of the number and moved
	 * it into the helper method. 
	 */
	public static void main(String[] args) {
		
		// Create the Scanner from the System.in
		Scanner in = new Scanner(System.in);
		
		/* this has created in the helper method
		// Ask the User for an input then scan for the input.
		System.out.print("Enter a Number: "); // prints "Enter a Number:" but doesn't return after (\n)
		int first = in.nextInt(); // get the next Integer
		*/
		int first = helperMethod(in); // replaced above with our helper method
		
		/* This has been created in the Helper Method
		// Ask the User for an input then scan for the input.
		System.out.print("Enter a Number: "); // prints "Enter a Number:" but doesn't return after (\n)
		int second = in.nextInt(); // get the next Integer
		*/
		int second = helperMethod(in); // replaced above with our helper method
		
		// Multiply the two numbers together and save the result
		int result = first * second;
		
		// give a good output for us to read
		System.out.println(first + " times " + second + " is " + result);
		
	}
	
	// Let get rid of the similar stuff with this helper method
	private static int helperMethod(Scanner scanner) {
		
		// Ask the User for an input then scan for the input.
		System.out.print("Enter a Number: "); // prints "Enter a Number:" but doesn't return after (\n)
		int first = scanner.nextInt(); // get the next Integer
		
		return first; // return that Integer
	}
	
	
}
