package Main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
		System.out.println(findCopyCost(150));
		
		System.out.println(); // empty line for spacing
		
		helper();

	}
	
	public static double findCopyCost(int numCopies) {
		
		double total = 0;
		
		if(numCopies <= 10) { // 10 or less copies at .15 cents
			total = 0.15 * numCopies;
		}
		
		else if(numCopies <= ( 10 + 100 )) { // 10 at .15 and 100 or less at .12
			total = ( 0.15 * 10 ) + ( 0.12 * ( numCopies - 10 ) );
		}
		
		else { // 10 at .15 and 100 at .12 the rest at .08
			total = ( 0.15 * 10 ) + ( 0.12 * 100 ) + ( 0.08 * ( numCopies - 110 ) );
		}
		
		return total;
		
	}
	
	public static void helper() {
		
		System.out.print("How many eggs? ");
		
		Scanner in = new Scanner(System.in); 
		
		int eggs = in.nextInt(); // get the number of eggs
		
		
		System.out.print("Do you want brown eggs (yes/no)? ");
		
		String s = in.next(); // get the yes/no answer
		
		
		// how many do we have?
		int flats = eggs / 30; // note: 2 dozen + 1 half = 1 flat
		
		int dozens = (eggs % 30) / 12; // note: 2 halfs = 1 dozen
		
		int halfs = ((eggs % 30) % 12) / 6; // note: 6 eggs = 1 half
		
		int remainder = (((eggs % 30) % 12) % 6); // left over eggs?
		
		if ( remainder > 0) { // we need our number or more eggs
			halfs += 1;
		}
		
		if ( halfs == 2 ) { // 2 halfs = 1 dozen
			
			halfs = 0;
			dozens += 1;
			
		}
		
		if ( dozens == 2 && halfs == 1) { // 2 dozen + 1 half = 1 flat
			
			halfs = 0;
			dozens = 0;
			flats += 1;
			
		}
		
		
		// print
		System.out.println(flats + " flats");
		System.out.println(dozens + " dozens");
		System.out.println(halfs + " half dozens");
		
		
		// calculate the price
		double price = 0.0;
		
		price = flats * 6.50;
		
		price += dozens * 3.00;
		
		price += halfs * 2.00;
		
		
		// brown eggs?
		if(s.equals("yes")) {
			
			price = price * 1.2; // 20% more
			
		}
		
		// print
		System.out.println("Price " +  price);
		
	}

}
