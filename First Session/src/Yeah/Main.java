package Yeah;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		// Create the Scanner from the System.in
		Scanner in = new Scanner(System.in);
		
		/* this has created in the helper method
		// Ask the User for an input then scan for the input.
		System.out.print("Enter a Number: "); // prints "Enter a Number:" but doesn't return after (\n)
		int first = in.nextInt(); // get the next Integer
		*/
		int first = helperMethod(in);
		
		/* This has been created in the Helper Method
		// Ask the User for an input then scan for the input.
		System.out.print("Enter a Number: "); // prints "Enter a Number:" but doesn't return after (\n)
		int second = in.nextInt(); // get the next Integer
		*/
		int second = helperMethod(in);
		
		int result = first * second;
		
		System.out.println(first + " times " + second + " is " + result);
		
	}
	
	// Let get rid of the similar stuff.....
	private static int helperMethod(Scanner scanner) {
		
		// Ask the User for an input then scan for the input.
		System.out.print("Enter a Number: "); // prints "Enter a Number:" but doesn't return after (\n)
		int first = scanner.nextInt(); // get the next Integer
		
		return first;
	}
	
	
}
