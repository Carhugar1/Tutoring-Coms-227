package main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		/*
		 * Today we talked about scanners and what makes them useful
		 */
		
		
		
		// Scanners are amazing
		// New Scanner( String )
		Scanner input = new Scanner("Tutoring Session, Group 15675");

		// returns the first word
		System.out.println(input.next());
		
		// returns the second word ( remove the spaces to get the number of words and such )
		System.out.println(input.next());
		
		// returns the third
		System.out.println(input.next());
		
		// returns the fourth
		System.out.println(input.next());
		
		// returns true if there is another word 
		System.out.println(input.hasNext());
		
		// New Scanner( inputBuffer )
		Scanner in = new Scanner(System.in);
		
		// ask for users name
		System.out.println("Put in your name:");
		
		// will wait for user to input text then print out.
		System.out.println(in.nextLine() +  " is crazy.");
		
		// ask the user for a number
		System.out.println("\nEnter a integer: "); // two spaces ln = \n too thus we have \n\n
		
		// get an integer
		int i = in.nextInt();
		
		// print out our conditional statement
		System.out.println(i < 5);
		
		if (i < 5) {
			System.out.println("less than 5");
		}
		
		/*if (i > 5) {
			System.out.println("greater than 5");
		}
		*/
		
		else {
			System.out.println("greater than or equal to 5");
		}
		
		// Scanners like to be closed, thus we add the close methods down here at the bottom
		input.close();
		in.close();
		
	}

}
