package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	/*
	 * a) Given an array of doubles, return the average.
	 */
	public static double average(double arr[]) {
		double sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum / arr.length;
		
	}
	
	
	
	/*
	 * b) Given a sentence, find and return the longest word.
	 */
	public static String longestWord(String input) {
		
		// quick check to make sure we have an actual sentence
		if (input.length() <= 1) {
			return input;
		}
		
		Scanner s = new Scanner(input);
		String longest, current;
		
		longest = s.next();
		
		// loop through all the words
		while (s.hasNext()) {
			
			current = s.next();
			
			// if we find a longer one it is now the longest
			if (longest.length() < current.length()) {
				
				longest = current;
				
			}
			
		}
		
		s.close(); // always close your Scanners
		
		return longest;
		
	}
	
	
	
	/*
	 * c) Given a string, return the string with all spaces and non-alphabetic characters replaced
	 * by the character ‘#’, e.g. “Hello, world!” becomes “Hello##world#” (You can use the
	 * static method Character.isAlphabetic(char c) to determine whether a given
	 * character is alphabetic.)
	 */
	public static String replacePound(String input) {
		String result = "";
		char c;
		
		for(int i = 0; i < input.length(); i++) {
			c = input.charAt(i);
			
			if (Character.isAlphabetic(c)) {
				result += c;
			}
			
			else {
				result += '#';
			}
			
		}
		
		return result;
	}
	
	
	
	/*
	 * d) Interest is added to the balance of a savings account each month. Write a method that,
	 * given an annual interest rate and an initial balance, determines how many months it takes
	 * for the balance to double.
	 */
	public static int monthsToDouble(double interestRate, int initialBalance) {
		int months;
		int currentBalance = initialBalance;
		
		for(months = 0; currentBalance < initialBalance * 2; months++) {
			currentBalance += (int) currentBalance * interestRate;
		}
		
		return months;
	}
	
	
	
	/*
	 * e) Given an ArrayList of Integers, determine whether they are in increasing order.
	 */
	public static boolean increasingOrder(ArrayList<Integer> arrLst) {
		
		for(int i = 1; i < arrLst.size(); i++) {
			if (arrLst.get(i) < arrLst.get(i - 1)) {
				return false;
			}
		}
		
		return true;
	}
	
	
	
	/*
	 * f) Given a string, return the index of the first vowel (or -1 if there are none).
	 */
	public static int firstVowel(String input) {
		int arr[] = { 'a', 'e', 'i', 'o', 'u' };
		int index;
		
		for(int i = 0; i < arr.length; i++) {
			index = input.indexOf(arr[i]);
			
			if(index != -1) {
				return index;
			}
		}
		
		return -1;
	}
	
	
	
	/*
	 * g) Given a string, determine whether any letter appears two or more times.
	 */
	public static boolean containsDuplicates(String input) {
		
		for(int i = 0; i < input.length(); i++) {
			
			if(i != input.indexOf(input.charAt(i))) {
				return false;
			}
			
		}
		
		return true;
	}
	
	
	
	/*
	 * h) Given an array of ints, reverse its contents (the method must modify the given array
	 * and returns void).
	 */
	public static void reverse(int arr[]) {
		int temp;
		
		for(int i = 0; i < arr.length/2; i++) {
			
			// swap the 0 and arr.length - 1 aka the i and arr.length - i - 1
			temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
			
		}
		
	}
	
	
	
	/*
	 * i) Given an array of integers, determine whether the array is a permutation of the numbers
	 * 0 through n – 1, where n is the length of the array. (A permutation means that each
	 * number appears exactly once.)
	 */
	public static boolean isPermutation(int arr[]) {
		ArrayList<Integer> arrLst = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			
			if (arr[i] < 0 || arr[i] > arr.length - 1) {
				return false;
			}
			
			else if (arrLst.contains(arr[i])) {
				return false;
			}
			
			else {
				arrLst.add(arr[i]);
			}
		}
		
		return true;
	}
	
	
	
	/*
	 * j) Given a number n, print out a reverse diagonal line of n stars:
	 * 
	 *       *
	 *      *
	 *     *
	 *    *
	 *   *
	 */
	public static void reverseDiagonalLine(int n) {
		
		for(int i = 0; i < n; i++) {
			
			for(int j = i + 1; j < n; i++) {
				
				System.out.print(" "); // space
				
			}
			
			System.out.println("*"); // star
			
		}
		
	}
	
	
	
	/*
	 * k) Given a 2D array of doubles, return a 1D array whose ith entry is the average of the ith
	 * column.
	 */
	public static double[] averageArray(double arr[][]) {
		double result[] = new double[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			result[i] = average(arr[i]); // we made average in 1 b)
		}
		
		return result;
	}
	
	
	
	/*
	 * l) Given a 2D array of ints, find the column with the maximum sum.
	 */
	
}
