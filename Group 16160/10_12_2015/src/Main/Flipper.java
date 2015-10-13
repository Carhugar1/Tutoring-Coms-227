package Main;

public class Flipper {

	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 4 };
		
		System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
		
		flip(arr);
		
		System.out.println("Flip it!");
		
		System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
		

	}
	
	private static void flip(int arr[]) {
		
		int j = arr.length - 1;
		
		for(int i = 0; i <= arr.length/2; i++) {
			
			swap(arr, i, j - i);			
			
		}
				
	}
	
	private static void swap(int arr[], int i, int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;		
		
	}

}
