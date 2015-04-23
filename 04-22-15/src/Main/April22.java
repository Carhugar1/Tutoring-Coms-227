package Main;

import java.io.File;

public class April22 {

	/*
	 * Recursive Methods!
	 * 
	 * Recursion() -> Recursion() -> Recursion() -> Recursion()
	 * 
	 * Recursion is doing the same process over and over until you get to some stopping point.
	 * 
	 * (http://en.wikipedia.org/wiki/Recursion)
	 * The term is also used more generally to describe a process of repeating objects in a self-similar way.
	 */
	public static void main(String[] args) {
		
		System.out.println(twoPowerX(2));
		
		System.out.println(twoPowerX(10));
		
		File f = new File("C:/Program Files");
		
		System.out.println(items(f));
	

	}
	
	
	/**
	 * Recursive method that returns 2 to the power of x
	 * @param x - The power we want
	 * @return 2^x
	 */
	public static int twoPowerX(int x) {
		
		// 2^x = 2 * 2^(x-1)
		// 2^1 = 2 * 2^0
		// 2^0 = 2 * 2^(-1)
		
		if (x == 1){
			return 2;
		}
		
		else {
			return 2 * twoPowerX(x-1);
		}
		
	}
	
	/**
	 * How many files are inside my file f
	 */
	public static int items(File f){
		
		if (!f.isDirectory()) {
			
			return 1;
			
		}
		
		else {
			
			File d[] = f.listFiles();
			
			int result = 1;
			
			for (int i = 0; i < d.length; i++) {
				
				result += items(d[i]);
				
			}
			
			return result;
			
		}
		
	}

}
