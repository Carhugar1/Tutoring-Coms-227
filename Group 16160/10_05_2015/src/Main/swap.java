package Main;

public class swap {
	
	static int i;
	
	static int j;

	public static void main(String[] args) {
		
		i = 10;

		j = 20;
		
		System.out.println(i); // 10
		
		Swap(); // swaps i with j
		
		System.out.println(i); // 20
		
	}
	
	private static void Swap() {
		
		int temp = i;
		
		i = j;
		
		j = temp;		
		
	}

}
