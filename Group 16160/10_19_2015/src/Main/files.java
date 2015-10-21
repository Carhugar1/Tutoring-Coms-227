package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class files {

	public static void main(String[] args) throws Exception {
		File f = new File("helper.txt");
		File f2 = new File("even.txt");
		
		System.out.println(findSmallest(f));
		
		System.out.println(containsOdd(f));
		
		System.out.println(containsOdd(f2));
		
	}

	private static int findSmallest(File f) throws FileNotFoundException {
		Scanner in = new Scanner(f);
		
		int min = in.nextInt();
		
		int current;
		
		while(in.hasNext()) {
			
			current = in.nextInt();
			
			if (current < min) {
				
				min = current;
				
			}
			
		}
		
		in.close();
		
		return min;		
		
	}
	
	private static boolean containsOdd(File f) throws FileNotFoundException {
		
		Scanner in = new Scanner(f);
		
		while(in.hasNextInt()) {
			
			if (in.nextInt() % 2 == 1) {			
			
				in.close();
				
				return true;
				
			}
		}
		
		in.close();
		
		return false;
		
	}
	
	

}
