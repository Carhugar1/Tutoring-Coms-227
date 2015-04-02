package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class March25 {
	
	/*
	 * We talked about the difference between ArrayLists and Arrays even though I used a bad example.
	 */

	// Array [] are a set size, hard to remove objects
	
	// ArrayLists<> are variable size, Memory Inefficient and rather slow.
	
	public static void main(String[] args) throws FileNotFoundException {
	
	File f1 = new File("Hi.txt");
	
	File f2 = new File("Hello.txt");
	
	File f3 = new File("DearGoodChap.txt");
	
	Scanner s1 = new Scanner(f1);
	
	Scanner s2 = new Scanner(f2);
	
	Scanner s3 = new Scanner(f3);
	
	ArrayList<Scanner> scans1 = new ArrayList<Scanner>();
	
	scans1.add(s1);
	scans1.add(s2);
	scans1.add(s3);
	
	helper1(scans1);
	
	Scanner scans2[] = new Scanner[3];
	
	s1 = new Scanner(f1);
	
	s2 = new Scanner(f2);
	
	s3 = new Scanner(f3);
	
	scans2[0] = s1;
	scans2[1] = s2;
	scans2[2] = s3;
	
	helper2(scans2);
	
	
	s1.close();
	s2.close();
	s3.close();
	
	
	}
	
	public static void helper1(ArrayList<Scanner> scan) {
		
		Scanner current;
		
		for(int i = 0; i < (scan.size() + 1); i++) {
			
			if (i < scan.size()) 
				current = scan.get(i);
			
			else
				current = scan.get(0); // */
		
		/*for (Scanner current : scan) { // */
			
			while(current.hasNext()) {
				
				System.out.print(current.next() + " ");
				
			}
			
			System.out.println("");
			
		}
		
	}
	
	public static void helper2(Scanner scan[]) {
		
		Scanner current;
		
		for(int i = 0; i < (scan.length + 1); i++) {
			
			if (i < scan.length) 
				current = scan[i];
			
			else
				current = scan[0]; // */ 
		
		/*for(Scanner current : scan) { // */
			
			while(current.hasNext()) {
				
				System.out.print(current.next() + " ");
				
			}
			
			System.out.println("");
			
		}
		
	}
	
}
