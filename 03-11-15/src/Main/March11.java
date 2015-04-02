package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class March11 {
	
	/*
	 * We talked about arrays and file inputs
	 * Arrays are really useful when working with lots of numbers
	 * and we can read from a file using Scanner!
	 */

	public static void main(String[] args) {
		// ARRAYS!
		
		int a1 = 11;
		int a2 = 12;
		// ...
		int a10 = 20;
		// the above is really long lets make an array
		
		// make an array
		// 			0	1	2	3	4	5	6	7	8	9
		int a[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		
		// how to make an array and set the size
		// type varibleName[] = new type[];
		
		// System.out.println(a[4]);
		
		File hi = new File("hi.txt");
		
		//System.out.println(readFile(hi));
		String sArray[] = readFile(hi);
		
		printArray(sArray);
		
	}
	
	
	/**
	 * Returns the first word of every sentence.
	 * @param input
	 * @return
	 */
	private static String[] readFile(File input) {
		
		Scanner in = null;
		Scanner sline = null;
		
		String result[] = new String[20];
		
		String line;
		
		try {
			in = new Scanner(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		for(int i = 0; in.hasNextLine(); i++) {
			
			line = in.nextLine();
			
			sline = new Scanner(line);
			
			result[i] = sline.next();
			
		}
 		
		sline.close();
		in.close();
		
		return result;
		
	}
	
	/**
	 * Prints out the elements of a String array
	 * @param array
	 */
	private static void printArray(String array[]) {
		
		for(int i = 0; i < array.length ; i++) {
			
			System.out.println("[" + i + "] : " + array[i]);
			
		}
		
	}
	
}
