package Main;

public class loops {

	public static void main(String[] args) {
		
		System.out.println(prime(130));

	}
	
	public static String prime(int n) {
		
		String result = "";
		
		int counter = 0;
		
		boolean Prime;
		
		for(int i = 1; i < n; i++) {
			
			Prime = true;
			
			for(int j = i - 1; j > 1; j--) {
				
				if (i % j == 0) {
					
					Prime = false;
					break;
					
				}
				
			}
			
			if (Prime) {
				result += i + "\n"; // result = result + i + " ";
				counter++; // counter = counter + 1;
			}
			
		}
		
		result += "\nTotal: " + counter;
		
		return result;
				
	}
	
	

}
