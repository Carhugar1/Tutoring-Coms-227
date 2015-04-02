package Main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		System.out.println("Enter two integers : ");
		Scanner in = new Scanner(System.in);
		
		int number1 = in.nextInt(); // change the numbers as you wish
		int number2 = in.nextInt(); // ^
		
		System.out.println("The GCF of " + number1 + " and " + number2 + " is equal to " + commonFactor(number1, number2));

	}
	
	/**
	 * Return the greatest common factorm between two numbers
	 * @param number1
	 * @param number2
	 * @return
	 */
	public static int commonFactor(int number1, int number2) {
		
		if (number1 == number2) {
			return number1;
		}
		
		int lowest = lowest(number1, number2);
		int highest = highest(number1, number2);
		
		for (int i = lowest; i > 0; i--) {
			
			if (highest % i == 0) {
				
				if (lowest % i == 0) {
					
					return i;
					
				}
				
			}
			
		}
		
		return 1;
		
	}
	
	/**
	 * Returns the lower of the two numbers
	 * @param number1
	 * @param number2
	 * @return
	 */
	private static int lowest(int number1, int number2) {
		
		if (number1 > number2) {
			return number2;
		}
		
		else {
			return number1;
		}
		
	}
	
	/**
	 * Returns the higher of the two numbers
	 * @param number1
	 * @param number2
	 * @return
	 */
	private static int highest(int number1, int number2) {
		
		if (number1 > number2) {
			return number1;
		}
		
		else {
			return number2;
		}
		
	}

}
