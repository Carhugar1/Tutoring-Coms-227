package main;

public class main {

	public static void main(String[] args) {
		
		/*
		 * Today we talked about Classes and made our own
		 */
		
		
		// Variables
		// Type name
		// [Yellow] [y]
		Yellow y;
		
		
		// Using Constructors and the 'new' keyword
		// name = new Type()
		// [y] = new [Yellow]()
		y = new Yellow();
		
		
		// Using a Method
		// name.method(input);
		// [y].[set]([[String]"Sup"]);
		y.set("Sup");
		
		
		// Using another Method
		// System.out.println( [y].[get]() );
		System.out.println(y.get());
		
		// Multiply Yellow objects?
		Yellow y2;
		
		y2 = new Yellow();
		
		y2.set("hi");
		
		System.out.println(y2.get());
		
	}

}
