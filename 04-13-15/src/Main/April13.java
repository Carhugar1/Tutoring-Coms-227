package Main;

public class April13 {

	/* 
	 * So we are going to do some practice working with such arrays. First off we need to construct
	 * a function that will return a complete 2d array with the properly filled out multiplication table up
	 * till the number specified.
	 * So if given 2 the function should return a 2x2 array with the completed multiplication table for
	 * 2 where (1,1) is holding 2 x 2 = 4.
	 */
	// static added
	public static int[][] multiplicationTable( int size ) {
		// Your code here
		
		int a[][] = new int[size][size];
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[i].length; j++) {
				
				a[i][j] = ((i + 1) * (j + 1));
				
			}
			
		}
		
		return a;
	} // end bracket for multiplicationTable()
	
	
	/*
	 * Next we need to be able to print out this table. Please construct a function that will print out a
	 * 2d array in the form:
	 * number (tab) number (tab) number
	 * number (tab) number (tab) number
	 * For the size n, m. Note: Use println() in spot for system.out.println()
	 */
	// static added
	public static void print2d( int array[][] ) {
		// Your code here
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
				
				System.out.print(array[i][j] + "\t");
				
			}
			
			System.out.print("\n");
			
		}
		
	} // end bracket for print2d()
	
	
	/*
	 * Now that we have a way to print out please write down what the following code will print out.
	 */
	
	public static void main(String args[]) {
		
		int array[][];
		
		array = multiplicationTable(5);
		
		print2d( array );
		
	} // end main()

}
