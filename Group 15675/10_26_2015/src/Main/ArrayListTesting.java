package Main;

import java.util.ArrayList;

public class ArrayListTesting {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,3,4};
		
		int arr1[] = {1,1,1,1,1};
		
		int arr2[] = {1,1,2,2,3,3,4};
		
		System.out.println(getDupilacates(arr2));

	}
	
	private static ArrayList<Integer> getDupilacates( int arr[] ) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i = 1, j = 0; i < arr.length; i++) {
			
			if (arr[i] == arr[i - 1] && !result.contains(arr[i])) {
				
				result.add(arr[i]);	
				
				j++;
				
			}			
			
		}
		
		return result;
		
	}

}
