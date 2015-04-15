package Main;

public class main {
	
	/*
	 * We talked about for loops and how to use them.
	 * We worked through a problem and how to use the for loop to do it.
	 */

	public static void main(String[] args) {
		// We want to make a method that can swap letters out of a string
		
		String happy = "Happy birthday to you, happy birthday to you, "
				+ "happy birthday [INSERT NAME HERE].... happy birthday to you";
		
		String haggy = letterReplace(happy, 'h', 'f');
		haggy = letterReplace(haggy, 'H', 'F');
		
		System.out.println(happy + "\n" + haggy);

	}
	
	/**
	 * Takes in a input String and the character to be replaced 
	 * as well as the character we want to replace it with.
	 * @param input
	 * @param replace
	 * @param replaceBy
	 * @return
	 */
	public static String letterReplace(String input, char replace, char replaceBy) {
		
		String result = "";
		
		for(int i = 0; i < input.length(); i++) {
			
			if (input.charAt(i) == replace) {
				
				result += replaceBy;
				
			}				
			
			else {
				
				result += input.charAt(i);
				
			}
			
		}
		
		return result;
		
	}
}
