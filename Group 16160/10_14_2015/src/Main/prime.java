package Main;

public class prime {

	public static void main(String[] args) {
		
		int arr[] = prime(125);
		
		Print(arr);

	}
	
	private static int[] prime(int n) {
		
		int arr[] = new int[n]; // new array of size n
		
		boolean isPrime; // is it Prime?
		
		int count = 0;
		
		for(int i = 1; i <= n; i++) {
			
			isPrime = true; // assume it is prime until otherwise proven
			
			for(int j = 2; j < i; j++) {
				
				if (i % j == 0) { // if its = 0 then i is divisible by j
					
					isPrime = false;
					break;
					
				}
				
			}
			
			if (isPrime) {
				arr[count] = i;
				count++;
			}
			
		}
		
		return arr;
		
	}
	
	private static void Print(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == 0) {
				
				break;
				
			}
			
			else {
				
				System.out.println(arr[i]);
				
			}
			
		}
		
	}

}
