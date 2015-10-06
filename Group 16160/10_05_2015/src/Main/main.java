package Main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Exclusive or logic\n");
		
		Scanner input = new Scanner(System.in);
		
		// get the first input
		boolean a = helper(input);
		
		// get the second input
		boolean b = helper(input);
		
		System.out.println(); // just an empty line
		
		if (a == b) {
			
			System.out.println("False");
			
		}
		
		else {
			
			System.out.println("True");
			
		}

	}
	
	
	private static boolean helper(Scanner scanner) {
		
		System.out.print("Enter True or False: ");
		
		String result = scanner.next();
		
		if (result.equals("True")) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
	}

}
