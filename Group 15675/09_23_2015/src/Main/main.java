package Main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		/*
		System.out.print("Enter a number: ");
				
		int i = in.nextInt();
		
		System.out.print("Enter a number: ");
		
		int j = in.nextInt();
		*/
		
		
		int i = getNumber(in);
		
		int j = getNumber(in);
		
		System.out.println(addFormat(i, j));

	}
	
	// helper method to remove duplicate code
	public static int getNumber(Scanner input) {
		
		System.out.print("Enter a number: ");
		
		int result = input.nextInt();
		
		return result;
		
	}
	
	// helper method to format addition for printing
	public static String addFormat(int a, int b) {
		
		String s = new String();
		
		s = s + a;
		
		s = s + " + ";
		
		s = s + b;
		
		s = s + " = ";
		
		s = s + (a + b);
		
		return s;
		
	}

}
