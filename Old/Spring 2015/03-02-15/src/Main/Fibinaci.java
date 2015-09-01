package Main;

public class Fibinaci {
	
	/*
	 * We talked about the for loops and while loops using the Fibinaci Sequence as an example.
	 * We also talked about debugging.
	 */
	
	// for ( { pre loop } ; { conditional } ; { post loop } ) { body }
	// while ( { conditional } ) { body }
	
	// { pre loop }
	/* while () {
		body
		post loop
	}
	*/
	
	// Nth fibinaci number is equal to the n-1 + n-2 fibinaci number
	// 0th number is 0 and 1st is 1
	
	public static void main(String args[]) {
		
		fibinaciHelper(5);
		
	}
	
	/**
	 * Returns the N-th Fibinaci number starting at 2
	 * @param n
	 * @return
	 */
	public static void fibinaciHelper(int n) {
		
		/*
		int i = 2; // f2
		int fibN = 0;
		int minus1 = 1; // f1
		int minus2 = 0; // f0
		
		System.out.print("0 1");
		
		while (i <= n) { // n != i+1
			
			fibN = minus1 + minus2; // fn = fn-1 + fn-2
			System.out.print(" " + fibN); // print it out
			
			
			// Post loop
			minus2 = minus1;
			minus1 = fibN;
			i++;
		}
		*/
		
		System.out.print("0 1");
		
		int fibN = 0;
		int minus1 = 1; // f1
		int minus2 = 0; // f0
		
		for(int i = 2; i <= n; i++) {
			
			fibN = minus1 + minus2; // fn = fn-1 + fn-2
			System.out.print(" " + fibN); // print it out
			
			
			// Post loop
			minus2 = minus1;
			minus1 = fibN;
		}
		
	}
}
