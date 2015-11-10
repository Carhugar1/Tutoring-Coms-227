package Main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_2 {

	/*
	 * 2) Write a program that will remove all the //-style comments from a Java file. Your program
	 * should prompt the user to enter the name of the input file. The output file should have the same
	 * name as the input file but should end with the extension “.out” instead of “.java”. The output file
	 * should be the same as the input file except that all //-style comments are removed. (You can
	 * assume that the sequence “//” does not occur inside any String literals within the program.)
	 */
	public static void removeComments() throws FileNotFoundException {
		
		// User input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the name of the input file: ");
		
		String File = input.next();
		
		input.close(); // End the user input
		
		
		// New input from File
		input = new Scanner(File + ".java");
		
		// Output to File
		PrintWriter output = new PrintWriter(File + ".out");
		
		// start looping
		String s;
		
		while(input.hasNext()) {
			
			s = input.next();
			s.replace("//", "");
			
			output.print(s);
			
		}
		
		input.close();
		output.close();
	}
	
	
	
	// For testing
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
