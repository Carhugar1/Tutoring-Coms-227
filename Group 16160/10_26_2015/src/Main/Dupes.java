package Main;

public class Dupes {

	public static void main(String[] args) {
		
		int arr[] = {0,1,2,2,3};
		
		int arr1[] = {1,1,1,1,1,1};
		
		System.out.println(print(getDupes(arr)));
		
		

	}
	
	// note the Array has to be sorted for this implementation to work right.
	public static int[] getDupes(int arr[]) {
		
		int result[] = new int[arr.length];
		
		for (int i = 1, j = 0; i < arr.length; i++) {
			
			if (arr[i] == arr[i - 1] && arr[i] != result[j]) {
				
				if (j != 0) j++;
				
				result[j] = arr[i];
								
			}
			
		}
		
		return result;
		
	}
	
	private static String print(int arr[]) {
		
		String result = "[";
		
		for (int i = 0; i < arr.length; i++) {
			
			//if (arr[i] != 0) {
			
				result += " " + arr[i];
				
			//}
			
		}
		
		result += " ]";
		
		return result;
		
	}

}
