package Main;

import java.awt.Rectangle;

public class main {

	public static void main(String[] args) {
		
		/* Problem 1 */
		
		System.out.println("Problem 1");
		
		System.out.println(foo(2, 1)); // same as if we had an object x and did x.foo();
		
		System.out.println(foo(0, -1));
		
		System.out.println(foo(1, 1));
		
		/* end Problem 1*/
		
		
		
		
		/* Problem 2 */
		
		System.out.println("\nProblem 2");
		
			double x = 2.4;
			int j = 13;
			String w = "food";
			boolean goofy = false;
		
		/*
		 * 	Expression				Value				Type
		 * 	x > 0					true				boolean
		 * 	j / 3					4					int
		 * 	j % 3					1					int
		 * 	j + 1 = j				14					int
		 * 	j / 10.0				1.3					double
		 * 	w + w					"foodfood"			String
		 * 	j + 1 != j				true				boolean
		 * 	j + ""					"13"				String
		 * 	j.length()				error				error
		 * 	w.length()				4					int
		 */		
		
		System.out.println(x > 0);
		
		System.out.println(j / 3);
		
		System.out.println(j % 3);
		
		// System.out.println(j + 1 = j); // errors in the printing
		
		System.out.println(j / 10.0);
		
		System.out.println(w + w);
		
		System.out.println(j + 1 != j);
		
		System.out.println(j + "");
		
		// System.out.println(j.length()); // errors normally
		
		System.out.println(w.length());
		
		/* end Problem 2 */
		
		
		
		/* Problem 3 */
		
		// (a) boolean isOdd = (x %2 != 0);
		
		// (b) int fullCartons = eggCount / 12;
		
		// (c) int leftOver = eggCount % 12;
		
		// (d) char lastChar = str.charAt( str.length() - 1 )
		
		// (e) boolean areTheSameString = s1.equals(s2);
		
		// (f) boolean hasAtLeastFour = s.length() > 3;
		
		// (g) double totalValue = 0.0 + d + ( c / 100.0 )
		
		// (h) String s = "" + i;
		
		// (i) int i = d - ( d % 1 );
		
		/* end Problem 3 */
		
		
		
		/* Problem 4 */
		
		System.out.println("\nProblem 2");
		
		int a = 42;
		Rectangle rect = new Rectangle(10, 20, 30, 40); // (x, y, width, height)
		
		/**
		 * Memory 				| Values
		 * ---------------------+-------------------------------------
		 * rect					| >>>>>>>>> 			Rectangle
		 * 						|						x 		10
		 * 						|						y 		20
		 * 						|						width	30
		 * 						|						height	40
		 * 						|
		 * a					| 42
		 * ---------------------+-------------------------------------
		 */
		
		Rectangle rect2 = new Rectangle(2, 4, 6, 8);
		
		/**
		 * Memory 				| Values
		 * ---------------------+-------------------------------------
		 * rect2				| >>>>>>>>> 			Rectangle
		 * 						|						x 		2
		 * 						|						y 		4
		 * 						|						width	6
		 * 						|						height	8
		 * 						|
		 * rect					| >>>>>>>>> 			Rectangle
		 * 						|						x 		10
		 * 						|						y 		20
		 * 						|						width	30
		 * 						|						height	40
		 * 						|
		 * a					| 42
		 * ---------------------+-------------------------------------
		 */
		
		int b = a;
		
		/**
		 * Memory 				| Values
		 * ---------------------+-------------------------------------
		 * b					| 42
		 * 						|
		 * rect2				| >>>>>>>>> 			Rectangle
		 * 						|						x 		2
		 * 						|						y 		4
		 * 						|						width	6
		 * 						|						height	8
		 * 						|
		 * rect					| >>>>>>>>> 			Rectangle
		 * 						|						x 		10
		 * 						|						y 		20
		 * 						|						width	30
		 * 						|						height	40
		 * 						|
		 * a					| 42
		 * ---------------------+-------------------------------------
		 */
		
		Rectangle rect3 = rect;
		
		/**
		 * Memory 				| Values
		 * ---------------------+-------------------------------------
		 * rect3				| >>>>		 			--------------------\
		 * 						|											|
		 * b					| 42										|
		 * 						|											|
		 * rect2				| >>>>					Rectangle			|
		 * 						|						x 		2			|
		 * 						|						y 		4			|
		 * 						|						width	6			|
		 * 						|						height	8			|
		 * 						|											|
		 * rect					| >>>>		 			Rectangle		<---/
		 * 						|						x 		10
		 * 						|						y 		20
		 * 						|						width	30
		 * 						|						height	40
		 * 						|
		 * a					| 42
		 * ---------------------+-------------------------------------
		 */
		
		rect3.setSize(99, 40); // rect3.setWidth(99);
		
		/**
		 * Memory 				| Values
		 * ---------------------+-------------------------------------
		 * rect3				| >>>>		 			--------------------\
		 * 						|											|
		 * b					| 42										|
		 * 						|											|
		 * rect2				| >>>>					Rectangle			|
		 * 						|						x 		2			|
		 * 						|						y 		4			|
		 * 						|						width	6			|
		 * 						|						height	8			|
		 * 						|											|
		 * rect					| >>>>		 			Rectangle		<---/
		 * 						|						x 		10
		 * 						|						y 		20
		 * 						|						width	99
		 * 						|						height	40
		 * 						|
		 * a					| 42
		 * ---------------------+-------------------------------------
		 */
		
		rect2.setLocation(137, 4); // rect2.setX(137);
		
		/**
		 * Memory 				| Values
		 * ---------------------+-------------------------------------
		 * rect3				| >>>>		 			--------------------\
		 * 						|											|
		 * b					| 42										|
		 * 						|											|
		 * rect2				| >>>>					Rectangle			|
		 * 						|						x 		137			|
		 * 						|						y 		4			|
		 * 						|						width	6			|
		 * 						|						height	8			|
		 * 						|											|
		 * rect					| >>>>		 			Rectangle		<---/
		 * 						|						x 		10
		 * 						|						y 		20
		 * 						|						width	99
		 * 						|						height	40
		 * 						|
		 * a					| 42
		 * ---------------------+-------------------------------------
		 */
		
		b = b + 5;
		
		/**
		 * Memory 				| Values
		 * ---------------------+-------------------------------------
		 * rect3				| >>>>		 			--------------------\
		 * 						|											|
		 * b					| 47										|
		 * 						|											|
		 * rect2				| >>>>					Rectangle			|
		 * 						|						x 		137			|
		 * 						|						y 		4			|
		 * 						|						width	6			|
		 * 						|						height	8			|
		 * 						|											|
		 * rect					| >>>>		 			Rectangle		<---/
		 * 						|						x 		10
		 * 						|						y 		20
		 * 						|						width	99
		 * 						|						height	40
		 * 						|
		 * a					| 42
		 * ---------------------+-------------------------------------
		 */
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(rect.getWidth());
		
		

	}
	
	// Helper method given in Problem 1
	public static boolean foo(int x, int y) {
		
		boolean result = false;
		
		if (x > y) {
			
			if (y != 0) {
	
				result = true;
	
			}
	 
		}
	 
		if (x == 0) {
	 
			result = true;
	 
		}
	 
		return result;
	 
	}

}
